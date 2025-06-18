pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean install -DskipTests'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Archive') {
            steps {
                archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
            }
        }

        stage('Deploy') {
            steps {
                script {
                    def jarFiles = findFiles(glob: 'target/*.jar').findAll { !it.name.contains('original') }

                    if (jarFiles.isEmpty()) {
                        error "❌ No valid JAR file found to deploy"
                    }

                    def jarPath = jarFiles[0].path
                    echo "🚀 Deploying JAR: ${jarPath}"
                    bat "java -jar ${jarPath}"
                }
            }
        }
    }

    post {
        success {
            echo '✅ Jenkins pipeline completed successfully!'
        }
        failure {
            echo '❌ Jenkins pipeline failed.'
        }
    }
}

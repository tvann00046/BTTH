package com.example.cicddemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return """
            <!DOCTYPE html>
            <html lang="vi">
            <head>
                <meta charset="UTF-8">
                <title>Chào mừng</title>
                <style>
                    body {
                        margin: 0;
                        padding: 0;
                        height: 100vh;
                        display: flex;
                        justify-content: center;
                        align-items: center;
                        background: linear-gradient(135deg, #74ebd5, #ACB6E5);
                        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
                    }
                    .container {
                        text-align: center;
                        background-color: white;
                        padding: 40px;
                        border-radius: 15px;
                        box-shadow: 0 8px 16px rgba(0,0,0,0.2);
                    }
                    h1 {
                        color: #333;
                        font-size: 28px;
                        margin-bottom: 30px;
                    }
                    button {
                        background-color: #007BFF;
                        color: white;
                        border: none;
                        padding: 12px 24px;
                        font-size: 16px;
                        border-radius: 8px;
                        cursor: pointer;
                        transition: background-color 0.3s ease;
                    }
                    button:hover {
                        background-color: #0056b3;
                    }
                </style>
            </head>
            <body>
                <div class="container">
                    <h1>Chào mừng bạn đến với Công Ty TNHH 1 Thành Viên của ĐTV</h1>
                    <button onclick="alert('Chúc bạn mua sắm vui vẻ!')">OK</button>
                </div>
            </body>
            </html>
        """;
    }
}

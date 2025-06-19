package com.example.cicddemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
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
                        font-size: 26px;
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
                    <h1>Chào mừng bạn đến với Công ty TNHH "Một Thành Viên" của ĐTV</h1>
                    <button onclick="window.location.href='/gioithieu'">OK</button>
                </div>
            </body>
            </html>
        """;
    }

    @GetMapping("/gioithieu")
    public String gioiThieu() {
        return """
            <!DOCTYPE html>
            <html lang="vi">
            <head>
                <meta charset="UTF-8">
                <title>Giới thiệu</title>
                <style>
                    body {
                        margin: 0;
                        padding: 0;
                        min-height: 100vh;
                        display: flex;
                        justify-content: center;
                        align-items: center;
                        background: linear-gradient(135deg, #74ebd5, #ACB6E5);
                        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
                    }
                    .content {
                        max-width: 800px;
                        background-color: white;
                        padding: 30px;
                        border-radius: 10px;
                        box-shadow: 0 4px 10px rgba(0,0,0,0.1);
                        text-align: center;
                    }
                    h2 {
                        color: #007BFF;
                    }
                    button {
                        background-color: #28a745;
                        color: white;
                        border: none;
                        padding: 10px 20px;
                        font-size: 16px;
                        border-radius: 8px;
                        cursor: pointer;
                        margin-top: 30px;
                        transition: background-color 0.3s ease;
                    }
                    button:hover {
                        background-color: #1e7e34;
                    }
                </style>
            </head>
            <body>
                <div class="content">
                    <h2>Giới thiệu về Công ty TNHH "Một Thành Viên" của ĐTV</h2>
                    <p>Công ty TNHH Một Thành Viên ĐTV chuyên cung cấp các sản phẩm và dịch vụ chất lượng cao cho khách hàng trong và ngoài nước.</p>
                    <p>Với phương châm "Uy tín - Chất lượng - Tận tâm", chúng tôi luôn nỗ lực cải tiến, đổi mới và mang lại giá trị tốt nhất cho cộng đồng.</p>
                    <p>Trụ sở: 282 Kim Giang, Quận Hoàng Mai, TP. Hà Nội</p>
                    <p>Liên hệ: hd4047588@gmail.com | 0359977983</p>
                    <button onclick="window.location.href='/'">Quay về trang chủ</button>
                </div>
            </body>
            </html>
        """;
    }
}

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/templates/main.css">
</head>
<body>
<div class="noi-dung">
    <div class="form">
        <h2>Trang Đăng Nhập</h2>
        <form action="">
            <div class="input-form">
                <span>Tên Người Dùng</span>
                <input type="text" name="">
            </div>
            <div class="input-form">
                <span>Mật Khẩu</span>
                <input type="password" name="">
            </div>
            <div class="nho-dang-nhap">
                <label><input type="checkbox" name=""> Nhớ Đăng Nhập</label>
            </div>
            <div class="input-form">
                <input type="submit" value="Đăng Nhập">
            </div>
        </form>
    </div>
</div>
</body>
</html>
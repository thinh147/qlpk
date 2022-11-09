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
        <form action="${pageContext.request.contextPath}/buong" method="get">
            <button>Đăng ký y tá</button>
        </form>
    </div>
</div>
</body>
</html>
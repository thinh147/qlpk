<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*" %>
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
        <form action="${pageContext.request.contextPath}/dang-nhap" method="post" modelAttribute="dto" >
            <div class="input-form">
                <span>Tên Người Dùng</span>
                <form:input path="dto.username" />
                <br />
            </div>
            <div class="input-form">
                <span>Mật Khẩu</span>
                <form:input path="dto.password" />
            </div>
<%--            <div class="nho-dang-nhap">--%>
<%--                <label><input type="checkbox" name=""> Nhớ Đăng Nhập</label>--%>
<%--            </div>--%>
            <div class="input-form">
                <input type="submit" value="Đăng nhập" />
            </div>
        </form>
    </div>
</div>
</body>
</html>
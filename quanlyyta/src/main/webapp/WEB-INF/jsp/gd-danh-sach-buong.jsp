<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/templates/main.css">
    <title>Buồng</title>
</head>
<body>
<div class="noi-dung">
    <div class="form">
        <h2>Trang Chọn Buồng</h2>
        <form action="${pageContext.request.contextPath}/buong" method="get">
            <table border="1">
                <thead>
                <tr>
                    <td>Tên</td>
                    <td>Sức chứa</td>
                    <td>Sức chứa tối đa</td>
                    <td>Mô tả</td>
                    <td></td>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="item" items="${buongList}">
                    <tr>
                        <td>${item.ten}</td>
                        <td>${item.sucChua}</td>
                        <td>${item.sucChuaToiDa}</td>
                        <td>${item.mota}</td>
                        <td>
                            <button>Chọn</button>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </form>
    </div>
</div>
</body>
</html>
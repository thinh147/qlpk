<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>Document</title>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 70%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
</head>
<body>
<h1 style="align-items: center; display: flex; justify-content: center">
    Chọn Bác sĩ cho buồng <span>${buong.tenBuong}</span>
</h1>
<div style="width: 100%; display: flex; justify-content: center">
    <form action="${pageContext.request.contextPath}/buong/detail" method="get">
        <div style="width: 20%">
            <h1>Thông tin </h1>
            <div>
                <div style="display: flex; align-items: center">
                    <h2 style="margin-right: 20px">Họ và tên :</h2>
                    <h3>${buong.tenBacSy}</h3>
                </div>
                <div style="display: flex; align-items: center">
                    <h2 style="margin-right: 20px">Mã :</h2>
                    <h3>${buong.maBS}</h3>
                </div>
                <div style="display: flex; align-items: center">
                    <h2 style="margin-right: 20px">Chuyên ngành :</h2>
                    <h3>${buong.chuyenNganh}</h3>
                </div>
            </div>
        </div>
        <div style="width: 35%; margin: 0 20px">
            <h1>Danh sách y tá đã đăng ký</h1>
            <table>
                <tr>
                    <th>STT</th>
                    <th>Tên Y tá</th>
                    <th>Tình trạng</th>
                </tr>
                <c:forEach var="item" items="${buong.ytaDtoList}">
                    <tr>
                        <td>${item.id}</td>
                        <td>${item.ten}</td>
                        <td>Đã Lên lịch</td>
                    </tr>
                </c:forEach>
            </table>
        </div>
        <div style="width: 35%">
            <h1>Danh sách y tá chưa đăng ký</h1>
            <table>
                <tr>
                    <th>Chọn</th>
                    <th>STT</th>
                    <th>Tên Y tá</th>
                    <th>Tình trạng</th>
                </tr>
                <tr>
                    <td><input type="checkbox" id="vehicle1" name="vehicle1" value="Bike"></td>

                    <td>1</td>
                    <td>Nguyễn Thị A</td>
                    <td>Chưa Lên lịch</td>
                </tr>
                <tr>
                    <td><input type="checkbox" id="vehicle1" name="vehicle1" value="Bike"></td>

                    <td>2</td>
                    <td>Nguyễn Thị A</td>
                    <td>Chưa Lên lịch</td>
                </tr>
                <tr>
                    <td><input type="checkbox" id="vehicle1" name="vehicle1" value="Bike"></td>

                    <td>3</td>
                    <td>Nguyễn Thị A</td>
                    <td>Chưa Lên lịch</td>
                </tr>
                <tr>
                    <td><input type="checkbox" id="vehicle1" name="vehicle1" value="Bike"></td>

                    <td>4</td>
                    <td>Nguyễn Thị A</td>
                    <td>Chưa Lên lịch</td>
                </tr>
                <tr>
                    <td><input type="checkbox" id="vehicle1" name="vehicle1" value="Bike"></td>

                    <td>5</td>
                    <td>Nguyễn Thị A</td>
                    <td>Chưa Lên lịch</td>
                </tr>
            </table>
            <div style="margin-top: 20px; display: flex;">
                <button style="margin-right: 20px;">Quay lại</button>
                <button>OK</button>
            </div>

        </div>
    </form>
</div>
</body>
</html>

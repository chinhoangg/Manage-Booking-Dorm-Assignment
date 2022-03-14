<%-- 
    Document   : admincheck2
    Created on : Mar 14, 2022, 9:45:16 PM
    Author     : chinhoag
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"/>
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Manager - DormBOO</title>
        <!-- Favicon-->
        <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
        <!-- Bootstrap icons-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet"/>
        <!-- Core theme CSS (includes Bootstrap)-->
        <link href="/ManageBookingDorm/css/styles.css" rel="stylesheet"/>
    </head>
    <body>
        <%@include file="components/navBarComponent.jsp" %>
        <h1 style="text-align: center">Detail info about room of Student in DormBOO.</h1><br>
        <div class="container" style="min-height: 1000px">
            <table class="table" style="text-align: center">
                <thead>
                    <tr>
                        <th scope="col">#</th>
                        <th scope="col">Bill Number</th>
                        <th scope="col">Room Name</th>
                        <th scope="col">Room Price</th>
                        <th scope="col">Duration (monthly)</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${listBillDetail}" var="Bd">
                    <tr>
                        <td>${Bd.getId()}</td>
                        <td>${Bd.getBillId()}</td>
                        <td>${Bd.getRoomName()}</td>
                        <td>${Bd.getRoomPrice()} $</td>
                        <td>${Bd.getDuration()} month</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
        <%@include file="components/footerComponent.jsp" %>
    </body>
</html>

<%-- 
    Document   : admincheck3
    Created on : Mar 14, 2022, 10:04:10 PM
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
        <h1 style="text-align: center">Detail time and feedback of Student in DormBOO.</h1><br>
        <div class="container" style="min-height: 1000px">
            <table class="table" style="text-align: center">
                <thead>
                    <tr>
                        <th scope="col">#</th>
                        <th scope="col">Student Number</th>
                        <th scope="col">Total Price</th>
                        <th scope="col">Note (Feadback)</th>
                        <th scope="col">Create Date</th>
                        <th scope="col">AdmissierID</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${listBill}" var="bb">
                    <tr>
                        <td>${bb.getId()}</td>
                        <td>${bb.getAccountId()}</td>
                        <td>${bb.getTotalPrice()} $</td>
                        <td>${bb.getNote()}</td>
                        <td>${bb.getCreatedDate()}</td>
                        <td>${bb.getAdmissierId()}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
        <%@include file="components/footerComponent.jsp" %>
    </body>
</html>

<%-- 
    Document   : admincheck
    Created on : Mar 13, 2022, 11:10:38 PM
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
        <title>Quote Thanks - DormBOO</title>
        <!-- Favicon-->
        <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
        <!-- Bootstrap icons-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet"/>
        <!-- Core theme CSS (includes Bootstrap)-->
        <link href="/ManageBookingDorm/css/styles.css" rel="stylesheet"/>
    </head>
    <body>
        <%@include file="components/navBarComponent.jsp" %>
        <div class="container" style="min-height: 1000px">
            <table class="table">
                <thead>
                    <tr>
                        <th scope="col">Name Student</th>
                        <th scope="col">Phone</th>
                        <th scope="col">Address</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${listAdmissier}" var="Ad">
                    <tr>
                        <td>${Ad.getName()}</td>
                        <td>${Ad.getPhone()}</td>
                        <td>${Ad.getAddress()}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
        <%@include file="components/footerComponent.jsp" %>
    </body>
</html>

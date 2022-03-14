<%-- 
    Document   : createroom
    Created on : Mar 14, 2022, 10:29:18 PM
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
        <title>Manage - DormBOO</title>
        <!-- Favicon-->
        <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
        <!-- Bootstrap icons-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet"/>
        <!-- Core theme CSS (includes Bootstrap)-->
        <link href="css/styles.css" rel="stylesheet" />
    </head>
    <body>
        <%@include file="components/navBarComponent.jsp" %>
        <h1 style="text-align: center">Update new room in the DormBOO.</h1><br>
        <form action="http://localhost:8080/ManageBookingDorm/service" method="post">
            <table class="table" style="margin-left: 70px"  >
                <tr>
                    <td>Name:</td>
                    <td>
                        <input type="text" name="name" size="100px">
                    </td>
                </tr>
                <tr>
                    <td>Duration:</td>
                    <td>
                        <input type="text" name="duration" size="100px">
                    </td>
                </tr>
                <tr>
                    <td>Price($):</td>
                    <td>
                        <input type="text" name="price" size="100px">
                    </td>
                </tr>
                <tr>
                    <td>Description:</td>
                    <td>
                        <input type="text" name="description" size="100px">
                    </td>
                </tr>
                <tr>
                    <td>Image_url:</td>
                    <td>
                        <input type="text" name="image" size="100px">
                    </td>
                </tr>
                <tr>
                    <td>Create Date:</td>
                    <td>
                        <input type="date" name="date" size="100px">
                    </td>
                </tr>
                <tr>
                    <td>CategoryID:</td>
                    <td>
                        <input type="text" name="cate" size="100px">
                    </td>
                </tr>
                <tr>
                    <td><button type="submit">Add Room</button></td>
                </tr>
            </table>
        </form>
        <%@include file="components/footerComponent.jsp" %>
    </body>
</html>

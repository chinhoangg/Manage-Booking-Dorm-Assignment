<%-- 
    Document   : update
    Created on : Mar 19, 2022, 10:08:40 PM
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
        <h1 style="text-align: center">Manager in the DormBOO</h1><br>
        <form action="update" method="POST">
            <table class="table container">
                <tr>
                    <td>Room ID:</td>
                    <td>
                        <input type="text" name="id" value="${st.id}" size="100px" readonly>
                    </td>
                </tr>
                <tr>
                    <td>Room Name:</td>
                    <td>
                        <input type="text" name="name" value="${st.name}" size="100px">
                    </td>
                </tr>
                <tr>
                    <td>Duration(Monthly):</td>
                    <td>
                        <input type="text" name="duration" value="${st.duration}" size="100px">
                    </td>
                </tr>
                <tr>
                    <td>Price($):</td>
                    <td>
                        <input type="text" name="price" value="${st.price}" size="100px">
                    </td>
                </tr>
                <tr>
                    <td>Description:</td>
                    <td>
                        <input type="text" name="description" value="${st.description}" size="100px">
                    </td>
                </tr>
                <tr>
                    <td>Image_url:</td>
                    <td>
                        <input type="text" name="image" value="${st.imageUrl}" size="100px">
                    </td>
                </tr>
                <tr>
                    <td>Create Date:</td>
                    <td>
                        <input type="date" name="date" value="${st.createdDate}" size="100px">
                    </td>
                </tr>
                <tr>
                    <td><button type="submit" class="btn btn-primary py-2 top-0 end-0 mt-2 ">Update Room</button></td>
                </tr>
            </table>
        </form>
        <%@include file="components/footerComponent.jsp" %>
    </body>
</html>

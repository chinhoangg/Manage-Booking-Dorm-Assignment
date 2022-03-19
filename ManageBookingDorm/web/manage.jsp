<%-- 
    Document   : manage
    Created on : Mar 19, 2022, 4:31:55 PM
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
        <form action="managerr" method="POST">
            <table class="table table-hover tm-table-small tm-product-table container">
                <tr>
                    <th scope="col">Room ID</th>
                    <th scope="col">Room Name</th>
                    <th scope="col">Price</th>
                    <th scope="col" style="text-align: center" style="width: 500px">Description</th>
                    <th scope="col">#</th>
                    <th scope="col">#</th>
                </tr>
                <c:forEach items="${listProducts}" var="P">
                    <tr>
                        <td>${P.id}</td>
                        <td>${P.name}</td>
                        <td>${P.price}</td>
                        <td style="width: 500px">${P.description}</td>
                        <td>
                            <a href="delete" class="tm-product-delete-link">
                                <i class="far fa-trash-alt tm-product-delete-icon"></i>
                            </a>
                        </td>
                        <td>
                            <a href="delete" class="fa fa-plus w-30px m-t-5">
                            </a>
                        </td>
                    </c:forEach>
                </tr>
            </table>
        </form>
        <%@include file="components/footerComponent.jsp" %>
    </body>
</html>

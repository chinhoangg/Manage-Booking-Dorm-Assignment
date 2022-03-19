<%-- 
    Document   : admin
    Created on : Mar 14, 2022, 9:04:43 PM
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
    <div class="row d-flex justify-content-center mt-100 mb-100">
        <div class="col-lg-6">
            <div class="card">
                <div class="card-body text-center">
                    <h2 class="card-title m-b-0" style="color: #AB7442">Manage of DormBOO</h2>
                </div>
                <ul class="list-style-none">
                    <li class="d-flex no-block card-body"> <i class="bi bi-award w-30px m-t-5" style="margin-right: 10px"></i>
                        <div> <a href="totalstudent" class="m-b-0 font-medium p-0">Students Booked</a> <span class="text-muted">All students have booked in DormBOO</span> </div>
                    </li>
                    <li class="d-flex no-block card-body border-top"> <i class="fa fa-leaf w-30px m-t-5" style="margin-right: 10px"></i>
                        <div> <a href="detailstudent" class="m-b-0 font-medium p-0">Information Room of Students</a> <span class="text-muted">Detail info about room of Student</span> </div>
                    </li>
                    <li class="d-flex no-block card-body border-top"> <i class="bi bi-chat-quote w-30px m-t-5" style="margin-right: 10px"></i>
                        <div> <a href="notestudent" class="m-b-0 font-medium p-0">Detail Timeup and Feedback</a></div>
                    </li>
                    <li class="d-flex no-block card-body border-top"> <i class="fa fa-plus w-30px m-t-5" style="margin-right: 10px"></i>
                        <div> <a href="createroom" class="m-b-0 font-medium p-0">Add new room to the DormBOO</a> <span class="text-muted">Update new service</span> </div>
                    </li>
                    <li class="d-flex no-block card-body border-top"> <i class="bi bi-bookmark-star-fill w-30px m-t-5" style="margin-right: 10px"></i>
                        <div> <a href="managerr" class="m-b-0 font-medium p-0">Manager to the DormBOO</a> <span class="text-muted">Manager service</span> </div>
                    </li>
                </ul>
            </div>
        </div>
    </div>
    <%@include file="components/footerComponent.jsp" %>
</body>
</html>

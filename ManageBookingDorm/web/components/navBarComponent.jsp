<%-- 
    Document   : navBarComponent
    Created on : Feb 23, 2022, 10:03:29 PM
    Author     : chinhoag
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!-- Topbar Start -->
<div class="container-fluid bg-light p-0">
    <div class="row gx-0 d-none d-lg-flex">
        <div class="col-lg-7 px-5 text-start">
            <div class="h-100 d-inline-flex align-items-center py-3 me-4">
                <small class="fa fa-map-marker-alt text-primary me-2"></small>
                <small>30M Street, Hoa Lac, FPT</small>
            </div>
            <div class="h-100 d-inline-flex align-items-center py-3">
                <small class="far fa-clock text-primary me-2"></small>
                <small>Mon - Sun : 07.30 AM - 10.00 PM</small>
            </div>
        </div>
        <div class="col-lg-5 px-5 text-end">
            <div class="h-100 d-inline-flex align-items-center py-3 me-4">
                <small class="fa fa-phone-alt text-primary me-2"></small>
                <small>+84 89 826 8621</small>
            </div>
            <div class="h-100 d-inline-flex align-items-center">
                <a class="btn btn-sm-square bg-white text-primary me-1" href="https://www.facebook.com/chinhoangg01.dp.ITfpt/"><i class="fab fa-facebook-f"></i></a>
                <a class="btn btn-sm-square bg-white text-primary me-1" href=""><i class="fab fa-twitter"></i></a>
                <a class="btn btn-sm-square bg-white text-primary me-1" href=""><i class="fab fa-linkedin-in"></i></a>
                <a class="btn btn-sm-square bg-white text-primary me-0" href="https://www.instagram.com/chinhoangg_/"><i class="fab fa-instagram"></i></a>
            </div>
        </div>
    </div>
</div>
<!-- Topbar End -->

<!-- Navbar Start -->
<nav class="navbar navbar-expand-lg bg-white navbar-light sticky-top p-0">
    <a href="http://localhost:8080/ManageBookingDorm/home" class="navbar-brand d-flex align-items-center px-4 px-lg-5">
        <h2 class="m-0 text-primary">DormBOO</h2>
    </a>
    <button type="button" class="navbar-toggler me-4" data-bs-toggle="collapse" data-bs-target="#navbarCollapse">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarCollapse">
        <form action="search" class="d-flex mx-auto">
            <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search" name="keyword"/>
            <button class="btn btn-outline-dark text-primary" type="submit">Search</button>
        </form>
        <div class="d-flex my-2">
            <a class="btn btn-outline-dark" style="margin-right: 10px" href="carts">
                <i class="bi-star-fill me-2 text-primary"></i>Room
                <span class="badge bg-dark text-white ms-1 rounded-pill">${sessionScope.carts.size()}</span>
            </a>
        </div>
    </div>
    <c:choose>
        <c:when test="${sessionScope.account != null}">
            <button class="btn btn-primary py-2 px-lg-3 d-none d-lg-block">${sessionScope.account.displayName}</button>
            <a href="logout" class="btn py-4 px-lg-3 d-none d-lg-block text-primary">SIGN OUT</a>
        </c:when>
        <c:otherwise>
            <a href="login" class="btn btn-primary py-4 px-lg-5 d-none d-lg-block">SIGN UP<i class="fa fa-arrow-right ms-3"></i></a>
        </c:otherwise>
    </c:choose>
    
</div>
</nav>
<!-- Navbar End -->


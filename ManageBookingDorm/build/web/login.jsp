<%-- 
    Document   : login
    Created on : Feb 28, 2022, 8:15:37 AM
    Author     : chinhoag
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Login for Manage booking Dorm</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="keywords" content="Official Signup Form Responsive, Login form web template,Flat Pricing tables,Flat Drop downs  Sign up Web Templates, Flat Web Templates, Login signup Responsive web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
        <!-- fonts -->
        <link href="//fonts.googleapis.com/css?family=Raleway:100,200,300,400,500,600,700,800,900" rel="stylesheet">
        <link href="//fonts.googleapis.com/css?family=Monoton" rel="stylesheet">
        <!-- /fonts -->
        <!-- css -->
        <link href="css/font-awesome.min.css" rel="stylesheet" type="text/css" media="all" />
        <link href="css/style.css" rel='stylesheet' type='text/css' media="all" />
        <!-- /css -->
        <style>
            .error{
                margin-left: 150px;
                margin-top: 20px;
                color: red
            }
        </style>
    </head>
    <body>
        <h1 class="w3ls">Manage Booking Dorm</h1>
        <div class="content-w3ls">
            <div class="content-agile1">
                <h2 class="agileits1">DormBOO</h2>
                <p class="agileits2">Here you can book the right dorm for you.</p>
            </div>
            <div class="content-agile2">
                <form action="login" method="POST">
                    <div class="form-control w3layouts"> 
                        <input type="text" id="firstname" name="username" placeholder="User Name" title="Please enter your User Name" required="">
                    </div>

                    <div class="form-control agileinfo">	
                        <input type="password" class="lock" name="password" placeholder="Password" id="password1" required="">
                    </div>

                    <div style="margin-left: 190px">	
                        <input type="checkbox" name="remember">
                        <label style="color: white">Remember me</label>
                    </div>

                    <h3 class="error">${error}</h3>

                    <input type="submit" class="register" value="Login">
                </form>
                <script type="text/javascript">
                    window.onload = function () {
                        document.getElementById("password1").onchange = validatePassword;
                        document.getElementById("password2").onchange = validatePassword;
                    }
                    function validatePassword() {
                        var pass2 = document.getElementById("password2").value;
                        var pass1 = document.getElementById("password1").value;
                        if (pass1 != pass2)
                            document.getElementById("password2").setCustomValidity("Passwords Don't Match");
                        else
                            document.getElementById("password2").setCustomValidity('');
                        //empty string means no validation error
                    }
                </script>
                <p class="wthree w3l">Fast Signup With Your Favourite Social Profile</p>
                <ul class="social-agileinfo wthree2">
                    <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                    <li><a href="#"><i class="fa fa-youtube"></i></a></li>
                    <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                    <li><a href="#"><i class="fa fa-google-plus"></i></a></li>
                </ul>
            </div>
            <div class="clear"></div>
        </div>
        <p class="copyright w3l">© 2022 Signup Dorm. Everything you need is here | Create by <a href="https://www.facebook.com/chinhoangg01.dp.ITfpt/" target="_blank">ChinhHoang</a></p>
    </body>
</html>
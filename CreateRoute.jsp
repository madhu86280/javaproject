
<%-- 
    Document   : CreateRoute
    Created on : Feb 20, 2019, 9:49:00 AM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Create Route</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style>
            body{
                overflow: hidden;
                margin: 0 auto;
            }
           .main{
            display:flex;
            background-color:#e6e6e6;
            margin-top: auto;
            height:1000px;
            flex-direction: row;
            justify-content: space-between;
            }
            .sub1{
                display:flex;
                background-color:#800000;
                padding:80px;
            }
            .sub2{
                display: flex;
                background-color:#800000;
                padding:80px;
            }
            .box{
                margin-top: 200px;
                background-color:#800000;
                border-radius:5%;
                height:310px;
                width:500px;
                border:1px solid black;
            }
            .box h4{
                  text-align: center;
                  font-family:Courier;
                  color:#e6e600
            }
            .box h1{
              text-align: center;
              font-family: Courier;
              color:#e6e600;
            }
            .input{
                 display:block;
                 background:#ecf0f1;
                 padding: 8px;
                 width:250px;
                 font-size:1em;
                 margin-left:110px; 
            }
            .btn{
            margin-left:220px;
            display: block;
            margin:auto;
            background:#d9d9d9;
            width:95px;
            padding:5px;
            color:black;
            border-radius:4px;
            border: #ff4d4d 1px solid;
            text-align: center;
            cursor:pointer;
            font-family:Courier;
            }
            .btn:hover{
            transition-duration: 0.5s;
            transform: translate(0px,-5px);
            box-shadow: 0px 10px 20px black; 
             }
        </style>
    </head>
    <body>
        <div class="main">
            <div class="sub1"></div>
            <div class="box">
            <h1>Create Route</h1>
	<form name="MyForm">
	<h4>Bus No:</h4><input type="text" name="BN" placeholder="Bus no" class="input">
        <h4>Route No:</h4><input type="text" name="RN" placeholder="Route no" class="input"><br>
        <input type="submit" value="Create" class="btn">
        </form>    
            </div>
            <div class="sub2"></div>
        </div>
    </body>
</html>-->
<!DOCTYPE html>

<html>

<head>
    <title>Create Route</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <style>
        #p {
            background-color: white;
            margin-top: 0px;
            margin-bottom: 0px;
            margin-right: 100px;
            margin-left: 50px;
            border-radius: 25px;
            border: 2px solid black;
            padding: 20px;
            box-shadow: 5px 10px 20px black;
            color: black;
        }
        
        input[type=text],
        select,
        textarea {
            width: 80%;
            padding: 12px;
            border: 1px solid #ccc;
            border-radius: 4px;
            resize: vertical;
        }
        
        label {
            padding: 12px 12px 12px 0;
            display: inline-block;
        }
        
        input[type=submit] {
            background-color: #4CAF50;
            color: white;
            padding: 12px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            float: right;
        }
        
        input[type=submit]:hover {
            background-color: #45a049;
        }
        
        .container {
            border-radius: 5px;
            background-color: #f2f2f2;
            padding: 20px;
        }
        
        .col-25 {
            float: left;
            width: 25%;
            margin-top: 6px;
        }
        
        .col-75 {
            float: left;
            width: 75%;
            margin-top: 6px;
        }
       
        
        .row:after {
            content: "";
            display: table;
            clear: both;
        }
       
        
        @media screen and (max-width: 600px) {
            .col-25,
            .col-75,
            input[type=submit] {
                width: 100%;
                margin-top: 0;
            }
        }
        
        body {
            background-image: url("back pattern 1.png");
            background-attachment: fixed;
            background-size: 100px 100px;
            font: 400 15px/1.8 Lato, sans-serif;
            color: #777;
        }
        
        h3,
        h4 {
            margin: 10px 0 30px 0;
            letter-spacing: 10px;
            font-size: 20px;
            color: #111;
        }
        
        .container {
            padding: 80px 120px;
        }
        
        .person {
            border: 10px solid transparent;
            margin-bottom: 25px;
            width: 80%;
            height: 80%;
            opacity: 0.7;
        }
        
        .person:hover {
            border-color: #f1f1f1;
        }
        
        .carousel-inner img {
            width: 100%;
           
            margin: auto;
        }
        
        .carousel-caption h3 {
            color: #fff !important;
        }
        
        @media (max-width: 600px) {
            .carousel-caption {
                display: none;
               
            }
        }
        
        .bg-1 {
            background: #2d2d30;
            color: #bdbdbd;
        }
        
        .bg-1 h3 {
            color: #fff;
        }
        
        .bg-1 p {
            font-style: italic;
        }
        
        .list-group-item:first-child {
            border-top-right-radius: 0;
            border-top-left-radius: 0;
        }
        
        .list-group-item:last-child {
            border-bottom-right-radius: 0;
            border-bottom-left-radius: 0;
        }
        
        .thumbnail {
            padding: 0 0 15px 0;
            border: none;
            border-radius: 0;
        }
        
        .thumbnail p {
            margin-top: 15px;
            color: #555;
        }
        
        .btn {
            padding: 10px 20px;
            background-color: #333;
            color: #f1f1f1;
            border-radius: 0;
            transition: .2s;
        }
        
        .btn:hover,
        .btn:focus {
            border: 1px solid #333;
            background-color: #fff;
            color: #000;
        }
        
        .modal-header,
        h4,
        .close {
            background-color: #333;
            color: #fff !important;
            text-align: center;
            font-size: 30px;
        }
        
        .modal-header,
        .modal-body {
            padding: 40px 50px;
        }
        
        .nav-tabs li a {
            color: #777;
        }
        
        #googleMap {
            width: 100%;
            height: 400px;
            -webkit-filter: grayscale(100%);
            filter: grayscale(100%);
        }
        
        .navbar {
            font-family: Montserrat, sans-serif;
            margin-bottom: 0;
            background-color: #2d2d30;
            border: 0;
            font-size: 11px !important;
            letter-spacing: 4px;
            opacity: 0.9;
        }
        
        .navbar li a,
        .navbar .navbar-brand {
            color: #d5d5d5 !important;
        }
        
        .navbar-nav li a:hover {
            color: #fff !important;
        }
        
        .navbar-nav li.active a {
            color: #fff !important;
            background-color: #29292c !important;
        }
        
        .navbar-default .navbar-toggle {
            border-color: transparent;
        }
        
        .open .dropdown-toggle {
            color: #fff;
            background-color: #555 !important;
        }
        
        .dropdown-menu li a {
            color: #000 !important;
        }
        
        .dropdown-menu li a:hover {
            background-color: red !important;
        }
        
        footer {
            background-color: #2d2d30;
            color: #f5f5f5;
            padding: 32px;
        }
        
        footer a {
            color: #f5f5f5;
        }
        
        footer a:hover {
            color: #777;
            text-decoration: none;
        }
        
        .form-control {
            border-radius: 0;
        }
        
        textarea {
            resize: none;
        }
    </style>

</head>

<body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="50">

    <nav class="navbar navbar-default navbar-fixed-top">
        <div class="container-fluid">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
                <a class="navbar-brand" href="index.html"><B text-align="center">Bus<span>Management</span> SYSTEM</B></a>
            </div>
            <div class="collapse navbar-collapse" id="myNavbar">
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="index1.html">HOME</a></li>
                    <li><a href="index.html">SIGN OUT</a></li>

                    <li><a href="#"><span class="glyphicon glyphicon-search"></span></a></li>
                </ul>
            </div>
        </div>
    </nav>
    <br><br><br>
    <div id="p">
        <form action="submit.jsp" method="post">
            <p align="center" style="font-family: algerian; font-size: 60px;">Create Route</p>

            <form name="MyForm">
                <h4>Bus No:</h4><input type="text" name="BN" placeholder="Bus no" class="input">
                <h4>Route No:</h4><input type="text" name="RN" placeholder="Route no" class="input"><br>


                <center> <button type="submit" value="Submit" class="button" width="50" height="20">DELETE</button></center><br><br>
                <br>
            </form>
    </div>
</body>

</html>

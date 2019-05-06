<%-- 
    Document   : Deleteroute
    Created on : Mar 31, 2019, 3:04:19 AM
    Author     : Dell Store Una
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="registerc.css">
        <style>
        .navbar {
  overflow: hidden;
  background-color: #333;
}

.navbar a {
  float: left;
  font-size: 16px;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

.dropdown {
  float: left;
  overflow: hidden;
}

.dropdown .dropbtn {
  font-size: 16px;  
  border: none;
  outline: none;
  color: white;
  padding: 14px 16px;
  background-color: inherit;
  font-family: inherit;
  margin: 0;
}

.navbar a:hover, .dropdown:hover .dropbtn {
  background-color: grey;
}
</style>
    </head>
   <body background="g1.jpg"> 
       
           <table WIDTH="100%">
<tr>
<td><center><b><h1><font face="Arial"></font></h1></b></center></td>
</tr>
<tr>
<td bgcolor="black">
<center><b><font face="verdana"><font color="white" size="+4">BUS MANAGEMENT SYSTEM</font></b></center>
</td>
</tr>
<tr>
<td>
<marquee bgcolor="lightyellow" direction="left"><b><font size="5" color="red"></font></b>
</marquee>
</td>
</tr>
</tr>
</table>
       <div class="navbar">
<a href="Aboutus.jsp">ABOUT US</a>
  <a href="Login.jsp">LOGOUT</a>

 
</div>
           <header>
            <div class="row">
                <ul class="main-nav">
                     <button class="button"><li><a href="Register.jsp">Register</a></li></button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <button class="button"><li><a href="Remove.jsp">Remove User</a></li></button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <button class="button">  <li><a href="Adminpage.jsp">Add Route </a></li></button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <button class="button"> <li><a href="Deleteroute.jsp">Delete Route</a></li></button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                     <button class="button"> <li><a href="Editroute.jsp">Edit Route</a></li></button>
                </ul>
            </div>
           
        <form class="login" action="Adduser" method="post">
    <h1 class="login-title">Register</h1>
    <input type="text" class="login-input" name="username" placeholder="name" autofocus required>
    <input type="text" class="login-input" placeholder="password" name="password" required>
    
     
    
    <center> <input type="submit" value="submit"> </center><br><br>
   
    </form>
    </body>
</html>
    
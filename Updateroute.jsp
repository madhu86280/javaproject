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
       <link rel="stylesheet" type="text/css" href="update.css">
    </head>
    <body>
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
           
        <form class="login" action="accounts.jsp" method="post">
    <h1 class="login-title">UPDATE ROUTE</h1>
    <input type="text" class="login-input" name="nm" placeholder="Bus Number" autofocus required>
    <input type="text" class="login-input" placeholder="Bus Route" name="pwd" required>
    <input type="text" class="login-input" name="nm" placeholder="Updated bus route" autofocus required>
   <center> <button type="submit" value="Submit" class="button" width="50" height="20">SUBMIT HERE</button></center><br><br>
   
    </form>
    </body>
</html>
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
        <link rel="stylesheet" type="text/css" href="management.css">
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
           
           
        <form class="login" action="accoun.jsp" method="post">
    <h1 class="login-title">EDIT ROUTE</h1>
    <input type="text" class="login-input" name="busno" placeholder="Bus Number" autofocus required>
    <input type="text" class="login-input" placeholder="Bus Time" name="bustime" required>
    <input type="text" class="login-input" name="route" placeholder="Route" autofocus required>
    
   <center> <button type="submit" value="Submit" class="button" width="50" height="20">SUBMIT HERE</button></center><br><br>
   
    </form>
    </body>
</html>
    
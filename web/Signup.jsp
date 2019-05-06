<%-- 
    Document   : Signup
    Created on : Mar 31, 2019, 12:57:22 AM
    Author     : Dell Store Una
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <!DOCTYPE html>

<html>
    <head>
       
    
    <style>
        
		
		.background{

            height:500px;
            width:500px;
           
            border :6px solid black;
            position: relative;
        
            
        }
		.background .bg{
		background: url(g1.jpg) repeat;
		 opacity:.5;
           filter: alpha(opacity=20);
		     position: absolute;
        z-index: -1;
          top: 0;
            bottom: 0;
          left: 0;
        right: 0;
        width: 100%;
        height: 100%;
		}
		
	.button {
  padding: 5px 15px;
  font-size: 15px;
  text-align: center;
  cursor: pointer;
  outline: none;
  color: #fff;
  background-color: black;
  border: none;
  border-radius: 15px;
  box-shadow: 0 9px grey;
}

.button:hover {background-color: black}

.button:active {
  background-color: black;
  box-shadow: 0 5px grey;
  transform: translateY(4px);
}
h1 {
  color: black;
  text-shadow: 2px 2px 4px grey;
 font-size: 80px;
}
    </style>
    </head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <body background="bus21.jpg"> 
 <a href="Login.html"><img src="h.png"></a></center>
<div class="w3-container w3-center w3-animate-zoom">
<center>
        <div class="background">
           <div class="bg"></div>
        <div align="center" style="opacity:1.0;" >
            <form method="post" action="SignUp">
                <table cellpadding="10" cellspacing="1" border="0" width="70%">
                    <tr><td colspan="4"></td></tr>
                     <tr><td colspan="4"></td></tr>
                     
                    
                    <tr><td colspan="4" align="center"><h2><b><i>STUDENT</b></i></h2></td></tr>
                <tr><td width="20%"></td><td><strong><font color="black"> <b> FNAME:</b></font></strong></td><td><input type="text" name="Fname" required></td><td width="20%"></td></tr>
                <tr><td width="20%"></td><td><strong><font color="black"><b>LNAME:</b></font></strong></td> <td><input type="password" name="Lname" required></td><td width="20%"></td></tr>
                <tr><td width="20%"></td><td><strong><font color="black"> <b> EMAIL:</b></font></strong></td><td><input type="text" name="email" required></td><td width="20%"></td></tr>
<tr><td width="20%"></td><td><strong><font color="black"> <b> PASSWORD</b></font></strong></td><td><input type="text" name="pass"required></td><td width="20%"></td></tr>
</table> 
<select name="utype"  class="form-control">
                                        <option value="admin">Admin</option>
                                        <option value="student">Student</option>
                                        <option value="teacher">Teacher</option>
                                    </select>
                  
                   

<br><br><button class="button">SIGNUP</button>

            </form>
            
        
            </div>
        </div>
</center>
</div>
    </body>
</html>
</html>

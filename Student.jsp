<%-- 
    Document   : Deleteroute
    Created on : Mar 31, 2019, 3:04:19 AM
    Author     : Dell Store Una
--%>

<%@page import="Model.schedule"%>
<%@page import="java.util.Iterator"%>
<%@page import="org.hibernate.Query"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="org.hibernate.cfg.Configuration"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="management.css">
        <style>
        h1{
  font-size: 30px;
  color: #ff9900;
  text-transform: uppercase;
  font-weight: 300;
  text-align: center;
  margin-bottom: 15px;
}
table{
  width:100%;
/*  table-layout: fixed;*/
}
.tbl-header{
  background-color: rgba(0,0,0,0.9);
  overflow-x:auto;
  margin-top: 0px;
  border: 1px solid rgba(0,0,0,0.9);
 }
.tbl-content{
 /*height:300px;*/
  overflow-x:auto;
  margin-top: 0px;
  border: 1px solid rgba(0,0,0,0.9);
}
th{
  padding: 12px 12px;
  text-align: left;
  font-weight: 500;
  font-size: 12px;
  color: grey;
  text-transform: uppercase;
}
td{
  background-color: black;
  padding: 15px;
  text-align:left ;
  vertical-align:middle;
  font-weight: 300;
  font-size: 20px;
  color: grey;
  border-bottom: solid 1px rgba(0,0,0,0.7);
}
.butn
  {
    width:20%;
    margin:auto;
    margin-left:435px;
    box-sizing:border-box;
    padding: 10px 0px;
    background-color: white;
    opacity:0.7;
    outline:none;
    border:none;
    border-bottom:1px  #ff9900;
    color:#ff9900;
    border-radius:20px;
    font-size:15px;
    height:35px;

  }
  .butn:hover
{
  background:White;
  color:#ff9900;
  cursor:pointer;
}
.demo
{
  display:flex;
      background-color: black;
      padding:20px;
            flex-wrap:wrap;
      flex-direction:row;
      justify-content: space-around;
      width:83%;
      margin-top: 50px;
     
     margin:auto;
     box-sizing: border-box;	
}
 .demo input[type=text]
    {
      margin-top:3px;
      border-radius: 20px;
      width:200px;
      height:30px;
      
          }
section{
  margin: 50px;
}
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

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f9f9f9;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
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
 
           
               
     <!--for demo wrap-->
 <h3><h3>
  <div class="tbl-header">
    <table>
    <thead>
    <tr>      
    <th><h2>BUS NUMBER    </th></h2>
    <th><h2>ROUTE</h2></th>
    
    </tr>
    </thead>
      <tbody>
         <% 
                    int busn;
                    String busr;
                    Configuration cf = null;
                    SessionFactory sf = null;
                    Session s = null;
                    schedule sch = null;
                    try{
                        cf = new Configuration();
                        cf.configure();
                        sf = cf.buildSessionFactory();
                        s = sf.openSession();
                        Query q = s.createQuery("from schedule");
                        Iterator it = q.iterate();
                        while (it.hasNext()){
                            
                            sch = (schedule)it.next();
                            busn = sch.getBusn();
                           busr = sch.getBusr();
                   
                            System.out.println(busn);
                            
                %>        
                
			<tr>
                            <td><%=busn%></td>
                            <td><%=busr%></td>
                           
			</tr>
                        <%
                            }
                    }catch(Exception e){
                        e.printStackTrace();
                    }  
                %>      
      </tbody>
    </table>
  </div>
</section>
           
        
               <section>
  
    </body>
</html>
    
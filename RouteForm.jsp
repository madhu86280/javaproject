

<!DOCTYPE html>
<html>
    <head>
        <title>Route1 page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style>
            body{
                overflow: hidden;
                margin: 0 auto;
            }
           .main{
            display:flex;
           
            margin-top: auto;
            height:1000px;
            flex-direction: row;
            justify-content: space-between;
            }
            .sub1{
                display:flex;
                
                padding:80px;
            }
            .sub2{
                display: flex;
                
                padding:80px;
            }
            .tb{
                margin-top: 100px;
                border:1px solid black;
                border-collapse: collapse;
                width:150%;
            }
            .tb th{
                border:1px solid black;
                font-family: Courier;
                text-align: center;
                padding:10px;
                background-color: grey;
                color:black;
                padding: 15px;
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
            .tb td{
                  border:1px solid black;
                text-align: center;
                padding: 15px;
            }
            tr:nth-child(odd) {background-color: #f2f2f2;}
            .wrap{
                display: flex;
              
                align-items: center;
                flex-direction: column;
                text-align: center;
            }
 tr:nth-child(even) {background-color: #f2f2f2;}
            .wrap{
                display: flex;
              
                align-items: center;
                flex-direction: column;
                text-align: center;
            }
            
            .btn{
            display: block;
            margin:auto;
            background:black;
            padding:5px 60px;
            color:black;
            border-radius:4px;
            border: 1px solid black;
            text-align: center;
            cursor:pointer;
            font-family:Courier;
            font-size: 35px;
            margin-top: 10px;
            }
            .btn:hover{
            transition-duration: 0.5s;
            transform: translate(0px,-5px);
            box-shadow: 0px 10px 20px black; 
             }
        </style>
    </head>
   <body background="g1.jpg">
        <div class="main">
            <div class="sub1"></div>
            <div class="wrap">
            <table class="tb">
                <tr>
                    <th colspan="4">ROUTES:-</th>
                </tr>
                <tr>
                <th>Sno.</th>
                <th>Stops</th>
                <th>Arrival Time</th>
                <th>Departure Time</th>
                </tr>
                  
                <tr>
                    <td>1.</td>
                    <td>CHANDIGARH</td>
                    <td>7:30A.M.</td>
                    <td>8:45A.M.</td>
                </tr>
                <tr>
                    <td>2.</td>
                    <td>PINJORE</td>
                    <td>7:35A.M.</td>
                    <td>8:45A.M.</td>
                </tr>
                <tr>
                    <td>3.</td>
                    <td>MOHALI</td>
                    <td>7:45A.M.</td>
                    <td>8:45A.M.</td>
                </tr>
                <tr>
                    <td>4.</td>
                    <td>BADDI</td>
                    <td>7:55A.M.</td>
                    <td>8:45A.M.</td>
                </tr>
                <tr>
                    <td>5.</td>
                    <td>DERABASSI</td>
                    <td>8:20A.M.</td>
                    <td>8:45A.M.</td>
                </tr>
           </table><br><br><br>
                <a href="CreateForm.jsp" style="text-decoration:none;"> <center> <button type="submit" value="Submit" class="button" width="50" 
height="20">CREATE</button></a></center><br><br>
            </div>
            <div class="sub2"></div>
        </div>
    </body>
</html>


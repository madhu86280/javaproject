<%-- 
    Document   : Aboutus
    Created on : Mar 31, 2019, 1:28:49 AM
    Author     : Dell Store Una
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <link <head>
<style>h1 {
  color: white;
  text-shadow: 2px 2px 4px grey;
 font-size: 60px;
}
.container {
  position: relative;
  text-align: center;
  color: white;
}

.bottom-left {
  position: absolute;
  bottom: 8px;
  left: 16px;
}

.top-left {
  position: absolute;
  top: 8px;
  left: 16px;
}

.top-right {
  position: absolute;
  top: 8px;
  right: 16px;
}

.bottom-right {
  position: absolute;
  bottom: 8px;
  right: 16px;
}

.centered {
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
}
.overlay {
    height: 100%;
    width: 0;
    position: fixed;
    z-index: 1;
    top: 0;
    left: 0;
    background-color: rgb(0,0,0);
    background-color: rgba(0,0,0, 0.9);
    overflow-x: hidden;
    transition: 0.5s;
}

.overlay-content {
    position: relative;
    top: 5%;
    width: 100%;
    text-align: center;
    margin-top: 30px;
}

.overlay a {
    padding: 12px;
    text-decoration: none;
    font-size: 25px;
    color: #818181;
    display: block;
    transition: 0.3s;
}

.overlay a:hover, .overlay a:focus {
    color: #f1f1f1;
}

.overlay .closebtn {
    position: absolute;
    top: 20px;
    right: 45px;
    font-size: 20px;
}

@media screen and (max-height: 450px) {
  .overlay a {font-size: 10px}
  .overlay .closebtn {
    font-size: 10px;
    top: 25px;
    right: 35px;
  }
}</style>
<title>ABOUT</title>

    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="row mb-3">
                    <div class="col-md-12">
                        <div class="">
                            <div class="card-body">
                                <div class="row">
                                    <div class="col-md-12">
                                        <h1>ABOUT US</h1>
                                        <hr>
                                    </div>
                                </div>
                                <center>

<div class="slideshow-container">

<div class="mySlides fade">
  <div class="numbertext"></div>
  <img src="z.jpg" style="width:80%">
  
</div>

<div class="mySlides fade">
  <div class="numbertext"></div>
  <img src="y.jpg" style="width:80%">
 
</div>

</div>
<br>

<div style="text-align:center">
  <span class="dot"></span> 
  <span class="dot"></span> 
</div>
</center>
<script>
var slideIndex = 0;
showSlides();

function showSlides() {
    var i;
    var slides = document.getElementsByClassName("mySlides");
    var dots = document.getElementsByClassName("dot");
    for (i = 0; i < slides.length; i++) {
       slides[i].style.display = "none";  
    }
    slideIndex++;
    if (slideIndex > slides.length) {slideIndex = 1}    
    for (i = 0; i < dots.length; i++) {
        dots[i].className = dots[i].className.replace(" active", "");
    }
    slides[slideIndex-1].style.display = "block";  
    dots[slideIndex-1].className += " active";
    setTimeout(showSlides,2000); // Change image every 2 seconds
}
</script>

                                <div class="row">
                                    <div class="col-md-12">
                                        
                                      <h4>  CHITKARA UNIVERSITY, HIMACHAL PRADESH
Chitkara University started its operations from Academic Year 2008-09 after the Legislature of Himachal Pradesh passed Chitkara University (Establishment and Regulation) Act (Act No. 2 of 2009). We are NAAC accredited government-recognized university with the right to confer degrees as per the Sections 2(f) and 22(1) of the UGC Act, 1956 and are member of esteemed Association of Indian Universities. The University has grown tremendously during the last few years and is fast moving towards attaining leadership position in North India, which speaks volumes about our enduring commitment, outstanding faculty and rich learning environment. Being founded by a family of academicians, consequently our ethos is geared towards development of society by providing high quality education.

The Campus is spread over approximately 17 acres and provides state-of-the-art facilities and ambience for a conducive learning environment. The pedagogy is learning-centric and the curriculum has been drawn to keep abreast with latest in respective domains that prepares students for life. The ambience of the University, teacher-student relations, functional industry tie-ups, and collaborations with foreign universities provide excellent opportunities to students for their overall development.

We hold a strong commitment to high standards in all aspects of our educational activities, learning outcomes and support services and also seek to continuously strengthen the overall effectiveness of our operations. We recognize that in a shrinking globe students have to possess skills to work in an international environment. The University has collaboration with a large number of reputed foreign universities that encompass articulation arrangements, student and faculty exchanges and research collaborations as the main stay of such joint ventures.

Research has been accorded its due importance and the University has established three research centres to give a boost to research activities. A number of reputed companies have sponsored laboratories that have been set up in the campus and facilitate research. The companies like Bentley, nVIDIA  has granted the status of to Chitkara University. Marquee companies such as ARM, Cadence and NXP Semiconductors are supporting us in terms of supplying state-of-the-art equipment for best hands-on classroom training. Infosys Campus Connect and Wipro 10X Mission have provided us an important framework for our engineering curriculum.<h4>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                
            </div>
        </div>
    </div>
</section>
</head>
<body background="g1.jpg">
 </body>
</html>

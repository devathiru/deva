<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!--   <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> -->
  <style>
  .container {
  padding-left:0px;
  padding-right:0px;
  }
  .carousel-inner{
  width:100%;
  max-height: 450px !important;
}
  
  
  .fnt{
   font-family: "Times New Roman", Times, serif;
  }
  </style>
</head>
<body>

<div class="container" style="width:100%; height:450px">
 
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
      <li data-target="#myCarousel" data-slide-to="4"></li>
      <li data-target="#myCarousel" data-slide-to="5"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src="resources/images/carousel/1.jpg" style="width:100%; height:450px" >
     <div class="fnt"> <h2><font color="#ce3175"></font></h2>
	  <h3><font color="#ce3175"></font></h3>
         </div>
	  </div>

      <div class="item">
        <img src="resources/images/carousel/2.jpg" style="width:100%; height:450px" >
		<div class="fnt"><h2><font color="#ce3175">Collection of</font></h2>
		<h3><font color="#ce3175">Luxury Watches</font></h3>
      </div>
      </div>
    
      <div class="item">
        <img src="resources/images/carousel/3.jpg" style="width:100%; height:450px">
      <div class="fnt"><h2><font color="#ce3175">Classic</font></h2>
	  <h3><font color="#ce3175">Wall Clock</font></h3>
	  </div>
	  </div>
	  
      <div class="item">
        <img src="resources/images/carousel/4.jpg" style="width:100%; height:450px" >
     <div class="fnt"> <h2><font color="#ce3175"></font></h2>
	  <h3><font color="#ce3175"></font></h3>
         </div>
	  </div>
	 
      <div class="item">
        <img src="resources/images/carousel/5.jpg" style="width:100%; height:450px" >
     <div class="fnt"> <h2><font color="#ce3175"></font></h2>
	  <h3><font color="#ce3175"></font></h3>
         </div>
	  </div>
	  
      <div class="item">
        <img src="resources/images/carousel/6.jpg" style="width:100%; height:450px" >
     <div class="fnt"> <h2><font color="#ce3175"></font></h2>
	  <h3><font color="#ce3175"></font></h3>
         </div>
	  </div>
	

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
  </div>
</div>

</body>
</html>
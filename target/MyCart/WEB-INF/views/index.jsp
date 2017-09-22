<%@ include file="header.jsp" %>
<div class="container">
  <h2>COMING SOON....!</h2>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">

      <div class="item active">
        <img src="resources/images/4-laptops-dan-02.jpg" alt="Los Angeles" style="width:100%;">
        <div class="carousel-caption">
          <h3>Deal With It</h3>
          <p>We love the Big Apple!</p>
        </div>
      </div>

      <div class="item">
        <img src="resources/images/CLOTHING.jpg" alt="Chicago" style="width:100%;">
        <div class="carousel-caption">
          <h3>Run for Game</h3>
          <p>Thank you, Chicago!</p>
        </div>
      </div>
    
      <div class="item">
        <img src="resources/images/061817_furniture_dsktp86001-170515_1494884115580.jpg" alt="New York" style="width:100%;">
        <div class="carousel-caption">
          <h3>Feel The Comfort</h3>
          <p>Love your furniture like your partner!</p>
        </div>
      </div>
  
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>



<div class="container">
  <h3>Right Aligned Navbar</h3>
  <p>The .navbar-right class is used to right-align navigation bar buttons.</p>
</div>

<div class="container text-center">
  <h3>MyCart</h3>
  <p><em>We love Shopping!</em></p>
  <p>We have created a fictional Shopping website.</p>
  <br>
  <div class="row">
    <div class="col-sm-4">
      <p class="text-center"><strong>Galaxy Note-6</strong></p><br>
      <img src="resources/images/Latest-Smartphone-Samsung-Galaxy-Note-6.jpg" class="img-circle person" alt="Random Name" width="255" height="255">
    </div>
    <div class="col-sm-4">
      <p class="text-center"><strong>DELL-XPS</strong></p><br>
      <img src="resources/images/G8547_BL8133_m.jpg" class="img-circle person" alt="Random Name" width="255" height="255">
    </div>
    <div class="col-sm-4">
      <p class="text-center"><strong>Nike_Downsifter</strong></p><br>
      <img src="resources/images/images.jpg" class="img-circle person" alt="Random Name" width="255" height="255">
    </div>
  </div>
</div>

<%@ include file="footer.jsp" %>
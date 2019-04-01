<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="assets/styles/material-components-web.min.css"
	rel="stylesheet">

<link rel="stylesheet" href="assets/styles/bootstrap.min.css">
<link rel="stylesheet" href="assets/styles/style.css">
<link rel="stylesheet" href="assets/styles/icon.css">
<script src="assets/scripts/logsign.js" type="text/javascript"></script>
<title>Insert title here</title>
 <style>
            @import url('https://fonts.googleapis.com/css?family=Alegreya|Alegreya+Sans|IBM+Plex+Mono:400,400i|IBM+Plex+Sans+Condensed:400,400i|IBM+Plex+Sans:100,100i,400,400i,700,700i|IBM+Plex+Serif:400,400i|Merriweather|Merriweather+Sans|Montserrat|Nanum+Myeongjo|Nunito|Nunito+Sans|Quattrocento|Quattrocento+Sans|Roboto|Roboto+Mono|Roboto+Slab');
            * {
                font-family: 'Quattrocento Sans', sans-serif;
            }
    
            @import "@material/form-field/mdc-form-field";
            @import "@material/radio/mdc-radio";
    
            .nav {
                z-index: 2;
                background-color:#36648B;
            }
            
            body
            {
                background-image: url("assets/images/bgimagereal.png") ; 
                -webkit-background-size: cover;
                -moz-background-size: cover;
                -o-background-size: cover;
                background-size: cover;
            }
         
        </style>
         <script>

        function validateForm() {
            var pass = document.getElementById("userpassword").value;
            var pass_regex = /^[a-zA-Z]{7,20}$/;
            var username = document.getElementById("username").value;
            var username_regex = /^[0-9]{6,10}$/;

            if (username.match(username_regex) && username.length >= 6) {
                document.getElementById("username").style.borderColor = "green";
                document.getElementById("wrongID").innerHTML = "";
            }
            else {
                document.getElementById("username").style.borderColor = "red";
                document.getElementById("username").value="";
                document.getElementById("wrongID").style.color = "red";
                document.getElementById("wrongID").innerHTML = "*";
                alert("Entered Username/Password is wrong");
                return false;
            }
            if (pass.match(pass_regex)) 
            {
                document.getElementById("userpassword").style.borderColor = "green";
                document.getElementById("wrongPassword").innerHTML = "";
            }
            else {
                document.getElementById("userpassword").style.borderColor = "red";
                document.getElementById("userpassword").value="";
                document.getElementById("wrongPassword").style.color = "red";
                document.getElementById("wrongPassword").innerHTML = "*";
                alert("Entered Username/Password is wrong");
                return false;
            }
            var type = document.getElementsByName("forRadio");
            if (type[0].checked)
            {
                console.log("customer");               
            }
            else if( type[1].checked) 
            {
                console.log("mechanic");               
            }
            else 
            {
                alert("Please Select Your Type");
                return false;
            }
        }
    </script>
</head>
<body>
	<header>
	<div class="navigation">
		<div class=" check  p-1">
			<nav style="backface-visibility: hidden"
				class="nav justify-content fixed-top p-2"> <a
				class=" navbar-brand text-sm-center nav-link " href="index.jsp"> <img
				src="assets/images/logo.jpg" width="30" height="30"
				class="d-inline-block align-top"> On Road Assistance
			</a> <a class=" text-sm-right nav-link" href="login.html">Login</a> <a
				class=" text-sm-right nav-link active" href="#">SignUp</a> <a
				class=" text-sm-right nav-link" href="#" tabindex="-1">Help</a> </nav>
		</div>
	</div>
	</header>
	<div class=" container-fluid mt-5 test">
        <div class="row mt-3 ">
            <div class="col-3"></div>
            <div style="padding-top: 50%;" class=" mt-5 center col-4 justify-content-center mdc-card p-4 align-middle shadow" style="width: 300px">
                <div class="card-body ">
                    <label class="display-4">Sign In</label>
                    <form:form class="align-middle" modelAttribute="login" onsubmit="return validateForm()">
                        <div class="form-group">
                            <h6 style="text-align:left" class="form-control">Username</h6>
                            <form:input class="form-control" path="userId"
												id="username" autocomplete="off"
												name="userId" aria-describedby="IdHelp"
												placeholder="123456" data-toggle="popover"
												/>
                            <span id="wrongID"></span>
                        </div>
                        <div class="form-group">
                            <h6 style="text-align:left" class="form-control">Password</h6>
                            <form:password path="userPassword" class="form-control" name="userPassword" id="userpassword" placeholder="Password" aria-describedby="userpasswordhelp"/>
                            <span id="wrongPassword"></span>
                        </div>
                        <div class="mdc-form-field">
                                <div class="mdc-radio mt-1">
                                <form:radiobutton path="userType" class="mdc-radio__native-control forRadio" value="C" id="customer" name="type"/>
                                <div class="mdc-radio__background">
                                    <div class="mdc-radio__outer-circle"></div>
                                    <div class="mdc-radio__inner-circle"></div>
                                </div>
                            </div>
                            <h6 class="form-control">Customer</h6>
                            <div class="mdc-radio mt-1">
                                <form:radiobutton  path="userType" class="mdc-radio__native-control forRadio" value="M" id="mechanic" name="type"/>
                                <div class="mdc-radio__background">
                                    <div class="mdc-radio__outer-circle"></div>
                                    <div class="mdc-radio__inner-circle"></div>
                                </div>
                            </div>
                            <h6 class="form-control">Mechanic</h6>
                        </div>
                        <div class="mdc-card__primary-action mdc-card__actions--full-bleed" tabindex="0">
                            <button class="foo-button mdc-button" type="submit" class="btn btn-primary">Submit</button>
                        </div>

                    </form:form>
                </div>
            </div>
            <div class="col-3"></div>

        </div>
        <div class="row">
            <div class="col-5"></div>
            <div class="col-3" style="text-align: left" >
                <a href="#" style="text-decoration: none"><h6 style="color: #B0171F;" >&nbsp;&nbsp;&nbsp;&nbsp;Not Registered&nbsp;? Create new account&nbsp;?&nbsp;</h6></a>
            </div>
            <div class="col-4"></div>
        </div>
    </div>
    <footer class="footer">
       
    </footer>
	<script type="text/javascript"
		src="assets/scripts/material-components-web.min.js"></script>

	<script type="text/javascript" src="assets/scripts/jquery.min.js"></script>

	<script type="text/javascript"
		src="assets/scripts/jquery-3.3.1.slim.min.js"></script>

	<script type="text/javascript" src="assets/scripts/popper.min.js"></script>

	<script type="text/javascript" src="assets/scripts/bootstrap.min.js"></script>
</body>
</html>
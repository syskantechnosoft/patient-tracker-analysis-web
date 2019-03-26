<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="ISO-8859-1">
    <title>Add Medicine</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
        crossorigin="anonymous">
    <link rel="stylesheet" href="dashboard.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css">



    <style>
        hr {
	border: 1px solid #f1f1f1;
	margin-bottom: 10px;
}
.bg {
	background: #7386D5;
}
input[type=text], input[type=number],input[type=textarea],input[type=date],input[type=email] {
	width: 100%;
	padding: 12px 20px;
	background: transparent;
	border: none;
}
/* ADD PRODUCT Form*/
</style>

</head>

<body>

    <!--Navigation Bar-->
    <nav class="navbar navbar-expand-lg navbar-light " style="background:#ebeef9;">
        <div class="container-fluid">
            <div class="navbar-header">
                <a href="dashboard" class="navbar-brand">PatientX</a>
            </div>

        </div>
        <div align="right">
            <form class="navbar-form navbar-right">
                <button type="button" class="btn btn-project" data-toggle="modal" data-target="#logoutModal">Logout</button>
            </form>
        </div>

    </nav>
    <!--Navigation Bar-->

    <div class="d-flex mb-2 align-content-stretch">


        <div class="p-1 bg mr-2" style="border-radius: 5px;">

            <nav id="sidebar" style="box-shadow:0px 20px 50px grey; border-radius: 25px;">
                <div class="sidebar-header">
                    <h5>Hi Dipanjan,</h5>
                </div>


                <ul class="list-unstyled components">
                    <p>Management</p>
                    <li class="active"><a href="#homeSubmenu" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">Home</a>
                        <ul class="collapse list-unstyled" id="homeSubmenu">
                            <li><a href="#">home1</a></li>
                            <li><a href="#">home2</a></li>
                            <li><a href="#">home3</a></li>
                        </ul>
                    </li>

					<li><a href="listAllClerk">Clerk</a></li>
					<li><a href="listAllDoctor">Doctor</a></li>
					<li><a href="listAllPatient">Patient</a></li>
					<li><a href="listAllMedicine">Medicine</a></li>
					<li><a href="listAllPrescription">Prescription</a></li>
					<li><a href="#">Bill</a></li>
                    <li><a href="#pageSubmenu" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">About
                            Us</a>
                        <ul class="collapse list-unstyled" id="pageSubmenu">
                            <li><a href="#">Developer 1</a></li>
                            <li><a href="#">Developer 2</a></li>
                            <li><a href="#">Developer 3</a></li>
                            <li><a href="#">Developer 4</a></li>
                            <li><a href="#">Developer 5</a></li>
                        </ul>
                    </li>
                </ul>

                <ul class="list-unstyled CTAs">
                    <li><a href="#" class="download">Download code</a></li>
                    <li><a href="#" class="article">article</a></li>
                </ul>

            </nav>


        </div>



        <div class="p-1 flex-grow-1">

            <nav class="navbar navbar-expand-lg navbar-light bg-light " style=" box-shadow:0px 15px 50px 5px grey;border-radius: 5px;">

                <button type="button" id="sidebarCollapse" class="btn btn-project rounded-circle">
                    <i class="fa fa-align-justify"></i> <span></span>
                </button>

                <!--<a class="navbar-brand" href="#">Navbar</a> -->
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav"
                    aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNav">
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item active"><a class="nav-link" href="#">Home
                                <span class="sr-only">(current)</span>
                            </a></li>
                        <li class="nav-item"><a class="nav-link" href="#">Services</a>
                        </li>
                        <li class="nav-item"><a class="nav-link" href="#">Appointments</a>
                        </li>
                        <li class="nav-item"><a class="nav-link disabled" href="#">Disabled</a>
                        </li>
                    </ul>
                </div>
            </nav>

            <div class="container">
                <div class="card" style="box-shadow:0px 20px 50px grey;">
                    <div class="card-header" style="background:#eaeafb;">Medicine</div>
                    <div class="card-body">
                        <div style="background:#f0e8f7">


                            <form:form method="post" style="width: 100%;">
                                <form:input path="medicineDescription" type="text" name="description" placeholder="Medicine Description" required="required" />
                                <hr>
                                <form:input path="cureFor" type="text" name="curefor" placeholder="Cure For" required="required" />
                                <hr>
                                <form:input path="manufacturingCompany" type="number" placeholder="Manufacturing Company" min="1" max="130" name="company" required="required"/>
                                <hr>
                                <form:input path="dosage" type="number" name="dosage" placeholder="Enter Dosage Required" required="required" />
                                <hr>
                                <form:input path="prescribedFor" type="text" name="prescribedfor" placeholder="Medicine Prescribed For"
                                    required="required" />
                                <hr>
                                <form:input path="amount" type="number" name="amount" 
                                    placeholder="Enter Medicine Amount" required="required"/>
                                <hr>
                                <div align="right">
                                    <input type="submit" class="btn btn-project" value="ADD" name="add"> <input type="reset"
                                        class="btn btn-danger" value="Cancel">
                                </div>
                            </form:form>
                        </div>
                    </div>
                    <div class="card-footer"></div>
                </div>
            </div>



        </div>


    </div>







    <!--Logout Modal-->
    <div class="modal fade" id="logoutModal">
        <div class="modal-dialog">
            <div class="modal-content">
                <!-- Modal Header -->
                <div class="modal-header">
                    <h4 class="modal-title">Logout</h4>
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                </div>
                <!-- Modal body -->
                <!--Update Modal-->
                <div class="modal-body">
                    <hr>
                    Are you Sure? <br>
                    <hr>
                    <form action="logout" method="post">
                        <input type="submit" name="logout-option" value="Yes" class="btn btn-content btn-block" /> <br>
                    </form>
                </div>
                <!-- Modal footer -->
                <div class="modal-footer">
                    <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
                </div>
            </div>
        </div>
    </div>
    <!--Logout Modal-->



    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
        crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
        crossorigin="anonymous"></script>

    <script>
        $(document).ready(function () {
            $('#sidebarCollapse').on('click', function () {
                $('#sidebar').toggleClass('active');
            });
        });  
    </script>


</body>

</html>
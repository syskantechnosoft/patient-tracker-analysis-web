<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>

<!-- Bootstrap CSS -->
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css">
<link rel="stylesheet" href="registration.css">

</head>
<body>



	<!-- Registration Form -->
	<div class="container">
		<h2 class="well">Registration Form</h2>
		<div class="col-lg-12 well">
			<div class="row">
				<form:form action="registerAdmin" method="post" modelAttribute="admin">
					<div class="col-sm-12">
						<div class="row">
							<div class="col-sm-6 form-group">
								<label>First Name</label> <form:input path="firstName" type="text"
									placeholder="First Name" class="form-control" name="first-name" required="required" />
							</div>
							<div class="col-sm-6 form-group">
								<label>Last Name</label> <form:input path="lastName" type="text"
									placeholder="Last Name" class="form-control" name="last-name" required="required" />
							</div>
						</div>
					
						<div class="row">
							<div class="col-sm-4 form-group">
								<label>Age</label> <form:input path="age" type="number"
									placeholder="Age" class="form-control" min="1" max="130" name="age" required="required" />
							</div>
							<div class="col-sm-4 form-group">
								<div class="form-group">
									<label for="gender">Gender (select one):</label> <form:select path="gender"
										class="form-control" id="gender" name="gender" >
										<form:option value="Male">Male</form:option>
										<form:option value="Female">Female</form:option>
									</form:select>
								</div>
							</div>
							
							<div class="col-sm-4 form-group">
								<label>Date of Birth</label> <form:input path="dateOfBirth" type="date"
									placeholder="Select"  class="form-control" max="2019-04-02" name="dob" required="required" />
							</div>
						</div>
					
						<div class="form-group">
							<label>Contact Number</label> <form:input path="contactNumber" type="number"
								placeholder="Enter Phone Number Here" class="form-control" name="contact" required="required" />
						</div>
						<div class="form-group">
							<label>Alternate Contact Number</label> <form:input path="alternateContactNumber" type="number" placeholder="Enter Phone Number Here" class="form-control" name="altcontact" />
						</div>
						
						<div class="form-group">
							<label>Email Address</label> <form:input path="emailId" type="email" placeholder="Enter Email Address Here" class="form-control" name="email" required="required" />
						</div>
						
						<div class="form-group">
							<label>Password</label> <form:input path="password" type="password"
								placeholder="Enter Password here" class="form-control" name="pass" required="required" />
						</div>
					
						<div class="form-group">
							<label>Confirm Password</label> <form:input path="confirmPassword" type="password"
								placeholder="Enter Password here" class="form-control" name="cfnpass" required="required" />
						</div>
                        
                        <div class="col-md-12">
                            <div class="checkbox">
                                <label>
                                    <input type="checkbox" value="" id="" />
                                    I accept the <a href="#">terms and conditions</a>.
                                </label>
                            </div>
                        </div>
                    </div>

                    <div class="form-group">
                        <div class="col-md-12">
                            <button type="submit" class="btn btn-project" name="registerAdmin">
                                Register
                            </button>
                            <a href="Home.jsp">Already have an account?</a>
                        </div>
                    </div>
                    </form:form>
					
					</div>
				
			</div>
		</div>
	
	<!-- Registration Form -->
	
<script type="text/javascript">
$(document).ready(function() {
    $('#found_site').on('change', function() {
       $(this).val() == "other" ? $('#specify').closest('.form-group').show() : $('#specify').closest('.form-group').hide();
    })
})
</script>	
	
</body>
</html>
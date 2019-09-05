<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title></title>

    <!-- Bootstrap -->
   <!-- <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">  -->
    
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
<body>
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="bootstrap/js/bootstrap.min.js"></script>
    
    <h2><a href="welcome" class="btn btn-default">Check-For-log4j</a></h2>
    
<div class="container"> 
	<!-- <div class="row justify-content-center">
		<form action="" method="post">
			<div class="form-group">
				<label>Name</label>
				<input type="text" name="name" class="form-control" value="Enter your Name">
			</div>
			<div class="form-group">
				<label>Location</label>
				<input type="text" name="name" class="form-control" value="Enter your Location">
			</div>
		
			<div class="form-group">
				<button type="submit" name="save" class="btn btn-primary">Save</button>
			</div>
		
		</form>  
	</div> -->
	
    <hr>
    
	<div class="row justify-content-center">	
			<table class="container" style="background-color:#525b75">
				<thead>
					<tr class="text-white"><th><h1 class="col-md-6">All Employees List</h1></th>
						<th><h2><a href="addEmployee.jsp" class="btn btn-info">Add Employee</a></h2></th>
					</tr>		
				</thead>
			</table>
			
			<hr>
			
			<table class="table" >
				<thead>
					<tr>
						<th>Employee Name</th>
						<th>Salary</th>
						<th>Actions</th>
					</tr>
				</thead>
				<tr>
					<td>Raju</td>
					<td>40000</td>
					<td>
						<a href="#" class="btn btn-default">View</a>
						<a href="#" class="btn btn-info">Edit</a>
						<a href="#" class="btn btn-danger">Delete</a>
					</td>
				</tr>
				
			</table>
	</div>
	
</div>

  <hr>
  </body>
</html>
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
   <link href="css/custom.css" rel="stylesheet">
    
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
    <hr>
<div class="container"> 
	<div class="row justify-content-center">
		<table class="container" style="background-color:#525b75">
				<thead>
					<tr class="text-white"><th><h1 class="col-md-6">Enter Employee Details</h1></th>
						<!-- <th><h2><a href="#" class="btn btn-info">Add Customer</a></h2></th> -->
					</tr>		
				</thead>
		</table>
	
		<form action="" method="post">
		<hr>
			<div class="form-group">
				<label>Employee Name</label>
				<input type="text" name="name" class="form-control" placeholder="Employee Name">
			</div>
			<div class="form-group">
				<label>Salary</label>
				<input type="text" name="name" class="form-control" placeholder="Salary">
			</div>
		
			<div class="form-group">
				<input type="submit" value="Save" class="btn btn-primary"/>
				<input type="reset"  value="Reset" class="btn btn-primary"/>
				<a href="employeeList.jsp" class="btn btn-primary">Back</a>
			</div>
		
		</form>  
	</div> 
	
</div>

<hr>
  
  </body>
</html>
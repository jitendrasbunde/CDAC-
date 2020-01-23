<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
	
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container-fluid">
<div class="row">
	<div class="col-3"></div>
	<div class="col-6">
	<div><h2>Add Mentor</h2></div>
	
	<form method="post" action="addmentor">
	<div class="form-group">
    	<label for="exampleInputPassword1">Mentor ID</label>
    	<input type="text" name="mentor_Id" class="form-control" id="exampleInputPassword1">
  	</div>
	   
   	<div class="form-group">
    	<label for="exampleInputPassword1">First Name</label>
    	<input type="text" name="f_Name" class="form-control" id="exampleInputPassword1">
 	</div>
  	<div class="form-group">
    	<label for="exampleInputPassword1">Last Name</label>
    	<input type="text" name="l_Name" class="form-control" id="exampleInputPassword1">
  	</div>
   	<div class="form-group">
    	<label for="exampleInputPassword1">Position</label>
    	<input type="text" name="position" class="form-control" id="exampleInputPassword1">
  	</div>
  	<div class="form-group">
    	<label for="exampleInputEmail1">Email address</label>
    	<input type="email" name="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">

  	</div> 
  	<button type="submit" class="btn btn-primary">Update</button>
</form>
</div> 
</div>
</div>
</body>
</html>
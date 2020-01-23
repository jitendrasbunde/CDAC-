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
	<div><h2>Update Mentor</h2></div>
	
	<form method="post" action="addbatch1">  
   	<div class="form-group">
    	<label for="exampleInputPassword1">Batch Name</label>
    	<input type="text" name="name" class="form-control" id="exampleInputPassword1">
 	</div>
  
  	<div class="form-group">
    	<label for="exampleInputPassword1">Student Start</label>
    	<input type="text" name="start" class="form-control" id="exampleInputPassword1">
  	</div>
  	<div class="form-group">
    	<label for="exampleInputPassword1">Student End</label>
    	<input type="text" name="end" class="form-control" id="exampleInputPassword1">
  	</div>
   	> 
  	<button type="submit" class="btn btn-primary">Update</button>
</form>
</div> 
</div>
</div>
</body>
</html>
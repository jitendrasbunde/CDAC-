<%@page import="com.example.demo.dto.Batch"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ include file="header.html" %> 

<%
List<Batch> list = (List<Batch>)request.getAttribute("list");
int i=1;
%>
	
	  <div class="row" style="height:80px">jitu</div>
	<div class="row">
		<div class="col-2">
		
		</div>
		<div class="col-8 ">
			<div class="row " style="height: 150px">
				<div class="col-4"> <input  type="submit" class="btn btn-success" value="Add Batch" onclick="location.href='addbatch'" /> </div>
        		<div class="col-4"> <input  type="submit" class="btn btn-success" value="Add Mentor" onclick="location.href='mentoradd'" /> </div>
        		<div class="col-4"> <input  type="submit" class="btn btn-success" value="Add Alumni" onclick="location.href='AddBatch'" /> </div>
      
			 </div>
			 	<div class="row " style="height: 150px">
				<div class="col-4"> <input  type="submit" class="btn btn-success" value="Batch List" onclick="location.href='page1'" /> </div>
        		
      
			 </div>
		</div>
		<div class="col-2"></div>	
	</div>
	
<%@ include file="footer.html" %> 

</body>
</html>
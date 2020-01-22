<%@page import="com.example.demo.dto.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="header.html" %> 

 
    <div class="row" style="height:80px">jitu</div>
	<div class="row">
		<div class="col-2">
		
		</div>
		<div class="col-8 ">
			<div class="row " style="height: 150px">
				<div class="col-4"> <input  type="submit" class="btn btn-success" value="Add Batch" onclick="location.href='AddBatch'" /> </div>
        		<div class="col-4"> <input  type="submit" class="btn btn-success" value="Add Mentor" onclick="location.href='AddBatch'" /> </div>
        		<div class="col-4"> <input  type="submit" class="btn btn-success" value="Add Alumni" onclick="location.href='AddBatch'" /> </div>
      
			 </div>
			 	<div class="row ">
				<table class="table">
					  <thead>
					    <tr>
					      <th scope="col">#</th>
					      <th scope="col">Batch</th>
					      <th scope="col">Start</th>
					      <th scope="col">End</th>
					    </tr>
					  </thead>
					  <% for(User p:list){ %>
					    <tr>
					      <th scope="row">1</th>
					      <td>Mark</td>
					      <td>Otto</td>
					      <td>@mdo</td>
					    </tr>
					   <%} %>
					    
					  </tbody>
					</table>		
	 </div>
		
		</div>
		<div class="col-2"></div>	
	</div>

    
    <%@ include file="footer.html" %>
</body></html>
<%@page import="java.util.List"%>
<%@page import="com.example.demo.dto.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ include file="header.html" %> 

<%
List<Student> list = (List<Student>)request.getAttribute("slist");
int i=1;
%>
	
	  <div class="row" style="height:80px">jitu</div>
	<div class="row">
		
		<div class="col-12 ">
			 	<div class="row ">
				<table class="table-sm table-bordered table-dark" >
					  <thead>
					    <tr>
					      <th scope="col">ID</th>
					      <th scope="col">Name</th>
					      <th scope="col">Email</th>
					      <th scope="col">Year_Down</th>
					      <th scope="col">SSC Board</th>
					      <th scope="col">SSC Per</th>
					      <th scope="col">SSC Year</th>
					      <th scope="col">HSC Board</th>
					      <th scope="col">HSC Per</th>
					      <th scope="col">HSC Year</th>
					      <th scope="col">Deploma Board</th>
					      <th scope="col">Deploma Per</th>
					      <th scope="col">Deploma Year</th>
					      <th scope="col">Degree Board</th>
					      <th scope="col">Degree Per</th>
					      <th scope="col">Degree Year</th>
					    </tr>
					  </thead>
					  <% 
					 if(list!=null){
					  for(Student p : list){ %>
					    <tr>
					      <th scope="row"><%= i %></th>
					      <td><%= p.getName()%></td>
					      <td><%=p.getEmail() %></td>
					      <td><%=p.getYear_Down() %></td>
					      <td><%=p.getSsc_Broard()%></td>
					      <td><%=p.getSsc_Per()%></td>
					      <td><%=p.getSsc_Year()%></td>
					      <td><%=p.getHsc_Broard()%></td>
					      <td><%=p.getHsc_Per()%></td>
					      <td><%=p.getHsc_Year()%></td>
					      <td><%=p.getDeploma_Broard()%></td>
					      <td><%=p.getDeploma_Per()%></td>
					      <td><%=p.getDeploma_Year()%></td>
					      <td><%=p.getDegree_Broard()%></td>
					      <td><%=p.getDegree_Per()%></td>
					      <td><%=p.getDegree_Year()%></td>
					    </tr>
					    <%i=i+1;%>
					   <%} 
					 }
					   %>
					    
					  </tbody>
					</table>		
	 </div>
		
		</div>
		
<%@ include file="footer.html" %> 

</body>
</html>
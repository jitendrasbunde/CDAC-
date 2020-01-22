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
	<div class="row ">
				<table class="table">
					  <thead>
					    <tr>
					      <th scope="col">Batch</th>
					      <th scope="col">Start</th>
					      <th scope="col">End</th>
					      <th scope="col">Select</th>
					    </tr>
					  </thead>
					  <% 
					 if(list!=null){
					  for(Batch p : list){ %>
					    <tr>
					      <td><%= p.getName()%></td>
					      <td><%=p.getStart() %></td>
					      <td><%=p.getEnd() %></td>
					      <td><a href="onebatch?bno=<%=i%>">Enter</a></td>
					    </tr>
					    
					   <%i=i+1; 
					  } 
					 }
					   %>
					    
					  </tbody>
					</table>
	 </div>
	 <%@ include file="footer.html" %> 
</body>
</html>
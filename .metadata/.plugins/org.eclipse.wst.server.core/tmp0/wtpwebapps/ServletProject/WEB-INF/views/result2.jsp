<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><%= request.getParameter("orderer") %> 님의 주문 결과</title>
</head>
<body>



	
	<h3>주문자 : <%= request.getParameter("orderer") %> </h3>
		
		<h3> 주문한 커피 : 
		
			<% if(request.getParameter("type").equals("ice")) { %>
				차가운
			<% } else { %>
				따뜻한
			<% }  %>
			
			<%= request.getParameter("coffee") %> 
		</h3>
		
		<% if(request.getParameterValues("opt") != null) {%>
			<ul>
				<% for(String s : request.getParameterValues("opt")) { %>
					<li> <%= s %> </li>
				<% } %>
			</ul>
		<% } else { %>
			<li>옵션없음</li>
		<% } %>
	


</body>
</html>
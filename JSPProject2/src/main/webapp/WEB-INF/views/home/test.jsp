<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test</title>
</head>
<body>
	
	<h1>TEST</h1>
	
	<ul>
		<li>
			page scope <br>
			
			<% 
				pageContext.setAttribute("pageValue", "pageValue 입니다");
				

			%>
			<br>
		
			${pageScope.pageValue}
			
		</li>
		
		<li>
			request scope <br>
			
			${requestScope.reqValue}
			
		</li>
		
		<li>
			session scope <br>
			
			${session.sessionValue}
			
		</li>
	
	</ul>
	
</body>
</html>
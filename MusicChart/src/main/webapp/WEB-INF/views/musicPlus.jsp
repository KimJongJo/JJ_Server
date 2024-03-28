<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Music List</title>
</head>
<body>

	<a href="/">재생목록</a>

	<table>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>가수</th>
			<th>좋아요</th>
		</tr>
		
		<c:forEach var="music" items="${sessionScope.musicChart}">
		<tr>
			<td>${music.songNo}</td>
			<td><a href="/songInfo?songNo=${music.songNo}">${music.songTitle}</a></td>
			<td><a href="/singerSong">${music.songSinger}</a></td>
			<td>${music.songLike}</td>
			<td><a href="/append?songNo=${music.songNo}"> + </a></td>
		</tr>
		
		</c:forEach>
		
	</table>
	
	
	<c:if test="${not empty sessionScope.message}">
    
    	<script>
    		alert('${message}');
    	</script>
    	
    	<c:remove var="message" scope="session" />
    </c:if>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Music List</title>
<link rel="stylesheet" href="/resources/css/musicList.css">

<script src="https://kit.fontawesome.com/b5ec955390.js" crossorigin="anonymous"></script>
</head>
<body>

 <main>
        <div id="top">
            <a href="/" id="back"><i class="fa-solid fa-arrow-left" id="menu-btn">뒤로</i></a>
            <span id="music-list">노래 목록</span>
        </div>
	
		<table>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>가수</th>
				<th>좋아요</th>
				<th><i class="fa-solid fa-square-plus" id="btn-size"></i></th>
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
		
	</main>		
	
	
	<c:if test="${not empty sessionScope.message}">
    
    	<script>
    		alert('${message}');
    	</script>
    	
    	<c:remove var="message" scope="session" />
    </c:if>

</body>
</html>
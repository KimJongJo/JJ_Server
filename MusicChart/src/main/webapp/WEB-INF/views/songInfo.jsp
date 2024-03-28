<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>노래 정보</title>
</head>
<body>
	
	<a href="/plus">뒤로가기</a>
	
	<div>
		<div>
			<!-- 제목 -->
			<span>${requestScope.musicChart.songTitle}</span>
			<!-- 장르 -->
			<span>${requestScope.musicChart.songGenre}</span>
			<!-- 가수 -->
			<span>${requestScope.musicChart.songSinger}</span>
		</div>
		<span>${requestScope.musicChart.songLike}</span>
		<!-- 가사 -->
		<div>${requestScope.musicChart.songLyrics}</div>
	</div>
	
</body>
</html>
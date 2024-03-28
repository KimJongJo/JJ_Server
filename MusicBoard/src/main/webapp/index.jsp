<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>메인 화면</title>
    <link rel="stylesheet" href="/resources/css/music_css.css">

    <script src="https://kit.fontawesome.com/b5ec955390.js" crossorigin="anonymous"></script>
    
</head>
<body>
    <div id="main">
        <div id="top">
            <span>JayJay Music</span><i class="fa-solid fa-music"></i>
        </div>
        <div id="under">
            <form action="" id="form" method="post">
                <div id="inner">
                    <input type="text" class="btn" name="inputId">
                    <input type="password" class="btn" name="inputPw">
                </div>
                <!-- 로그인 버튼 -->
                <button id="login-btn">로그인</button>
            </form>
            <!-- 회원가입 -->
            <a href="" id="signup-btn">회원가입</a>
        </div>
        <div id="bottom">
            <span>v.0.0.0</span>
        </div>
    </div>
</body>
</html> 
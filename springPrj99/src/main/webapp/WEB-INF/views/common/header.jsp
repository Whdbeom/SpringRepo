<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<style>
		body{
			padding: 0px;
			margin: 0px;
			box-sizing: border-box;
		}
		.wrap{
			width: 100vw;
			height: 100vh;
			display: grid;
			grid-template-rows: 20vh 10vh 60vh 10vh;
			place-items: center center;
			align-items: start;
		}
		.header{
			width: 60%;
			height: 100%;
			background-color: gray;
			display: grid;
			grid-template-columns: 1fr 3fr 1fr;
			grid-template-rows: 1fr;
		}
		
		.header > div:nth-child(1) > img {
			width: 100%;
			height: 20vh;
		}

		.header > div:nth-child(2) > img {
			width: 100%;
			height: 20vh;
		}

		.navi{
			width: 60%;
			height: 60%;
			display: grid;
			grid-template-columns: repeat(4, 1fr);
			grid-template-rows: 1fr;
			place-items: center center;
			background-color: #c56cff;
			color: white;
			font-weight: bold;
			border-radius : 10px;
			margin-top: 10px;
		}

		.navi > div:hover{
			color: yellow;
			cursor: pointer;
		}

		.loginArea > form {
			width: 100%;
			height: 20vh;
			display: grid;
			grid-template-columns: 1fr 1fr;
			grid-template-rows: 1fr 1fr 1fr;
		}
		
		.logged{
			display: grid;
			grid-template-rows: 1fr 1fr;
			background-color: rgb(224, 16, 162);
			height: 20vh;
		}
		
		.logged > div:nth-child(2){
		    display: flex;
		    justify-content: center;
		    align-items: center;
   		 }
		
		.logged > div:last-child > button{
		    background-color: #6C1895;
		    height: 30px;
		    border: none;
		    border-radius: 19px;
		    width: 70px;
		    color: white;
		    font-weight: bold;
			cursor: pointer;
		}

		.loginArea > form > input:nth-child(1),
		.loginArea > form > input:nth-child(2) {
			grid-column: span 2;
		}

	</style>

	
	<div class="header">
		<div>
			<img src="./resources/zzzz.jpg" alt="이미지ㅋㅋ">
		</div>
		<div>
			<img src="./resources/271FE835587876C520.png" alt="이미지">
		</div>
		<c:if test= "${empty loginMember}">
			<div class="loginArea">
				<form action="/app/member/login" method="post">
					<input type="text" name="id" placeholder="아이디">
					<input type="password" name="pwd" placeholder="패스워드">
					<input type="button" value="회원가입" onclick="location.href='/app/member/join'">
					<input type="submit" value="로그인">
				</form>
			</div>
		</c:if>
		<c:if test= "${not empty loginMember}">
			<div class="logged">
				<div>
					<h3>
						${loginMember.nick}님 
						환영ㅇ하빈다~~!~@$!@
					</h3>
				</div>
				<div>
					<button onclick="location.href='/app/member/logout'">로그아웃</button>
				</div>
				
			</div>
		</c:if>
	</div>
	
	<div class="navi">
		<div>겍시판</div>
		<div>공지사항</div>
		<div>갤ㄹ러ㅣ</div>
		<div>마이펭지</div>
	</div>
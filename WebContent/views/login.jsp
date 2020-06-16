<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!--  タグライブラリの宣言-->
<%@ taglib prefix="c" uri= "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html>
<head>
<!-- 文字エンコーディングの指定 -->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<!-- CSS 取り込む -->
<link rel="stylesheet" href="css/login.css">

<title>SHINE_Login</title>
</head>
<body>

<div class="padding">

<h1>SHINE</h1>

<h2>LOGIN</h2>




<form action="/ShoppingSite/MainServlet" method="POST">


<input type ="text"name="username" placeholder="USERNAME"><br>
<input type ="password"name="password" placeholder="PASSWORD">



<input type="submit"value="LOGIN">

</form>
${requestScope.mainBean.msg}

<br><br>
<div class="register">

新規会員登録はこちら

<br>

<input type="submit"value="新規登録">



</div>





</div>
</body>
</html>

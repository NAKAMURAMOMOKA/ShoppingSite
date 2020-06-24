<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!--  タグライブラリの宣言-->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- 文字エンコーディングの指定 -->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<!-- CSS 取り込む -->
<link rel="stylesheet" href="css/manager.css">

<title>管理者画面</title>
</head>
<body>

	<h3>商品一覧</h3>

	<c:forEach items="${items}" var="items">

		<img src="${pageContext.request.contextPath}/img/${items.itemImg}"
			alt="">
		<br> 商品名<br> ${items.itemName} <br>
				${items.itemPrice} <br>円

				<p>${items.itemId}</p>

	</c:forEach>






</body>
</html>
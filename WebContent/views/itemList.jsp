<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!--  タグライブラリの宣言-->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>




<!DOCTYPE html>
<html>
<head>
<!-- 文字エンコーディングの指定 -->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<!-- CSS 取り込む -->
<link rel="stylesheet" href="css/itemList.css">


<title>商品一覧</title>
</head>
<body>
	<div class="padding">
		<h1>ITEM LIST</h1>
		<c:forEach items="${items}" var="items">
			<form action="servlet/CartServlet" method="POST">
				<img src="${pageContext.request.contextPath}/img/${items.itemImg}"
					alt=""> <br> 商品名<br> ${items.itemName} <br>
				${items.itemPrice} <br>円

				<p>${items.itemId}</p>
				<p>
					数量:<select name="quantity">
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
					</select><br> <input class="botton" type="submit" value="カートに入れる">
				</p>
				<p>
					<input class="botton" type="submit" value="カートを確認">
				</p>
			</form>
		</c:forEach>
	</div>
</body>
</html>




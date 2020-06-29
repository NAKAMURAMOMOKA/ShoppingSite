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

	<h1>ITEM LIST</h1>
	<c:forEach items="${items}" var="items">
		<div class="padding">
			<form action="/ShoppingSite/CartServlet" method="POST">

				<img src="${pageContext.request.contextPath}/img/${items.itemImg}"
					alt="" width=200 hight=200> <br> 商品名<br>
				<p>${items.itemName}</p>
				${items.itemPrice} 円

				<p>${items.itemId}</p>

				数量:<select name="quantity">
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
				</select><br> <input class="botton" type="submit" value="カートに入れる"><br>
				<input type="hidden" name="itemName" value="${items.itemName}">
				<input type="hidden" name="itemPrice" value="${items.itemPrice}">
				<input type="hidden" name="itemId" value="${items.itemId}">
				<input type="hidden" name="itemImg" value="${items.itemImg}">

				<p>
					<input class="botton" type="submit" value="カートを確認">
				</p>

			</form>
		</div>
	</c:forEach>
</body>
</html>




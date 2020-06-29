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
	<div class="padding">
		<form action="/ShoppingSite/ProductUpdateServlet" method="POST">

			<p>
				<button type="submit">在庫更新</button>
			</p>
		</form>
		<form action="/ShoppingSite/AddProductServlet" method="POST">

			<p>
				<button type="submit">商品追加</button>
			</p>
		</form>
		<form action="/ShoppingSite/DeleteProductServlet" method="POST">

			<p>
				<button type="submit">商品削除</button>
			</p>
		</form>
		<c:forEach items="${items}" var="items">
			<table class="add">
				<tr>
					<td><img
						src="${pageContext.request.contextPath}/img/${items.itemImg}"
						alt="" width=350 hight=250></td>
					<td><br> 商品名<br> ${items.itemName} <br></td>
					<td>
						<p>${items.itemPrice}円</p>
					</td>

					<td>
						<p>${items.itemId}</p>
					</td>
				</tr>
			</table>

		</c:forEach>
	</div>


</body>
</html>
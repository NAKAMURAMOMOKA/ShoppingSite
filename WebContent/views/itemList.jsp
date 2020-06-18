<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!--  タグライブラリの宣言-->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:useBean id="beans" class="jp.co.aforce.beans.ItemBean"
	scope="request" />


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>商品一覧</title>
</head>
<body>


	<main>
		<h1>商品一覧</h1>

		<ul>
			<li>
				<form action="/ShoppingSite/item" method="POST">
					<img src="${pageContext.request.contextPath }/img/${data.item_img }">
					<c:out value="${data.item_name}" />
					<p>
						<c:out value="${data.item_price}" />
						円
					</p>


					<p>
						<c:out value="${data.item_id}" />
					</p>
					<p>
						数量:<select name="quantity">
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							</select><input class="botton" type="submit"value="カートに入れる">
</p>
				</form>
		</ul>
	</main>
</html>



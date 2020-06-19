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
<!-- 文字エンコーディングの指定 -->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<!-- CSS 取り込む -->
<link rel="stylesheet" href="css/itemList.css">


<title>商品一覧</title>
</head>
<body>


	<main>
		<h1>商品一覧</h1>

		<ul>
			<li>
				<form action="servlet/CartServlet" method="POST">
					<img src="${pageContext.request.contextPath }/img/${item.item_img}">



					<c:out value="${data.item_name}" />
					<p>
						<c:out value="${item.item_price}" />
						円
					</p>


					<p>
						<c:out value="${item.item_id}" />
					</p>



					<p>
						数量:<select name="quantity">
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							</select><br><input class="botton" type="submit"value="カートに入れる">
</p>
				</form>
		</ul>
	</main>
</html>



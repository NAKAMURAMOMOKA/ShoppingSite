<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.List" import= "jp.co.aforce.beans.CartBean"%>

      <!--  タグライブラリの宣言-->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- CSS 取り込む -->
<link rel="stylesheet" href="css/cancelCheck.css">
<title>購入取り消し確認</title>
</head>
<body>
	<h3>以下の内容の購入を取り消しますか？</h3>

	<div class="cart">
		<%!int price = 0;
	int count = 0;%>
		<%
			List<CartBean> cart = (List<CartBean>) session.getAttribute("cart");
		for (CartBean cartBean : cart) {
			String item_name = cartBean.getCartName();
			int item_price = cartBean.getCartPrice();
			String item_img = cartBean.getCartImg();
		%>
		商品名：<%=item_name%><br> 値段：<%=item_price%>円<br> <img
			src="${pageContext.request.contextPath}/img/<%=item_img %>" alt=""
			width=150 height=150><br>


		<%
			count = count + item_price;
		}
		%>


		合計：<%=count%>円


		<form action="/ShoppingSite/CancelServlet" method="POST">

			<p>
				<input class="botton" type="submit" value="取り消す">
			</p>
		</form>
		<form action="/ShoppingSite/CancelStopServlet" method="POST">

			<p>
				<input class="botton" type="submit" value="取り消しを中断する">
			</p>
		</form>
</body>
</html>
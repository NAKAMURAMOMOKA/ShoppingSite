<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.List" import= "jp.co.aforce.beans.CartBean"%>

      <!--  タグライブラリの宣言-->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- CSS 取り込む -->
<link rel="stylesheet" href="css/check.css">
<title>購入確認</title>
</head>
<body>
	<h3>以下の内容で購入手続きをします。</h3>


<div class="cart">
		<%!int price = 0;
	       int totalPrice = 0;%>
		<%
			List<CartBean> cart = (List<CartBean>) session.getAttribute("cart");
		    request.setAttribute("carts",cart);
		    for (CartBean cartBean : cart) {
			    int price = cartBean.getCartPrice();
			    totalPrice = totalPrice + price;
		    }
		%>

		<c:forEach items="${carts}" var="items">
              商品名：${items.cartName}<br>
               値段：<div class ="subtotal">${items.cartPrice}</div>円<br>
			<img src="${pageContext.request.contextPath}/img/${items.cartImg}"
				alt="" width=150 height=150>
			<br>

		</c:forEach>

		合計：<div id="total"></div>円
		<form action="/ShoppingSite/ResultServlet" method="POST">

			<p>
				<input class="botton" type="submit" value="購入する">
			</p>
		</form>
		<form action="/ShoppingSite/CancelCheckServlet" method="POST">

			<p>
				<input class="botton" type="submit" value="購入を取り消す">
			</p>
			</form>
	</div>
</body>
<script>
    // subtotal というクラスの要素を全て取得し、配列で保持
    let targetElem = document.querySelectorAll('.subtotal');
    let total = 0;
    for (let i = 0; i < targetElem.length; i++) {
        // 取得した要素から内容を取り出し、total に足していく
        // textContent は文字列を返すので、数値にキャストする
        total += Number(targetElem[i].textContent)
    };
    // p要素を作成
    let element = document.createElement('p')
    // 要素の内容に total を追加
    element.innerText = total
    // id が total の要素の最後に p 要素を追加
    let div = document.getElementById('total')
    div.appendChild(element)
</script>
</html>
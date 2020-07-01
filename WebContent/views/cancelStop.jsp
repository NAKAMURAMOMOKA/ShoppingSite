<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- CSS 取り込む -->
<link rel="stylesheet" href="css/cancelStop.css">
<title>購入取り消し中断</title>
</head>
<body>
	<h2>購入の取り消しを中断いたしました。</h2>
<div class="cart">
	<form action="/ShoppingSite/BuyItemServlet" method="POST">

		<p>
			<input class="botton" type="submit" value="メニュー画面に戻る">
		</p>

	</form>


	<form action="/ShoppingSite/LogoutServlet" method="POST">

		<p>
			<input class="botton" type="submit" value="ログアウトする">
		</p>

	</form>
	</div>

</body>
</html>
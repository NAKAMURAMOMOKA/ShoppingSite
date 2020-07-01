<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- CSS 取り込む -->
<link rel="stylesheet" href="css/cancel.css">
<title>購入取り消し完了</title>
</head>
<body>
<h2>取り消しを完了いたしました。カートは空です。</h2>
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
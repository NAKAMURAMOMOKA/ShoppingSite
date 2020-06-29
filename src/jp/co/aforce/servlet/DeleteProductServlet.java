package jp.co.aforce.servlet;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//●商品削除●管理者

//親クラスに HttpServlet を指定する
@SuppressWarnings("serial") // これがないと waring がでる
public class DeleteProductServlet extends HttpServlet {

	//GET
@Override
public void doGet(HttpServletRequest request, HttpServletResponse response)
 throws IOException, ServletException {
	 System.out.println("get repuest");


	 //在庫更新ボタンを押すと、登録ページへ飛ぶ
 RequestDispatcher rDispatcher = request.getRequestDispatcher("/views/deleteProduct.jsp");
 rDispatcher.forward(request, response);
}

//POST
@Override
public void doPost(HttpServletRequest request, HttpServletResponse response)
 throws IOException, ServletException {
	 System.out.println("post request");
	// 文字のエンコードを UTF-8 とする。これがないと文字化け。
 request.setCharacterEncoding("UTF-8");



}
}
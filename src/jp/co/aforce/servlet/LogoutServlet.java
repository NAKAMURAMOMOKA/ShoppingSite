package jp.co.aforce.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


//親クラスに HttpServlet を指定する
@SuppressWarnings("serial") // これがないと waring がでる
public class LogoutServlet extends HttpServlet {

	//GET
@Override
public void doGet(HttpServletRequest request, HttpServletResponse response)
   throws IOException, ServletException {
	 System.out.println("get repuest");



   RequestDispatcher rDispatcher = request.getRequestDispatcher("/views/logout.jsp");
   rDispatcher.forward(request, response);
}

  //POST
@Override
public void doPost(HttpServletRequest request, HttpServletResponse response)
   throws IOException, ServletException {
	 System.out.println("post request");
	// 文字のエンコードを UTF-8 とする。これがないと文字化け。
   request.setCharacterEncoding("UTF-8");

   HttpSession session = request.getSession(true);
   session.invalidate();

	String forward_jsp = "/views/logout.jsp";
	forward_jsp = "/views/logout.jsp";

	// forwaed_jsp に設定されているJSPへディスパッチ
	RequestDispatcher rDispatcher = request.getRequestDispatcher(forward_jsp);
	rDispatcher.forward(request, response);

}
}
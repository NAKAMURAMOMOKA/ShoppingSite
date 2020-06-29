package jp.co.aforce.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


		//親クラスに HttpServlet を指定する
		@SuppressWarnings("serial") // これがないと waring がでる
		public class CancelStopServlet extends HttpServlet {

			//GET
		@Override
		public void doGet(HttpServletRequest request, HttpServletResponse response)
		   throws IOException, ServletException {
			 //System.out.println("get repuest");


			 //購入取り消しボタンを押すと取り消し完了確認画面に移行
		   RequestDispatcher rDispatcher = request.getRequestDispatcher("/views/cancelStop.jsp");
		   rDispatcher.forward(request, response);
		}

		  //POST
		@Override
		public void doPost(HttpServletRequest request, HttpServletResponse response)
		   throws IOException, ServletException {
			// System.out.println("post request");
			 // 文字のエンコードを UTF-8 とする。これがないと文字化け。
			 request.setCharacterEncoding("UTF-8");


			String forward_jsp = "/views/cancelStop.jsp";
			forward_jsp = "/views/cancelStop.jsp";

			// forwaed_jsp に設定されているJSPへディスパッチ
			RequestDispatcher rDispatcher = request.getRequestDispatcher(forward_jsp);
			rDispatcher.forward(request, response);

		}

		}


package jp.co.aforce.servlet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.aforce.beans.CartBean;



//●カート●
//親クラスに HttpServlet を指定する
@SuppressWarnings("serial") // これがないと waring がでる
public class CartServlet extends HttpServlet {



	//GET
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		System.out.println("post request");

	}

	//POST
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		System.out.println("get repuest");

		// 文字のエンコードを UTF-8 とする。これがないと文字化け。
		request.setCharacterEncoding("UTF-8");
		//セッション
		HttpSession session = request.getSession();

		List<CartBean> cart = (List <CartBean>)session.getAttribute("cart");

		//カートが空だったら新たに作成
		if(cart == null) {
			cart = new ArrayList<CartBean>();
		}

		String item_name =request.getParameter("itemName"); //商品名
		String item_id = request.getParameter("itemId"); 	// 商品ID
		int item_price = Integer.parseInt(request.getParameter("itemPrice"));
		String item_img = request.getParameter("itemImg"); //商品画像

		CartBean cartBean = new CartBean();
		cartBean.setCartName(item_name);
		cartBean.setCartId(item_id);
		cartBean.setCartPrice(item_price);
		cartBean.setCartImg(item_img);

		cartBean.getCartName();
		cartBean.getCartId();
		cartBean.getCartPrice();
		cartBean.getCartImg();

		/*
		if (session == null) {
			System.out.println("<p>セッションは存在しません。開始します</p>");
			session = request.getSession();
		} else {

			System.out.println("カートに入れました");
			session.setAttribute("cartBean", cartBean);

		}
		*/

		cart.add(cartBean);
		session.setAttribute("cart",cart);

		//カートに追加ボタンを押すと遷移する
		RequestDispatcher rDispatcher = request.getRequestDispatcher("/views/cart.jsp");
		rDispatcher.forward(request, response);


		// forwaed_jsp に設定されているJSPへディスパッチ
		//RequestDispatcher rDispatcher = request.getRequestDispatcher(forward_jsp);
		//rDispatcher.forward(request, response);


	}
}
package jp.co.aforce.servlet;


import java.io.IOException;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.aforce.beans.ItemBean;
import jp.co.aforce.models.ItemModel;


public class BuyItemServlet extends HttpServlet {
	//private static final long serialVersionUID = 1L;
	//public BuyItemServlet() {
		//super();
//	}


	@Override

	public void doGet(HttpServletRequest request, HttpServletResponse response)

			throws ServletException, IOException {

		System.out.println("get method");

		RequestDispatcher rDispatcher = request.getRequestDispatcher("views/itemList.jsp");

		rDispatcher.forward(request, response);

	}

	@Override

	public void doPost (HttpServletRequest request, HttpServletResponse response)

			throws ServletException, IOException {

		System.out.println("post method");

		RequestDispatcher rd = request.getRequestDispatcher("views/itemList.jsp");

		rd.forward(request, response);


	// 文字のエンコードを UTF-8 とする。これがないと文字化け。
			request.setCharacterEncoding("UTF-8");


	// 商品情報を取得

	ItemModel itemmodel = new ItemModel();

	List<ItemBean> items= itemmodel.getItem();

request.setAttribute("items", items);

		// GETメソッドのパラメータ名を取得

		Enumeration<String> names = request.getParameterNames();



		String item_name =request.getParameter("item_name"); //商品名

		String item_id = request.getParameter("item_id"); 	// 商品ID

	    int item_price= request.getParameter("item_price"); //値段

	    String item_img = request.getParameter("item_img"); //商品画像


        ItemBean itemBean = new ItemBean();
        itemBean.setItemName(item_name);
        itemBean.setItemId(item_id);
        itemBean.setItemPrice(item_price);
        itemBean.setItemImg(item_img);

        itemBean.getItemName();
        itemBean.getItemId();
        itemBean.getItemPrice();
        itemBean.getItemImg();

        String forward_jsp = "/views/itemList.jsp";
        RequestDispatcher rDispatcher = request.getRequestDispatcher("views/itemList.jsp");

		rDispatcher.forward(request, response);

	}
}





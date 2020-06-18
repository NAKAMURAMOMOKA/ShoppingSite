package jp.co.aforce.servlet;



import java.io.IOException;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.aforce.beans.ItemBean;
import jp.co.aforce.models.ItemModel;



@WebServlet("/BuyItemServlet")

public class BuyItemServlet extends HttpServlet {



    private static final long serialVersionUID = 1L;



    /**

     * コンストラクタ.

     */

    public BuyItemServlet() {

        super();

    }



    /**

     * GETメソッドで呼び出された場合の処理

     *

     * @param request

     * @param response

     * @throws javax.servlet.ServletException

     * @throws java.io.IOException

     */

    @Override

    protected void doGet(HttpServletRequest request, HttpServletResponse response)

            throws ServletException, IOException {



        // GETメソッドのパラメータ名を取得

        Enumeration<String> names = request.getParameterNames();



        String name;		// 現在のパラメータ名

        String item_id = "";		// 商品ID

        String purchased_num;	// 購入数



        // 購入ボタンがクリックされた場所を特定

        // 今回のサンプルプログラムの場合、クリックされた購入ボタンの値（value）と、リストボックスの値が取得できる

        // 購入ボタンをクリックした後のURLにパラメータが記載されています

        while (names.hasMoreElements()) {

            // 渡ってきたパラメータを順番に処理

            // パラメータ名を取得

            name = names.nextElement();



            // 購入ボタンがクリックされている場合は「購入」のパラメータが取得できる

            if ("購入".equals(request.getParameter(name))) {

                // 購入ボタンに付属している値（value）が商品IDになる

                item_id = name;

            }

        }



        // ドロップダウンリストから購入数を取得

        purchased_num = request.getParameter(item_id + "list");



        // 商品情報を取得

        ItemModel itemmodel = new ItemModel();

        List<ItemBean> items= itemmodel.getItem();

        System.out.println("item_id: " + item_id);



      request.setAttribute("items", items);




        RequestDispatcher rd = request.getRequestDispatcher("views/itemList.jsp");

        rd.forward(request, response);

    }



    @Override

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

}
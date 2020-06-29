package jp.co.aforce.models;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import jp.co.aforce.beans.CartBean;
import jp.co.aforce.util.DBUtil;

public class CartModel {
	public List<CartBean> getItem() {
		List<CartBean> cart = new ArrayList<CartBean>();

		ResultSet rs = null;

		try {

			// DBに接続するための手続
			DBUtil.makeConnection();
			DBUtil.makeStatement();

			// SQLを実行
			String SQL = "SELECT * FROM `item`";
			rs = DBUtil.execute(SQL);
			rs.beforeFirst();
			while (rs.next()) {

				// 商品IDを設定
				String item_id = rs.getString("item_id");
				// 商品名を設定
				String item_name = rs.getString("item_name");
				// 商品価格を設定
				int item_price = rs.getInt("item_price");
				//商品画像の設定
				String item_img = rs.getString("item_img");

				// 商品一覧を格納するBeanクラスをインスタンス化
				CartBean cart_bean = new CartBean(item_id, item_name, item_price, item_img);
				//System.out.println("itembean: " + item_bean);

				// Beanクラスをリストに追加
				cart.add(cart_bean);
			}

		} catch (Exception sqle) {
			sqle.printStackTrace();

		} finally {
			DBUtil.closeConnection();
		}
		return cart;
	}
}



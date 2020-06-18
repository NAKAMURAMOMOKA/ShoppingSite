package jp.co.aforce.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jp.co.aforce.beans.ItemBean;
import jp.co.aforce.util.DBUtil;


public class ItemModel {

	public List<ItemBean> getItem(){
	List<ItemBean> items = new ArrayList<ItemBean>();

		 ResultSet rs = null;

		 try {

	            // DBに接続するための手続

	            DBUtil.makeConnection();

	            DBUtil.makeStatement();


	            // SQLを実行
	            String SQL =  "SELECT * FROM `items`";
	            rs = DBUtil.execute(SQL);


           rs.beforeFirst();
			while (rs.next()) {

				// 商品IDを設定

				String item_id = rs.getString("item_id");

				// 商品名を設定

				String item_name = rs.getString("item_name");

				// 商品価格を設定

				int item_price = rs.getInt("item_price");





				// 商品一覧を格納するBeanクラスをインスタンス化

				ItemBean item_bean = new ItemBean(item_id, item_name, item_price);

				System.out.println("itembean: " + item_bean);

				// Beanクラスをリストに追加

				items.add(item_bean);

			}



		} catch (SQLException sqle) {

			sqle.printStackTrace();

		} finally {




		return items;

	}
	}}



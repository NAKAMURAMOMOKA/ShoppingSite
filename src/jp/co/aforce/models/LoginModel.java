package jp.co.aforce.models;

import java.sql.ResultSet;

import jp.co.aforce.util.DBUtil;


public class LoginModel {

	private String admin;

	public String getAdmin() {
		return admin;
	}

	public boolean loginCheck(String username, String password) {
		// 実行結果を格納する変数
		ResultSet rs = null;



		try {
			// DBに接続するための手続
			DBUtil.makeConnection();
			DBUtil.makeStatement();

			// SQLを実行
			String SQL = "SELECT * FROM `login` WHERE `username`='"+username+"' AND `password`='"+password+"'";
			rs = DBUtil.execute(SQL);
			 admin = rs.getString("admin");

			System.out.println(admin);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeConnection();
		}
		return rs != null;
	}
}
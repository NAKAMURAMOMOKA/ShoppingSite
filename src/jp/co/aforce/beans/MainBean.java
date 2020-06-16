package jp.co.aforce.beans;
import java.io.Serializable;
public class MainBean  implements Serializable{

	private String password;
	private String username;
	private String errro;
//ゲッター（パスワード）
public String getPassword() {

	return password;
	}

// セッター（パスワード）

public void setPassword(String password) {
	this.password=password;
}

//ゲッター（ユーザーネーム）
public String getUsername() {

	return username;
}

//セッター（ユーザーネーム）
 public void setUsername(String username) {
	this.username=username;
}
//セッター（エラー）
 public void setMsg(String errro) {
 	 this.errro= errro;
  }
 //ゲッター（エラー）
  public String getMsg() {
 	 return errro;
  }
}


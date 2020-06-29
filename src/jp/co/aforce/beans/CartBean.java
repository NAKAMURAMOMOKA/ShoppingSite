package jp.co.aforce.beans;

public class CartBean {

	private String item_id;
	private String item_name;
	private int item_price;
	private String item_img;
	private String msg;

	public CartBean(){

		this.item_id = "";
		this.item_name = "";
		this.item_price = 0;
		this.item_img ="";
	}

	public CartBean(String item_id, String item_name, int item_price, String item_img){

		this.item_id = item_id;
		this.item_name = item_name;
		this.item_price = item_price;
		this.item_img = item_img;
	}

	//item_id セッタ

	public void setCartId(String item_id){
		this.item_id = item_id;
	}

	//item_id ゲッタ

	public String getCartId(){
		return this.item_id;
	}

	//item_nameセッタ

	public void setCartName(String item_name){
		this.item_name = item_name;
	}

	//item_nameゲッタ

	public String getCartName(){
		return this.item_name;
	}

	//item_priceセッタ

	public void setCartPrice(int item_price){
		this.item_price = item_price;
	}

	//item_price ゲット

	public int getCartPrice(){
		return this.item_price;
	}

	//item_img セッタ

	public void setCartImg (String item_img){
		this.item_img = item_img;
	}

	//item_img ゲッタ

	public String getCartImg(){
		return this.item_img;
	}

    //msg ゲッタ
	public void setMsg(String msg) {
		this.msg=msg;
	}

	//msg セッタ
	public String getMsg() {
		return this. msg;

}
}



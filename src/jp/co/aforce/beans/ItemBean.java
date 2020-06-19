package jp.co.aforce.beans;

import java.io.Serializable;

public class ItemBean  implements Serializable{



	 private static final long serialVersionUID = 1L;



	    private String item_id;

	    private String item_name;

		private int item_price;

		private String item_img;





	    public ItemBean(){

	        this.item_id = "";

	        this.item_name = "";

	        this.item_price = 0;

	        this.item_img ="";

	    }



	    public ItemBean(String item_id, String item_name, int item_price, String item_img){

	    	this.item_id = item_id;

	    	this.item_name = item_name;

	    	this.item_price = item_price;

	    	this.item_img = item_img;

	    }

	    //item_id セッタ

	    public void setItemId(String item_id){

	    	this.item_id = item_id;

	    }

	    //item_id ゲッタ

	    public String getItemId(){

	    	return this.item_id;

	    }

	    //item_nameセッタ

	    public void setItemName(String item_name){

	    	this.item_name = item_name;

	    }

	    //item_nameゲッタ

	    public String getItemName(){

	    	return this.item_name;

	    }

	    //item_priceセッタ

	    public void setItemPrice(int item_price){

	    	this.item_price = item_price;

	    }

	    //item_price ゲット

	    public int getItemPrice(){

	    	return this.item_price;

	    }

	    //item_img セッタ

	    public void setItemImg (String item_img){

	    	this.item_img = item_img;

	    }

	    //item_img ゲッタ

	    public String getItemImg(){

	    	return this.item_img;

	    }
}




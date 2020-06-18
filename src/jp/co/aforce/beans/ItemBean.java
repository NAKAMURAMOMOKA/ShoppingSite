package jp.co.aforce.beans;

import java.io.Serializable;

public class ItemBean  implements Serializable{



	 private static final long serialVersionUID = 1L;



	    private String item_id_;

	    private String item_name_;

	    private int price_;





	    public ItemBean(){

	        this.item_id_ = "";

	        this.item_name_ = "";

	        this.price_ = 0;

	    }



	    public ItemBean(String item_id, String item_name, int price){

	        this.item_id_ = item_id;

	        this.item_name_ = item_name;

	        this.price_ = price;



	    }

//item_id セッタ

	    public void setItemId(String item_id){

	        this.item_id_ = item_id;

	    }

//item_id ゲッタ

	    public String getItemId(){

	        return this.item_id_;

	    }

//item_nameセッタ

	    public void setItemName(String item_name){

	        this.item_name_ = item_name;

	    }

//item_nameゲッタ

	    public String getItemName(){

	        return this.item_name_;

	    }

//item_priceセッタ

	     public void setPrice(int price){

	        this.price_ = price;

	    }

//item_price ゲッタ

	    public int getPrice(){

	        return this.price_;

	    }

	}


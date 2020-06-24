package jp.co.aforce.beans;

import javax.servlet.http.HttpSession;

public class CartBean {



	public int getAllPrice() {
		int sum = 0;
		int all = getItemCount();
		for ( int i = 0; i < all; i++ ) {
			sum += getitem_price( i ) * getCount( i );
		}
		return sum;
	}


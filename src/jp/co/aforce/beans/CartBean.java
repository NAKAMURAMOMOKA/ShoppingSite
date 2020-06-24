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

    /**
     * カートの取得。
     */
    public static Cart getCart( RequestParameter req ) {
        HttpSession session = req.getSession();
        Cart    cart = (Cart)session.getAttribute( SESSION );
        if ( cart != null ) return cart;
        cart = new Cart();
        session.setAttribute( SESSION, cart );
        return cart;
    }
}

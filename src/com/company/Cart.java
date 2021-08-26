package com.company;

import java.util.ArrayList;

public class Cart {

    private static Cart cart;

    static ArrayList<String> inCart = new ArrayList<String>();

    public static Cart getCart(){
        if(cart == null){
            cart = new Cart();
        }
        return cart;
    }

    public void whatsInMyCart(){
        for(String product : inCart){
            System.out.println(product);
        }
    }

    public void addToCart(String product){
        inCart.add(product);
    }

}

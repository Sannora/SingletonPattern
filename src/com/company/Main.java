/* Bir çevrimiçi alışveriş sitesinin sepete ekleme mekaniğini ve sepete eklenen verilerin hepsinin tek nesnede
tutulmasını sağlayan kod bloğu simülasyonu: */

package com.company;

public class Main {

    public static void main(String[] args) {

        /* Görünürde hiçbir nesne oluşturulmadan Cart classında önceden oluşturulmuş cart nesnesine, yalnızca class
        class ismini yazarak erişilebiliyor, bu da daha gerçekçi bir simülasyonda farklı kategorilerden ürünlerin
        hepsinin aynı sepete eklenmesine olanak sağlıyor.*/
        /* Sepete çeşitli ürünler eklenir: */
        Cart.getCart().addToCart("Dining Table");
        Cart.getCart().addToCart("White, Striped Trainers");
        Cart.getCart().addToCart("Polyester Football Uniform");
        Cart.getCart().addToCart("Moisturising Cream");

        /* Sepet içeriği yazdırılır: */
        Cart.getCart().whatsInMyCart();

    }

}

package com.hust.kstn.test;

import com.hust.kstn.models.Cart;
import com.hust.kstn.models.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        cart.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        cart.addDigitalVideoDisc(dvd3);

        cart.print();

        cart.removeDigitalVideoDisc(dvd2);
        System.out.println("After removing dvd2:");
        cart.print();

        System.out.println("Testing remove item not in cart:");
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Avatar", "Science Fiction", "James Cameron", 100, 20.00f);
        cart.removeDigitalVideoDisc(dvd4);

        System.out.println("Testing max size:");
        for(int i = 0; i < 20; i++) {
            cart.addDigitalVideoDisc(new DigitalVideoDisc("DVD " + i));
        }
        cart.print();
    }
}
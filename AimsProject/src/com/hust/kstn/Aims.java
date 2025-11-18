package com.hust.kstn;
import com.hust.kstn.models.*;

public class Aims {

    public static void main(String[] args) {
        Cart anOrder = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);

        System.out.print("Total Cost is: ");
        System.out.println(anOrder.calculateTotalCost());
        
        anOrder.removeDigitalVideoDisc(dvd2);
        System.out.print("Total Cost after removal is: ");
        System.out.println(anOrder.calculateTotalCost());
        
        anOrder.print();
    }
}
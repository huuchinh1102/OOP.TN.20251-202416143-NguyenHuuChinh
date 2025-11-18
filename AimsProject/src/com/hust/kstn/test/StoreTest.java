package com.hust.kstn.test;

import com.hust.kstn.models.DigitalVideoDisc;
import com.hust.kstn.models.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);

        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);
        
        store.printStore(); 

        store.removeDVD(dvd2);
        
        System.out.println("\n--- After removing Star Wars ---");
        store.printStore();

        System.out.println("\n--- Removing non-existent DVD ---");
        store.removeDVD(dvd2);
    }
}
package com.hust.kstn.models;

public class Store {
    private static final int MAX_NUMBERS_IN_STORE = 100;
    
    private DigitalVideoDisc[] itemsInStore;
    private int qtyInStore;

    public Store() {
        itemsInStore = new DigitalVideoDisc[MAX_NUMBERS_IN_STORE];
        qtyInStore = 0;
    }

    public void addDVD(DigitalVideoDisc disc) {
        if (qtyInStore < MAX_NUMBERS_IN_STORE) {
            itemsInStore[qtyInStore] = disc;
            qtyInStore++;
            System.out.println("The disc \"" + disc.getTitle() + "\" has been added to the store.");
        } else {
            System.out.println("The store is full!");
        }
    }

    public void removeDVD(DigitalVideoDisc disc) {
        if (qtyInStore == 0) {
            System.out.println("The store is empty, cannot remove.");
            return;
        }

        boolean found = false;
        for (int i = 0; i < qtyInStore; i++) {
            if (itemsInStore[i] == disc) {
                found = true;
                
                for (int j = i; j < qtyInStore - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                
                itemsInStore[qtyInStore - 1] = null;
                qtyInStore--;
                System.out.println("The disc \"" + disc.getTitle() + "\" has been removed from the store.");
                break;
            }
        }

        if (!found) {
            System.out.println("The disc \"" + disc.getTitle() + "\" is not in the store.");
        }
    }
    
    public void printStore() {
        System.out.println("***********************STORE***********************");
        System.out.println("Items in Store:");
        for (int i = 0; i < qtyInStore; i++) {
            System.out.println(itemsInStore[i].toString());
        }
        System.out.println("***************************************************");
    }
}
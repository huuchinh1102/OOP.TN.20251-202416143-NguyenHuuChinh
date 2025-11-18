package com.hust.kstn.models;

public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20;
    
    private DigitalVideoDisc[] itemsInCart = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBER_ORDERED) {
            itemsInCart[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added successfully");
        } else {
            System.out.println("The cart is almost full");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered == 0) {
            System.out.println("The cart is empty");
            return;
        }

        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsInCart[i] == disc) {
                found = true;
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsInCart[j] = itemsInCart[j + 1];
                }
                itemsInCart[qtyOrdered - 1] = null;
                qtyOrdered--;
                System.out.println("The disc has been removed successfully");
                break;
            }
        }

        if (!found) {
            System.out.println("The disc does not exist");
        }
    }

    public double calculateTotalCost() {
        double total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsInCart[i].getCost();
        }
        return total;
    }
    
    public void print() {
        if (qtyOrdered == 0) {
            System.out.println("The cart is empty!");
        } else {
            System.out.println("======================= THE CURRENT CART =======================");
            System.out.println("Total items: " + qtyOrdered);
            for (int i = 0; i < qtyOrdered; i++) {
                System.out.println(itemsInCart[i].toString());
            }
            System.out.println("Subtotal: " + calculateTotalCost() + "$");
            System.out.println("================================================================");
        }
    }
}
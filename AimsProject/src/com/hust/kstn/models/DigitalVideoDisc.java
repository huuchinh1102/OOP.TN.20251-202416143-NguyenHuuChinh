package com.hust.kstn.models;

public class DigitalVideoDisc extends Disc {
    
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, director, length, cost);
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);
    }

    public DigitalVideoDisc(String title) {
        super(title, null, 0);
    }

    @Override
    public String toString() {
        return "DVD - " + super.getTitle() + " - " + super.getCategory() + " - " + super.getDirector() + " - " + super.getLength() + ": " + super.getCost() + " $";
    }
}
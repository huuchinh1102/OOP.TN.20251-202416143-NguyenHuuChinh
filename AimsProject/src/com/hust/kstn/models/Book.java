package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private static int nbBooks = 0;
    private int id;
    private String title;
    private String category;
    private float cost;
    private int numOfTokens;
    private List<BookAuthor> authors = new ArrayList<>();

    public Book(String title, String category, float cost, int numOfTokens) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.numOfTokens = numOfTokens;
        nbBooks++;
        this.id = nbBooks;
    }

    public void addAuthor(BookAuthor author) {
        if (!authors.contains(author)) {
            authors.add(author);
        }
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public float getCost() {
        return cost;
    }

    public int getNumOfTokens() {
        return numOfTokens;
    }

    public List<BookAuthor> getAuthors() {
        return authors;
    }

    @Override
    public String toString() {
        return "Book[" + this.id + "]["
                + this.title + "]["
                + this.cost + "]["
                + this.category + "]["
                + this.numOfTokens + "]"
                + "\nAuthors: " + this.authors;
    }
}
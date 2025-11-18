package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private int numOfTokens;
    private List<BookAuthor> authors = new ArrayList<>();

    public Book(String title, String category, float cost, int numOfTokens) {
        super(title, category, cost);
        this.numOfTokens = numOfTokens;
    }

    public void addAuthor(BookAuthor author) {
        if (!authors.contains(author)) {
            authors.add(author);
        }
    }

    public int getNumOfTokens() {
        return numOfTokens;
    }

    public List<BookAuthor> getAuthors() {
        return authors;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTokens: " + this.numOfTokens + "\nAuthors: " + this.authors;
    }
}
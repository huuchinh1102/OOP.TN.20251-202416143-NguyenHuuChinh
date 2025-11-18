package com.hust.kstn.models;

public class Track {
    private String title;
    private int length;

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Track)) return false;
        return ((Track) obj).getTitle().equals(this.title);
    }

    @Override
    public String toString() {
        return "Track: " + this.title + " (" + this.length + ")";
    }
}
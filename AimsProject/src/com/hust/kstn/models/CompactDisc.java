package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc {
    private static int nbCompactDiscs = 0;
    private int id;
    private String title;
    private String category;
    private String artist;
    private float cost;
    private List<Track> tracks = new ArrayList<>();

    public CompactDisc(String title, String category, String artist, float cost) {
        this.title = title;
        this.category = category;
        this.artist = artist;
        this.cost = cost;
        nbCompactDiscs++;
        this.id = nbCompactDiscs;
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

    public String getArtist() {
        return artist;
    }

    public float getCost() {
        return cost;
    }

    public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("Track " + track.getTitle() + " is already in the CD list.");
        } else {
            tracks.add(track);
            System.out.println("Track " + track.getTitle() + " added successfully.");
        }
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track " + track.getTitle() + " removed successfully.");
        } else {
            System.out.println("Track " + track.getTitle() + " does not exist in the CD list.");
        }
    }

    public int getLength() {
        int total = 0;
        for (Track track : tracks) {
            total += track.getLength();
        }
        return total;
    }

    @Override
    public String toString() {
        return "CD[" + this.id + "][" + this.title + "][" + this.category + "][" + this.artist + "][" + this.getLength() + "]: " + this.cost + " $\nTracks: " + this.tracks;
    }
}
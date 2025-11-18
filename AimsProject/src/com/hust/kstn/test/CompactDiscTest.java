package com.hust.kstn.test;

import com.hust.kstn.models.CompactDisc;
import com.hust.kstn.models.Track;

public class CompactDiscTest {
    public static void main(String[] args) {
        CompactDisc cd = new CompactDisc("Greatest Hits", "Music", "Michael Jackson", 15.50f);

        Track t1 = new Track("Billie Jean", 4);
        Track t2 = new Track("Beat It", 3);
        Track t3 = new Track("Thriller", 5);
        Track t4 = new Track("Billie Jean", 4); 

        cd.addTrack(t1);
        cd.addTrack(t2);
        cd.addTrack(t3);
        
        cd.addTrack(t4);

        System.out.println("Total length: " + cd.getLength());
        System.out.println(cd.toString());

        cd.removeTrack(t2);
        
        Track t5 = new Track("Smooth Criminal", 4);
        cd.removeTrack(t5);

        System.out.println("After updates:");
        System.out.println(cd.toString());
    }
}
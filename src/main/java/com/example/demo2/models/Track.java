package com.example.demo2.models;

import org.springframework.stereotype.Component;

@Component
public class Track {
    private String title;
    private String duration;


    public Track() {
        this.title = "Song Title";
        this.duration = "3:45";
    }

    public String getTitle() {
        return title;
    }

    public String getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Track: " + title + ", Duration: " + duration;
    }
}

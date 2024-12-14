package com.example.demo2.models;

import org.springframework.stereotype.Component;

@Component
public class Album {
    private String title;
    private int year;


    public Album() {
        this.title = "Greatest Hits";
        this.year = 2024;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Album: " + title + ", Year: " + year;
    }
}

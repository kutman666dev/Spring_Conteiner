package com.example.demo2.models;

import org.springframework.stereotype.Component;

@Component
public class Artist {
    private String name;
    private String genre;


    public Artist() {
        this.name = "John Doe";
        this.genre = "Rock";
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Artist: " + name + ", Genre: " + genre;
    }
}

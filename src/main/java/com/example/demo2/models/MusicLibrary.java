package com.example.demo2.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicLibrary {

    private final Track track;
    private final Artist artist;
    private final Album album;


    @Autowired
    public MusicLibrary(Track track, Artist artist, Album album) {
        this.track = track;
        this.artist = artist;
        this.album = album;
    }


    public void printMusicInfo() {
        System.out.println(track);
        System.out.println(artist);
        System.out.println(album);
    }
}

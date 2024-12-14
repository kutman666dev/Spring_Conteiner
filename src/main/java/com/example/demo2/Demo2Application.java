package com.example.demo2;

import com.example.demo2.models.MusicLibrary;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo2Application {

    public static void main(String[] args) {
        var context = SpringApplication.run(Demo2Application.class, args);


        MusicLibrary musicLibrary = context.getBean(MusicLibrary.class);
        musicLibrary.printMusicInfo();
    }
}

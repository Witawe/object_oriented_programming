package ru.lukovtsev.springcourse;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
	private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    private JazzMusic jazzMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic, JazzMusic jazzMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.jazzMusic = jazzMusic;
    }

    public void playMusic(GenerateMusic gnrMusic) {
        Random random = new Random();

        int randomNumber = random.nextInt(3);

        if (gnrMusic == gnrMusic.CLASSICAL) {
        	if(randomNumber == 0) {
        		System.out.println("Для вас звучит классическая музыка: " + classicalMusic.getSongs().get(randomNumber) + ". Испольняет: " + classicalMusic.getSongs().get(3));
        	}
        	else if(randomNumber == 1) {
        		System.out.println("Для вас звучит классическая музыка: " + classicalMusic.getSongs().get(randomNumber) + ". Испольняет: " + classicalMusic.getSongs().get(4));
        	}
        	else {
        		System.out.println("Для вас звучит классическая музыка: " + classicalMusic.getSongs().get(randomNumber) + ". Испольняет: " + classicalMusic.getSongs().get(5));
        	}
        } else if (gnrMusic == gnrMusic.JAZZ){
        	if(randomNumber == 0) {
        		System.out.println("Для вас звучит джазовая музыка: " + jazzMusic.getSongs().get(randomNumber) + ". Испольняет: " + jazzMusic.getSongs().get(3));
        	}
        	else if(randomNumber == 1) {
        		System.out.println("Для вас звучит джазовая музыка: " + jazzMusic.getSongs().get(randomNumber) + ". Испольняет: " + jazzMusic.getSongs().get(4));
        	}
        	else {
        		System.out.println("Для вас звучит джазовая музыка: " + jazzMusic.getSongs().get(randomNumber) + ". Испольняет: " + jazzMusic.getSongs().get(5));
        	}
        } else 
        	if(randomNumber == 0) {
        		System.out.println("Для вас звучит рок музыка: " + rockMusic.getSongs().get(randomNumber) + ". Испольняет: " + rockMusic.getSongs().get(3));
        	}
        	else if(randomNumber == 1) {
        		System.out.println("Для вас звучит рок музыка: " + rockMusic.getSongs().get(randomNumber) + ". Испольняет: " + rockMusic.getSongs().get(4));
        	}
        	else {
        		System.out.println("Для вас звучит рок музыка: " + rockMusic.getSongs().get(randomNumber) + ". Испольняет: " + rockMusic.getSongs().get(5));
        	}
    }
}

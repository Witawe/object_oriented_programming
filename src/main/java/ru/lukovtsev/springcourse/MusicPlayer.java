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
            System.out.println("Для вас звучит классическая музыка: " + classicalMusic.getSongs().get(randomNumber));
        } else if (gnrMusic == gnrMusic.JAZZ){
            System.out.println("Для вас звучит джазовая музыка: " + jazzMusic.getSongs().get(randomNumber));
        } else 
        	System.out.println("Для вас звучит рок музыка: " + rockMusic.getSongs().get(randomNumber));
    }
}

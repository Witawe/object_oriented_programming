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
        		System.out.println("��� ��� ������ ������������ ������: " + classicalMusic.getSongs().get(randomNumber) + ". ����������: " + classicalMusic.getSongs().get(3));
        	}
        	else if(randomNumber == 1) {
        		System.out.println("��� ��� ������ ������������ ������: " + classicalMusic.getSongs().get(randomNumber) + ". ����������: " + classicalMusic.getSongs().get(4));
        	}
        	else {
        		System.out.println("��� ��� ������ ������������ ������: " + classicalMusic.getSongs().get(randomNumber) + ". ����������: " + classicalMusic.getSongs().get(5));
        	}
        } else if (gnrMusic == gnrMusic.JAZZ){
        	if(randomNumber == 0) {
        		System.out.println("��� ��� ������ �������� ������: " + jazzMusic.getSongs().get(randomNumber) + ". ����������: " + jazzMusic.getSongs().get(3));
        	}
        	else if(randomNumber == 1) {
        		System.out.println("��� ��� ������ �������� ������: " + jazzMusic.getSongs().get(randomNumber) + ". ����������: " + jazzMusic.getSongs().get(4));
        	}
        	else {
        		System.out.println("��� ��� ������ �������� ������: " + jazzMusic.getSongs().get(randomNumber) + ". ����������: " + jazzMusic.getSongs().get(5));
        	}
        } else 
        	if(randomNumber == 0) {
        		System.out.println("��� ��� ������ ��� ������: " + rockMusic.getSongs().get(randomNumber) + ". ����������: " + rockMusic.getSongs().get(3));
        	}
        	else if(randomNumber == 1) {
        		System.out.println("��� ��� ������ ��� ������: " + rockMusic.getSongs().get(randomNumber) + ". ����������: " + rockMusic.getSongs().get(4));
        	}
        	else {
        		System.out.println("��� ��� ������ ��� ������: " + rockMusic.getSongs().get(randomNumber) + ". ����������: " + rockMusic.getSongs().get(5));
        	}
    }
}

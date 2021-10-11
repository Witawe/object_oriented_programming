package ru.lukovtsev.springcourse;

public class Computer {
	private int id;
	private MusicPlayer musicPlayer;
	
	public Computer(MusicPlayer musicPlayer) {
		this.id = 1;
		this.musicPlayer = musicPlayer;
	}
	
	public String toString() {
		return "Computer " + id + " " + musicPlayer.playMusic();
	}
}


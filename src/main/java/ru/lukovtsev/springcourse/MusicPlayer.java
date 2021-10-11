 package ru.lukovtsev.springcourse;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class MusicPlayer {
	
	@Value("${musicPlayer.name}")
	private String name;
	
	@Value("${musicPlayer.volume}")
	private int volume;
	
	private List<Music> musicList;
	
	public String getName() {
		return name;
	}

	public int getVolume() {
		return volume;
	}
	
	public MusicPlayer(List<Music> musicList) {
		this.musicList = musicList;
	}
	
	public String playMusic() {
		Random rnd = new Random();
		int max = 100;
		
		return "Playing " + musicList.get(rnd.nextInt(musicList.size())).getSong()
				+ " with volume " + /*this.volume*/ rnd.nextInt(max);
	}
}
 
package ru.lukovtsev.springcourse;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{
	private List<String> rksongs = new ArrayList<>();
	
	{
		rksongs.add("BOHEMIAN RHAPSODY");
		rksongs.add("STAIRWAY TO HEAVEN");
		rksongs.add("FREE BIRD");
	}
	
	@Override
	public List<String> getSongs() {
		// TODO Auto-generated method stub
		return rksongs;
	}
}

package ru.lukovtsev.springcourse;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class JazzMusic implements Music{
	private List<String> jzsongs = new ArrayList<>();
	
	{
		jzsongs.add("So What");
		jzsongs.add("Take The A Train");
		jzsongs.add("Take Five");
		jzsongs.add("Miles Davis");
		jzsongs.add("Duke Ellington");
		jzsongs.add("Dave Brubeck");
	}
	
	@Override
	public List<String> getSongs() {
		// TODO Auto-generated method stub
		return jzsongs;
	}
}
 
package ru.lukovtsev.springcourse;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{
	private List<String> clsongs = new ArrayList<>();
	
	{
		clsongs.add("Symphony No. 5 in C minor");
		clsongs.add("Piano Sonata No. 14 in C-sharp minor");
		clsongs.add("Bagatelle No. 25 in A minor");
	}

	@Override
	public List<String> getSongs() {
		// TODO Auto-generated method stub
		return clsongs;
	}
}

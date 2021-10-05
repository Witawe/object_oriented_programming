package ru.lukovtsev.springcourse;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{
	private List<String> clsongs = new ArrayList<>();
	
	{
		clsongs.add("Symphony No. 5 in C minor");
		clsongs.add("Toccata and Fugue in D minor");
		clsongs.add("Serenade No. 13 in G Major, K 525");
		clsongs.add("Ludwig van Beethoven");
		clsongs.add("Johann Sebastian Bach");
		clsongs.add("Wolfgang Amadeus Mozart");
	}

	@Override
	public List<String> getSongs() {
		// TODO Auto-generated method stub
		return clsongs;
	}
}

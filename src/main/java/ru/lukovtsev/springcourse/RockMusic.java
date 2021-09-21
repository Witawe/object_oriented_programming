package ru.lukovtsev.springcourse;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{

	private RockMusic() {}
	
	public static RockMusic getRockMusic() {
		return new RockMusic();
	}
	
	public void doMyInit() {
		System.out.println("Doing my initialization in rock music");
	}
	
	public void doMyDestroy() {
		System.out.println("Doing my destruction in rock music");	
	}
	
	public String getSong() {
		// TODO Auto-generated method stub
		return "Wind cries Mary";
	}
	
}

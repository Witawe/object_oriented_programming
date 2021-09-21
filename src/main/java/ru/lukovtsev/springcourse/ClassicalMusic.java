package ru.lukovtsev.springcourse;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{
	
	private ClassicalMusic() {}
	
	public static ClassicalMusic getClassicalMusic() {
		return new ClassicalMusic();
	}

	public void doMyInit() {
		System.out.println("Doing my initialization in classic music");
	}
	
	public void doMyDestroy() {
		System.out.println("Doing my destruction in classic music");	
	}
	
	public String getSong() {
		// TODO Auto-generated method stub
		return "Hungarian Rhapsody";
	}
}

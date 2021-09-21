package ru.lukovtsev.springcourse;

import org.springframework.stereotype.Component;

@Component
public class JazzMusic implements Music{

	private JazzMusic() {}
	
	public static JazzMusic getJazzMusic() {
		return new JazzMusic();
	}
	
	public void doMyInit() {
		System.out.println("Doing my initialization in jazz music");
	}
	
	public void doMyDestroy() {
		System.out.println("Doing my destruction in jazz music");	
	}
	
	public String getSong() {
		// TODO Auto-generated method stub
		return "Let My People Go";
	}
	
}
 
package ru.lukovtsev.springcourse;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{
	
	@PostConstruct
	public void doMyInit() {
		System.out.println("Doing my initialization");
	}
	
	@PreDestroy
	public void domyDestroy(){
		System.out.println("Doing my destroy");
	}
	
	public String getSong() {
		// TODO Auto-generated method stub
		return "Wind cries Mary";
	}
}

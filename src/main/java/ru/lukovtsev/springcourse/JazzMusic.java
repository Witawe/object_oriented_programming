package ru.lukovtsev.springcourse;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class JazzMusic implements Music{

	@PostConstruct
	public void doMyInit() {
		System.out.println("Doing my initialization");
	}
	
	@PreDestroy
	public void domyDestroy(){
		System.out.println("Doing my destroy");
	}
	
	public  String getSong() {
		// TODO Auto-generated method stub
		return "Take five";
	}
}
 
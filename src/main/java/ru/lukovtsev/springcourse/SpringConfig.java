package ru.lukovtsev.springcourse;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
	@Bean
	@Scope("prototype")
	public ClassicalMusic classicalMusic() {
		return new ClassicalMusic();
	}
	@Bean
	public RockMusic rockMusic() {
		return new RockMusic();
	}
	@Bean
	public JazzMusic jazzMusic() {
		return new JazzMusic();
	}
	@Bean
	public List<Music> musicList(){
		return Arrays.asList(classicalMusic(), rockMusic(), jazzMusic());
	}
	@Bean
	public MusicPlayer musicPlayer() {
		return new MusicPlayer(musicList());
	}
	@Bean
	public Computer computer() {
		return new Computer(musicPlayer());
	}
}

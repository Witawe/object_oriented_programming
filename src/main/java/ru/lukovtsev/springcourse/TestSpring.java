package ru.lukovtsev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
					"applicationContext.xml"
		);
		
		MusicPlayer firstmusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
		MusicPlayer secondmusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
		
		boolean comparison = firstmusicPlayer == secondmusicPlayer;
		System.out.println("1-ый музыкальный плеер:");
        firstmusicPlayer.playMusic();
        System.out.print("Громкость 1-го плеера: ");
        System.out.println(firstmusicPlayer.getVolume());
        System.out.println("");
        
        System.out.println("2-ой музыкальный плеер:");
        secondmusicPlayer.playMusic();
        System.out.print("Громкость 2-го плеера: ");
        secondmusicPlayer.setVolume(5);
        System.out.println(secondmusicPlayer.getVolume());
        
        System.out.println("");
        System.out.println("Хеш функции 1-го и 2-го плеера");
        System.out.println(firstmusicPlayer);
        System.out.println(secondmusicPlayer);
        
        //ClassicalMusic classicalPlayer = context.getBean("musicBeanCl", ClassicalMusic.class);

        context.close();
	}
}

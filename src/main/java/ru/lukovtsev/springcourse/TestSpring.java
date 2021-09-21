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
		System.out.println("1-�� ����������� �����:");
        firstmusicPlayer.playMusic();
        System.out.print("��������� 1-�� ������: ");
        System.out.println(firstmusicPlayer.getVolume());
        System.out.println("");
        
        System.out.println("2-�� ����������� �����:");
        secondmusicPlayer.playMusic();
        System.out.print("��������� 2-�� ������: ");
        secondmusicPlayer.setVolume(5);
        System.out.println(secondmusicPlayer.getVolume());
        
        System.out.println("");
        System.out.println("��� ������� 1-�� � 2-�� ������");
        System.out.println(firstmusicPlayer);
        System.out.println(secondmusicPlayer);
        
        //ClassicalMusic classicalPlayer = context.getBean("musicBeanCl", ClassicalMusic.class);

        context.close();
	}
}

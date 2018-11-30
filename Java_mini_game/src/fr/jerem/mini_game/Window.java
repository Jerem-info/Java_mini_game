package fr.jerem.mini_game;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Window extends JFrame{
	
	public Window(){		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1200,900);
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		this.setAlwaysOnTop(true);
	
	}	
	
}
package fr.jerem.mini_game;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keybord implements KeyListener {
	
	@Override
	public void keyPressed(KeyEvent e ) {
		
		if (e.getKeyCode() == KeyEvent.VK_RIGHT){			
			
			int x = Main.player1.getXposition();
			int y = Main.player1.getYposition();
			
			if (y < 500){
				
				Main.player1.setYposition(Main.player1.getYposition()+10);
						
			}
		}
		
		else if (e.getKeyCode() == KeyEvent.VK_LEFT){
			
			int x = Main.player1.getXposition();
			int y = Main.player1.getYposition();
			
			if (y > 1){
				
				Main.player1.setYposition(Main.player1.getYposition()-10);
				
			}
		}
		
		else if (e.getKeyCode() == KeyEvent.VK_UP){
			
			int x = Main.player1.getXposition();
			int y = Main.player1.getYposition();
			
			if (x > 1){
				
				Main.player1.setXposition(Main.player1.getXposition()-10);
				
			}
		}
		
		else if (e.getKeyCode() == KeyEvent.VK_DOWN){
			
			int x = Main.player1.getXposition();
			int y = Main.player1.getYposition();
			
			if (x  < 500){
				
				Main.player1.setXposition(Main.player1.getXposition()+10);
				
			}
		}
		else if (e.getKeyCode() == KeyEvent.VK_ESCAPE){
			Main.isRunnning = false;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
				
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}
	
	

}

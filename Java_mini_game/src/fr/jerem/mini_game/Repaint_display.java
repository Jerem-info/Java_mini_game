package fr.jerem.mini_game;

public class Repaint_display implements Runnable {

	private int laps = 5;
	
	@Override
	public void run() {
		
		while (true){
			
			Main.scene.repaint();
			
			try {
				Thread.sleep(laps);
			} 
			catch (InterruptedException e) {
				
				System.out.println("bug");
			}
			
		}
		
		
	}

}

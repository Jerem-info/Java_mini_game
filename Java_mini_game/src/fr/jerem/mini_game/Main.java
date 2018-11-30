package fr.jerem.mini_game;
import java.util.*;

public class Main {
	
//	private static Scanner scanner;	
	public static Player player1; 
	public static Grid_and_move g1;
	public static Sword_Monster monster_S;
	public static Bowmonster monster_B;
	
	public static Window window;
	public static Display scene;
	public static boolean isRunnning;

	public static void main(String[] args) {
		
		int Xplayer = 10;
		int Yplayer = 10;
		
		
//		g1 = new Grid_and_move(50,50);
//		g1.place(Xplayer, Yplayer,'P');
//		g1.place(1, 1, 'E');
		
		
/*		System.out.print("What is the name of your player : ");		
		scanner = new Scanner(System.in);
		String name = scanner.nextLine();		
		player1 = new Player(name, 100, 20, Xplayer, Yplayer);		
		System.out.println("Welcom " + player1.getName()); */
		player1 = new Player("Djé", 100, 20, Xplayer, Yplayer);	
		
		monster_S = new Sword_Monster("Sword", 20, 5, 28, 35);		
		monster_B = new Bowmonster("Bow", 20, 2, 8, 5);
//		g1.place(monster_S.getXposition(), monster_S.getYposition(), 'S');
//		g1.place(monster_B.getXposition(), monster_B.getYposition(), 'B');		
		
//		g1.display();
//		boolean moveup = g1.move_up(player1.getXposition(), player1.getYposition());
//		if (moveup) {player1.setXposition(player1.getXposition()-1);}
				
//		g1.display();	
//		System.out.println(monster_B.getType());
		
		Window window = new Window();
		Display scene = new Display();
		
		window.setContentPane(scene);
		window.setVisible(true);
		
	}
	
	public Player getPlayer(){
		return player1;
	}

}

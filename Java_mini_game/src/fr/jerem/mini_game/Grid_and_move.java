package fr.jerem.mini_game;

public class Grid_and_move {
	
	private int nbligne;
	private int nbcolumn;
	private char [][] grid;
	
	public  Grid_and_move (int x, int y) {
		
		nbligne = x;
		nbcolumn = y;
		grid = new char [nbligne][nbcolumn];
		
		for (int i=0; i<nbligne; i++ ){
			for (int j=0; j<nbcolumn; j++){
				
				grid[i][j] = '-';
			}
			
		}
		
	}
	
	public void display(){
		
		System.out.println();
		for (int i=0; i<nbligne; i++ ){
			for (int j=0; j<nbcolumn; j++){
				
				System.out.print("|" + grid [i][j]);
				
				
			}
			System.out.println("|");
		}
		System.out.println();
	}
	
	public void place(int x, int y, char value){
		
		grid[x-1][y-1] = value;
		
	}
	
	public boolean move_up(int Xplayer, int Yplayer){
		
		
		char player;
		int x = Xplayer-1;
		int y = Yplayer-1;
		
		if (grid[x][y] == 'P'){
			player = grid[x][y];
					
			if (grid[x-1][y] == '-'){
				grid[x-1][y]= player;
				grid[x][y]='-';
				return true;
			}							
			return false;
		}			
		return false;
	}
	
	public void move_down(int Xplayer, int Yplayer){
			
		char player;
		int x = Xplayer-1;
		int y = Yplayer-1;
								
		if (grid[x][y] == 'P'){
			player = grid[x][y];
					
			if (grid[x+1][y] == '-'){
				grid[x+1][y]= player;
				grid[x][y]='-';
				
			}
			
		}		
		
	}
	
	public void move_left(int Xplayer, int Yplayer){
		
		char player;
		int x = Xplayer-1;
		int y = Yplayer-1;
								
		if (grid[x][y] == 'P'){
			player = grid[x][y];
					
			if (grid[x][y-1] == '-'){
				grid[x][y-1]= player;
				grid[x][y]='-';
			}									
			
		}
				
	}
	
	public void move_right(int Xplayer, int Yplayer){
		
		char player;
		int x = Xplayer-1;
		int y = Yplayer-1;
								
		if (grid[x][y] == 'P'){
			player = grid[x][y];
					
			if (grid[x][y+1] == '-'){
				grid[x][y+1]= player;
				grid[x][y]='-';
																
			}							
			
		}			
		
	}
	
}

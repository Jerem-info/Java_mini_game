package fr.jerem.mini_game;


public abstract class Opponent {	
	
	
	
	
	public abstract String getType();	
	public abstract void setType(String type);	
	
	public abstract double getHealth();	
	public abstract void setHealth(double health);
	
	public abstract double getAttack();	
	public abstract void setAttack(double attack);
	
	public abstract int getXposition();	
	public abstract void setXposition(int xposition);
	
	public abstract int getYposition();	
	public abstract void setYposition(int yposition);
	
	

}

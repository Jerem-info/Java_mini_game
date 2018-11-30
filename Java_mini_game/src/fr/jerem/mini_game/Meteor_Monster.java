package fr.jerem.mini_game;

public class Meteor_Monster extends Opponent {

	
	
	private String type;	
	private double health;	
	private double attack;	
	private int xposition;	
	private int yposition;
	
	
	public Meteor_Monster (String type, double health, double attack, int xposition, int yposition) {
		
		this.type = type;
		this.health = health;
		this.attack = attack;
		this.xposition = xposition;
		this.yposition = yposition;
		
	}


	@Override
	public String getType() {		
		return type;
	}


	@Override
	public void setType(String type) {		
		this.type = type;		
	}


	@Override
	public double getHealth() {		
		return health;
	}


	@Override
	public void setHealth(double health) {
		
		if (this.health < 0) {
			this.health = 0;
		}
		this.health = health;
		
	}


	@Override
	public double getAttack() {		
		return attack;
	}


	@Override
	public void setAttack(double attack) {		
		this.attack = attack;		
	}


	@Override
	public int getXposition() {		
		return xposition;
	}


	@Override
	public void setXposition(int xposition) {
		this.xposition = xposition;		
	}


	@Override
	public int getYposition() {		
		return yposition;
	}


	@Override
	public void setYposition(int yposition) {
		this.yposition = yposition;		
	}

}

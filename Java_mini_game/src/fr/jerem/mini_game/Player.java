package fr.jerem.mini_game;



public class Player {
	
	private String name;	
	private double health;	
	private double attack;	
	private int xposition;	
	private int yposition;
	
	
	
	public Player(String name, double health, double attack, int xposition, int yposition) {
		
		this.name = name;
		this.health = health;
		this.attack = attack;
		this.xposition = xposition;
		this.yposition = yposition;
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHealth() {		
		return health;
	}

	public void setHealth(double health) {
		if (this.health < 0) {
			this.health = 0;
		}
		this.health = health;
	}

	public double getAttack() {
		return attack;
	}

	public void setAttack(double attack) {
		this.attack = attack;
	}
	
	public void Damage(double damage){		
		this.health -= damage;
	}

	public int getXposition() {
		return xposition;
	}

	public void setXposition(int xposition) {
		this.xposition = xposition;
	}

	public int getYposition() {
		return yposition;
	}

	public void setYposition(int yposition) {
		this.yposition = yposition;
	}
	
}

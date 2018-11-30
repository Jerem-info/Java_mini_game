package fr.jerem.mini_game;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Display extends JPanel {
	
	private ImageIcon bg;
	private Image background;
	
	private ImageIcon cb;
	private Image chestblue;
	
	private ImageIcon cg;
	private Image chestgreen;
	
	private ImageIcon cr;
	private Image chestred;
	
	private ImageIcon cy;
	private Image chestyellow;
	
	private ImageIcon c;
	private Image coin;
	
	private ImageIcon g;
	private Image gem;
	
	private ImageIcon p;
	private Image player;
	
	
	
	public Display(){
		
		bg = new ImageIcon(getClass().getResource("/pictures/background.png"));
		this.background = this.bg.getImage();
		
		cb = new ImageIcon(getClass().getResource("/pictures/ChestBlue.png"));
		this.chestblue = this.cb.getImage();
		
		cg = new ImageIcon(getClass().getResource("/pictures/ChestGreen.png"));
		this.chestgreen = this.cg.getImage();
		
		cr = new ImageIcon(getClass().getResource("/pictures/ChestRed.png"));
		this.chestred = this.cr.getImage();
		
		cy = new ImageIcon(getClass().getResource("/pictures/ChestYellow.png"));
		this.chestyellow = this.cy.getImage();
		
		c = new ImageIcon(getClass().getResource("/pictures/Coin.png"));
		this.coin = this.c.getImage();
		
		g = new ImageIcon(getClass().getResource("/pictures/Gem.png"));
		this.gem = this.g.getImage();
		
		p = new ImageIcon(getClass().getResource("/pictures/Player.png"));
		this.player = this.p.getImage();
		
				
		this.setFocusable(true);
		this.requestFocusInWindow();
		this.addKeyListener(new Keybord());
		
		Thread repaintScene = new Thread (new Repaint_display());
		repaintScene.start();
	}
	
		
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		Graphics g1 = (Graphics2D)g;
		g1.drawImage(this.background, 0, 0, null);
		g1.drawImage(this.chestblue, 200, 300, null);
		g1.drawImage(this.chestgreen,500, 800, null);
		g1.drawImage(this.chestred, 100, 150, null);
		g1.drawImage(this.chestyellow, 990, 230, null);
		g1.drawImage(this.coin, 530, 120, null);
		g1.drawImage(this.gem, 350, 210, null);
		g1.drawImage(this.player, Main.player1.getXposition(), Main.player1.getYposition(), null);		
		
		
	}

}







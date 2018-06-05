package Objects;


import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

import java.util.LinkedList;

import javax.swing.ImageIcon;


import Game.GlobalPosition;
import Input.Controller;
import Game.Main;



public class Player extends GlobalPosition{

	private String playerimage = "/Images/lorann_r.png";
	

	int velX = 0;
	int velY = 0;
	
	private LinkedList<Enemy> monster = Controller.getEnemyBounds();
	
	public Player(int x, int y) {
		super(x, y);
		
	}

	
	public void update() {
		
	// ** movement **  //
		x += velX;
		y += velY;
		
	// ** collision window ** // 
	
		if (x < 32) { x = 32;}
		if (x > 570){ x = 570;}
		if (y < 32) { y = 32;}
		if (y > (Main.HEIGHT -96)) { y = (Main.HEIGHT -96);}
		
		
	
		Collision();
	}
	
	
	// ** collision ** ///
	
	
	public void Collision() {
		
		for(int i = 0 ; i < monster.size(); i++) {
			
			if (getBoundsPlayer().intersects(monster.get(i).getBounds())) {
			
				velX=0;
				velY=0;
				System.out.println("Collision !"+ "Perdu");		
				}
		}
	}
	
	
	
	
	/// *** ///
	
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		
		if (key == KeyEvent.VK_RIGHT) {
			velX = 2;
			velY = 0;
		playerimage = "/Images/lorann_r.png";
			
		}else if (key == KeyEvent.VK_LEFT) {
			velX = -2;
			velY = 0;
		playerimage = "/Images/lorann_l.png";
			
		}else if (key == KeyEvent.VK_DOWN) {
			velY = 2;
			velX = 0;
			playerimage = "/Images/lorann_b.png";
		}else if (key == KeyEvent.VK_UP) {
			velY = -2;
			velX = 0;
			playerimage = "/Images/lorann_u.png";
		}else if (key == KeyEvent.VK_SPACE) {
			velY=0;
			velX=0;
			playerimage = "/Images/lorann_r.png";
		}
	}
	
	public void keyReleased(KeyEvent e) {
		
	}
	
	public Rectangle getBoundsPlayer() {
		return new Rectangle(x, y, 32, 32);
	}
	
	public void draw(Graphics2D g2d) {
		
		g2d.drawImage(getPlayerImage(), x, y,null);
		//g2d.draw(getBounds());
	}
	
	public void draw2(Graphics2D g2d) {
		
		playerimage = "/Images/lorann_u.png";
		g2d.drawImage(getPlayerImage(), x, y,null);
		//g2d.draw(getBounds());
	}
	


	public Image getPlayerImage() {
		ImageIcon i = new ImageIcon(getClass().getResource(playerimage));
		return i.getImage();
	}



}

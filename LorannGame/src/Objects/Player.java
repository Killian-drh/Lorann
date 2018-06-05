package Objects;



import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

import java.util.LinkedList;

import javax.swing.ImageIcon;


import Game.GlobalPosition;
import Input.ControllerEnemy;
import Input.ControllerObject;
import Input.ControllerPurse;
import Game.Main;



public class Player extends GlobalPosition{

	private String playerimage = "/Images/lorann_r.png";

	Player pl;
	Purse p;
	ControllerPurse t;
	
	private boolean test = true;
	
	public boolean isTest() {
		return test;
	}


	public void setTest(boolean test) {
		this.test = test;
	}



	int velX = 0;
	int velY = 0;
	
	private LinkedList<Enemy> monster = ControllerEnemy.getEnemyBounds();
	private LinkedList<Purse> purse = ControllerPurse.getPurseBounds();
	
	//ControllerObject t;
	
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
		if (y > (Main.HEIGHT -192)) { y = (Main.HEIGHT -192);}
		
		
	
		CollisionEnemy();
		//CollisionPurse();
		
	}
	
	
	// ** collision ** ///
	
	
	public void CollisionEnemy() {
		
		for(int i = 0 ; i < monster.size(); i++) {
			
			if (getBoundsPlayer().intersects(monster.get(i).EnemygetBounds())) {
			
				velX=0;
				velY=0;
				System.out.println("Perdu");	
				playerimage = "/Images/LorannD.jpg";
				pl.x = -100;
			}
		}
	
	}

/*public void CollisionPurse() {

	
	if (x == t.getPx())
	{
		System.out.println("touche");
	}
	
		if (test == true) 
		{

			for(int i = 0 ; i < purse.size(); i++) {
				
				if (getBoundsPlayer().intersects(purse.get(i).PursegetBounds())) {
				
					System.out.println("+1");
					t.setPx(-10);
					t.setPy(-10);
					test = false;
			}
			
		}
		}
		
	
}*/
	
	
	
	
	/// *** ///
	
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		
		if (key == KeyEvent.VK_RIGHT) {
			velX = 3;
			velY = 0;
		playerimage = "/Images/lorann_r.png";
			
		}else if (key == KeyEvent.VK_LEFT) {
			velX = -3;
			velY = 0;
		playerimage = "/Images/lorann_l.png";
			
		}else if (key == KeyEvent.VK_DOWN) {
			velY = 3;
			velX = 0;
			playerimage = "/Images/lorann_b.png";
		}else if (key == KeyEvent.VK_UP) {
			velY = -3;
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

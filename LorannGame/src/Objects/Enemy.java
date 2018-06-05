package Objects;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

import Game.GlobalPosition;
import Game.Main;

public class Enemy extends GlobalPosition{

	int speed = 5;
	
	private String image = "/Images/monster_1.png";
	
	public Enemy(int x, int y) {
		super(x, y);
		
	}
	
	public void update() {
		x += speed;
	
		if (x > Main.WIDTH - 64) {
			speed = -5 ;
		}
		if (x < 32) {
			speed = 5;
		}
		
				
	}
	
	
	public Rectangle getBounds() {
		return new Rectangle(x, y, 32, 32);
	}

	public void draw(Graphics2D g2d) {
		
		g2d.drawImage(getEnemyImage(), x , y , null);
	}

	public Image getEnemyImage() {
		ImageIcon i = new ImageIcon(getClass().getResource(image));
		return i.getImage();
	}
}

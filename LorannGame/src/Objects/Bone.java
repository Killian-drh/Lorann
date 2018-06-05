package Objects;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

import Game.GlobalPosition;

public class Bone extends GlobalPosition{

	private String bone = "/images/crystal_ball.png";
	
	public Bone(int x, int y) {
		super(x, y);
		
	}

	public void update() 
	{
		
	}
	
	public Rectangle BallgetBounds() {
		return new Rectangle(x, y, 32, 32);
	}


	public void draw(Graphics2D g2d) {
		
		g2d.drawImage(getPurseImage(), x , y , null);
	}

	public Image getPurseImage() {
		ImageIcon i = new ImageIcon(getClass().getResource(bone));
		return i.getImage();
	}
	
}

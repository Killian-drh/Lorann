package Objects;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;


import javax.swing.ImageIcon;

import Game.GlobalPosition;



public class Purse extends GlobalPosition{

	// ** Constructor ** //
	public Purse(int x, int y) {
		super(x, y);
		
	}
	
	// ** Variables ** //
	private String imagePurse = "/Images/purse.png";

	

	
	// ** Methods ** //
	//** Bounds ** //
	public Rectangle PursegetBounds() {
		return new Rectangle(x, y, 32, 32);
	}


	public void draw(Graphics2D g2d) {
		
		g2d.drawImage(getPurseImage(), x , y , null);
	}

	public Image getPurseImage() {
		ImageIcon i = new ImageIcon(getClass().getResource(imagePurse));
		return i.getImage();
	}


}

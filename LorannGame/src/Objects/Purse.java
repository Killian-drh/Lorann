package Objects;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.LinkedList;

import javax.swing.ImageIcon;

import Game.GlobalPosition;
//import Game.Main;
import Game.Main;
import Input.ControllerEnemy;
import Input.ControllerPurse;

public class Purse extends GlobalPosition{

	public Purse(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	
	private String imagePurse = "/Images/purse.png";

	
	
	public void update() 
	{
	
	}
	
	/*
	public Rectangle PursegetBounds() {
		return new Rectangle(x, y, 32, 32);
	}
*/

	public void draw(Graphics2D g2d) {
		
		g2d.drawImage(getPurseImage(), x , y , null);
	}

	public Image getPurseImage() {
		ImageIcon i = new ImageIcon(getClass().getResource(imagePurse));
		return i.getImage();
	}


}

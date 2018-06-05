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

	private LinkedList<Purse> purse = ControllerPurse.getPurseBounds();
	Player pl;
	
	private String imagePurse = "/Images/purse.png";
	public static Rectangle p;
	
	int speed = 5;
	
	public Purse(int x, int y) {
		super(x, y);
		
	}
	
	public void update() 
	{
	
	}
	
	
	public Rectangle PursegetBounds() {
		return new Rectangle(x, y, 32, 32);
	}


	public void draw(Graphics2D g2d) {
		
		g2d.drawImage(getPurseImage(), x , y , null);
	}

	public Image getPurseImage() {
		ImageIcon i = new ImageIcon(getClass().getResource(getImagePurse()));
		return i.getImage();
	}

	public String getImagePurse() {
		return imagePurse;
	}

	public void setImagePurse(String imagePurse) {
		this.imagePurse = imagePurse;
	}

}

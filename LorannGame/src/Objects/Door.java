package Objects;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

import Game.GlobalPosition;

public class Door extends GlobalPosition{

	public String door = "/Images/gate_closed.png";
	
	public Door(int x, int y) {
		super(x, y);
		
	}

	// ** Methods ** //
	// ** Bounds ** //
	public Rectangle DoorgetBounds() {
		return new Rectangle(x, y, 32, 32);
	}


	public void draw(Graphics2D g2d) {
		
		g2d.drawImage(getDoorImage(), x , y , null);
	}

	public Image getDoorImage() {
		ImageIcon i = new ImageIcon(getClass().getResource(door));
		return i.getImage();
	}
}

package Objects;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

import Game.GlobalPosition;


public class H_bone extends GlobalPosition{

	private String imageOS = "/Images/horizontal_bone.png";
	public H_bone(int x, int y) {
		super(x, y);
	}

		// ** Methods ** //
		// ** Bounds ** //
	public Rectangle getBounds() {
		return new Rectangle(x, y, 32, 32);
	}

	public void draw(Graphics2D g2d) {
		
		g2d.drawImage(getHboneImage(), x , y , null);
	}

	public Image getHboneImage() {
		ImageIcon i = new ImageIcon(getClass().getResource(imageOS));
		return i.getImage();
	}
}

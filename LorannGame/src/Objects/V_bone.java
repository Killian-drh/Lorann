package Objects;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

import Game.GlobalPosition;

public class V_bone extends GlobalPosition{

	private String imageOS = "/Images/vertical_bone.png";
	
	// ** Constructor ** //
	
	public V_bone(int x, int y) {
		super(x, y);
	}

	// ** Methods ** //
	// ** Bounds ** //
	
	public Rectangle getBounds() {
		return new Rectangle(x, y, 32, 32);
	}

	public void draw(Graphics2D g2d) {
		
		g2d.drawImage(getVboneImage(), x , y , null);
	}

	public Image getVboneImage() {
		ImageIcon i = new ImageIcon(getClass().getResource(imageOS));
		return i.getImage();
	}
}

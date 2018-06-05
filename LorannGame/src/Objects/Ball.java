package Objects;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

import Game.GlobalPosition;

public class Ball extends GlobalPosition{

	public String ball = "/Images/crystal_ball.png";
	
	public Ball(int x, int y) {
		super(x, y);
		
	}

	
	public Rectangle BallgetBounds() {
		return new Rectangle(x, y, 32, 32);
	}


	public void draw(Graphics2D g2d) {
		
		g2d.drawImage(getBallImage(), x , y , null);
	}

	public Image getBallImage() {
		ImageIcon i = new ImageIcon(getClass().getResource(ball));
		return i.getImage();
	}
}

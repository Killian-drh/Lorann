package Objects;



import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;



import javax.swing.ImageIcon;
import Game.GlobalPosition;
import Game.Main;



public class Player extends GlobalPosition{

	public String playerimage = "/Images/lorann_r.png";



	// ** Variables ** //
	public int velX = 0;
	public int velY = 0;
	
	
	// ** Constructor ** //
	
	public Player(int x, int y) {
		super(x, y);
		
	}

	
	public void update() {
		
	// ** movement **  //
		x += velX;
		y += velY;
		
	// ** collision window ** // 
	
		if (x < 31 ) { x = 31;} 
		
		if (x > 570){ x = 570;}
		if (y < 31 ) { y = 31;}
		if (y > (Main.HEIGHT -192)) { y = (Main.HEIGHT -192);}
		
		
	}
	
	


		// ** Methods ** //
		// ** KeyMethods ** //
	
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

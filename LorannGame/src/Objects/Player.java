package Objects;



import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.ImageIcon;
import Game.GlobalPosition;
import Game.Main;



public class Player extends GlobalPosition{

	private final Set<Integer> pressed = new TreeSet<Integer>();
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
		
		pressed.add(key);
		
	    if (pressed.size() > 1) {
	        Integer[] array = pressed.toArray(new Integer[] {});
	        if (array[0] == KeyEvent.VK_LEFT && array[1] == KeyEvent.VK_UP) {
	            velX = -4;
	            velY = -4;
	            playerimage = "/Images/lorann_ul.png";
	        } else if (array[0] == KeyEvent.VK_UP && array[1] == KeyEvent.VK_RIGHT) {
	            velX = 4;
	            velY = -4;
	            playerimage = "/Images/lorann_ur.png";
	        } else if (array[0] == KeyEvent.VK_RIGHT && array[1] == KeyEvent.VK_DOWN) {
	            velX = 2;
	            velY = 2;
	            playerimage = "/Images/lorann_br.png";
	        } else if (array[0] == KeyEvent.VK_LEFT && array[1] == KeyEvent.VK_DOWN) {
	            velX = -4;
	            velY = 4;
	            playerimage = "/Images/lorann_bl.png";
	        }
	    }else {
	    	if (key == KeyEvent.VK_RIGHT) {
				velX = 2;
				velY = 0;
			playerimage = "/Images/lorann_r.png";
				
			}else if (key == KeyEvent.VK_LEFT) {
				velX = -2;
				velY = 0;
			playerimage = "/Images/lorann_l.png";
				
			}else if (key == KeyEvent.VK_DOWN) {
				velY = 2;
				velX = 0;
				playerimage = "/Images/lorann_b.png";
			}else if (key == KeyEvent.VK_UP) {
				velY = -2;
				velX = 0;
				playerimage = "/Images/lorann_u.png";
			}else if (key == KeyEvent.VK_SPACE) {
				velY=0;
				velX=0;
				playerimage = "/Images/lorann_r.png";
			}
	    }
		
	}
	
	public void keyReleased(KeyEvent e) 
	{
		velX = 0;
		velY = 0;
		
		pressed.remove(Integer.valueOf(e.getKeyCode()));
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

package Game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
//import java.util.concurrent.TimeUnit;


import javax.swing.JPanel;
import javax.swing.Timer;

import Input.ControllerEnemy;
import Input.ControllerObject;

import Input.KeyInput;
import Objects.Ball;
//import Objects.Bone;
import Objects.Door;
import Objects.Enemy;
//import Objects.Enemy;
import Objects.Player;
import Objects.Purse;
//import Objects.Purse;
//import Objects.V_bone;


public class Game extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;

	
	// ** Variables ** //
	private int score;
	public boolean balltest = false;
	private String statement = "";
	
	private LinkedList<Enemy> monster = ControllerEnemy.getEnemyBounds();
	
	// ** Class Calling ** //
	Timer gamelooptimer;
	Player lorann;
	ControllerEnemy c;
	ControllerObject o;
	Purse p;
	Purse p2;
	Door d;
	Ball b;

	
	// ** Getters ** //
	public Player getLorann() {
		return lorann;
	}

 // ** Constructor ** //
	public Game() {
		setFocusable(true);
		
		gamelooptimer = new Timer(10, this);
		gamelooptimer.start();
		
		this.setBackground(Color.BLACK);
		// ** //
		
		                 
		        
	   
		//** Objects Instantiation ** //
		
		lorann = new Player(32, 32);
		c = new ControllerEnemy();
		o = new ControllerObject();
		p = new Purse(128,256);
		p2 = new Purse(192,192);
		d = new Door(288,0);
		b = new Ball(450,250);
		
		addKeyListener(new KeyInput(lorann));
	}
	
	// ** Methods **//
	
	public void paint(Graphics g) {
		super.paint(g);
		
		Graphics2D g2d = (Graphics2D) g;
		
		Font font = new Font("Game Over", Font.BOLD, 80);
	    g2d.setFont(font);
	    g2d.setColor(Color.YELLOW);          
	    g2d.drawString("Score : " +score, 32, 400); 
	    
	    lorann.draw(g2d);
	    
	    if (statement == "Lose")
	    {
	    	Font Etat = new Font("Game Over", Font.BOLD, 60);
		    g2d.setFont(Etat);
		    g2d.setColor(Color.RED);          
		    g2d.drawString("Last Game : " +statement, 352, 400); 
			
	    }
	    else if (statement == "Win")
	    {
	    	Font Etat = new Font("Game Over", Font.BOLD, 60);
		    g2d.setFont(Etat);
		    g2d.setColor(Color.GREEN);          
		    g2d.drawString("Last Game : " +statement, 352, 400); 
			
	    }
	    

	    // ** drawing ** //
	    
		c.draw(g2d);
		o.draw(g2d);
		p.draw(g2d);
		p2.draw(g2d);
		d.draw(g2d);
		b.draw(g2d);
		
		
		// ** detection collision ** ///
		if (lorann.getBoundsPlayer().intersects(p.PursegetBounds())) 
			{
				
				p.x = -100; 
				p.y = -100;
				score += 650;
				System.out.println("score : " +score);
			}
		if (lorann.getBoundsPlayer().intersects(p2.PursegetBounds())) 
			{
					
				
				p2.x = -100; 
				p2.y = -100;
				
				score += 650;
				System.out.println("score : " +score);
			}
		
		if (lorann.getBoundsPlayer().intersects(b.BallgetBounds())) 
		{
				
				
			b.x = -120; 
			b.y = -120;
			
			balltest = true;
			
		}
		
		if (balltest != false)
		{
			d.door = "/Images/gate_open.png";
		}
		
		for(int i = 0 ; i < monster.size(); i++) {
			
			if (lorann.getBoundsPlayer().intersects(monster.get(i).EnemygetBounds())) {
			
				lorann.x= 32;
				lorann.y= 32;
				lorann.velX = 0;
				lorann.velY = 0;
				 
				System.out.println("Lose");	
				lorann.playerimage = "/Images/LorannD.jpg";
				d.door = "/Images/gate_closed.png";
				
				score = 0;
				balltest  = false;
				statement = "Lose";
				p.x = 128; 
				p.y = 256;
				p2.x = 192; 
				p2.y = 192;
				b.x = 450;
				b.y = 250;
				 
				
			}
			
		}
		
		if (lorann.getBoundsPlayer().intersects(d.DoorgetBounds()) && balltest != false) 
		{
				
			System.out.println("Win");	
			lorann.x = 32; 
			lorann.y = 32;
			lorann.velX = 0;
			lorann.velY = 0;
			
			
			d.door = "/Images/gate_closed.png";
			
			score = 0;
			balltest  = false;
			statement = "Win";
			p.x = 128; 
			p.y = 256;
			p2.x = 192; 
			p2.y = 192;
			b.x = 450;
			b.y = 250;
			
		}
			
		}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		lorann.update();
		c.update();
	}
}

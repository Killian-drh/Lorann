package Game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

import javax.swing.JPanel;
import javax.swing.Timer;

import Input.ControllerEnemy;
import Input.ControllerObject;
import Input.ControllerPurse;
import Input.KeyInput;
import Objects.Bone;
//import Objects.Enemy;
import Objects.Player;
import Objects.Purse;
//import Objects.Purse;
//import Objects.V_bone;


public class Game extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;

	private boolean test = false;
	private boolean test2 = false;
	
	Timer gamelooptimer;
	Player lorann;
//	Enemy monster;
	ControllerEnemy c;
	//V_bone v;
	ControllerObject o;
	//Purse p;
	Purse p;
	Purse p2;

	
	// ** //
	public Player getLorann() {
		return lorann;
	}


	public Game() {
		setFocusable(true);
		
		gamelooptimer = new Timer(10, this);
		gamelooptimer.start();
		
		this.setBackground(Color.BLACK);
		
		lorann = new Player(32, 32);
		//monster = new Enemy(100,100);
		c = new ControllerEnemy();
		o = new ControllerObject();
		//p = new ControllerPurse();
		p = new Purse(128,256);
		p2 = new Purse(192,192);
		 
		
		
		addKeyListener(new KeyInput(lorann));
	}
	
	
	public void paint(Graphics g) {
		super.paint(g);
		
		Graphics2D g2d = (Graphics2D) g;
		
		lorann.draw(g2d);
		//monster.draw(g2d);
		c.draw(g2d);
		o.draw(g2d);
		
		if(lorann.x +32 != p.x +6 && lorann.y -32 != p.y -6)
		{
			p.draw(g2d);
			
		}else {p.x = -100; p.y = -100;} 
	
		
		if(lorann.x +32 != p2.x +6 && lorann.y -32 != p2.y -6)
		{
			p2.draw(g2d);
		
		}else {p2.x = -100; p2.y = -100;}
	
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		lorann.update();
		c.update();
		//p.update();
		//p2.update();
	}
}

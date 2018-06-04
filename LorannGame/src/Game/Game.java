package Game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

import Input.Controller;
import Input.KeyInput;
import Objects.Enemy;
import Objects.Player;

public class Game extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;

	Timer gamelooptimer;
	Player lorann;
//	Enemy monster;
	Controller c;
	
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
		c = new Controller();
	
		
		addKeyListener(new KeyInput(lorann));
	}
	
	
	public void paint(Graphics g) {
		super.paint(g);
		
		Graphics2D g2d = (Graphics2D) g;
		
		lorann.draw(g2d);
		//monster.draw(g2d);
		c.draw(g2d);
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		lorann.update();
		//monster.update();
		c.update();
	}
}

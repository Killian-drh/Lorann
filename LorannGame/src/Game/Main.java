package Game;

import java.awt.Color;

import javax.swing.JFrame;

public class Main {

	public static final int WIDTH = 645, HEIGHT = 480;

	
	
	public static void main(String[] args) {
		
		
		
		
		JFrame fenetre = new JFrame ("Lorann Game");
			fenetre.pack();
			fenetre.setSize(WIDTH,HEIGHT);
			fenetre.setResizable(false);
			fenetre.setLocationRelativeTo(null);
			fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			fenetre.add(new Game());
			fenetre.setVisible(true);
		
		
		
		
	
	}
	

}

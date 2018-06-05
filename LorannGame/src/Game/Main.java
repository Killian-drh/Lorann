package Game;

/*import java.awt.Color;
import java.awt.Font;*/

import javax.swing.JFrame;
//import javax.swing.JLabel;

public class Main {

	public static final int WIDTH = 645, HEIGHT = 480;

	
	
	public static void main(String[] args) {
		
		
		// ** Creating Window ** //
			JFrame Window = new JFrame ("Lorann Game");
			Window.pack();
			Window.setSize(WIDTH,HEIGHT);
			Window.setResizable(false);
			Window.setLocationRelativeTo(null);
			Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Window.add(new Game());
			Window.setVisible(true);
		
	}
	

}

package Input;

import java.awt.Graphics2D;
import java.util.LinkedList;

import Game.Main;
import Objects.Player;
import Objects.Purse;

public class ControllerPurse {

	static LinkedList<Purse> p = new LinkedList<Purse>();
	
	Player pl;
	
	public Purse tempPurse;

	
	public ControllerPurse()
	{
		// ** add purse ** //

		
			addPurse(new Purse(200, 65));
			addPurse(new Purse(430,(Main.HEIGHT -192)));
	}
	
	public void draw(Graphics2D g2d) 
	{
		for(int i = 0; i < p.size(); i++) {
			tempPurse = p.get(i);
			tempPurse.draw(g2d);
		
		}
		}
	
	public void update() {
		
		for (int i = 0; i < p.size(); i++)
		{
			tempPurse = p.get(i);
			
			tempPurse.update();
	
		}
			
	}
	
	public void addPurse(Purse purse) {
		p.add(purse);
	}
	
	public void removePurse(Purse purse) {
		p.remove(purse);
	}
	
	public static LinkedList<Purse> getPurseBounds(){
		return p;
	}
	
	// ** //
	
}

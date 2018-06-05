package Input;

import java.awt.Graphics2D;
import java.util.LinkedList;

import Game.Main;
import Objects.V_bone;



public class ControllerV {


	static LinkedList<V_bone> v_bone = new LinkedList<V_bone>();
	
	V_bone tempvbone;
	
	public ControllerV() {
		for (int i = 32; i < (Main.HEIGHT -64); i++)
		{
			addVbone(new V_bone(0,i));
			i += 31;
		}
		
		for (int y = 32; y < (Main.HEIGHT -64); y++)
		{
			addVbone(new V_bone(608,y));
			y += 31;
		}
		
		
	}
	
	public void draw(Graphics2D g2d) {
		for(int i = 0; i < v_bone.size(); i++) 
		{
		
			tempvbone = v_bone.get(i);
			tempvbone.draw(g2d);
		
		}
		
	}
	
	public void update() {
		for (int i = 0; i < v_bone.size(); i++)
		{
			tempvbone = v_bone.get(i);
			tempvbone.update();
	
		}
		
	}
	
	public void addVbone(V_bone vbone) {
		v_bone.add(vbone);
	}
	
	public void removeVbone(V_bone vbone) {
		v_bone.remove(vbone);
	}
	
	public static LinkedList<V_bone> getEnemyBounds(){
		return v_bone;
	}
	
	
}


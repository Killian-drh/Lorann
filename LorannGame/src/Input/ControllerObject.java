package Input;

import java.awt.Graphics2D;
import java.util.LinkedList;

import Game.Main;
import Objects.H_bone;
import Objects.V_bone;



public class ControllerObject {


	static LinkedList<V_bone> v_bone = new LinkedList<V_bone>();
	static LinkedList<H_bone> h_bone = new LinkedList<H_bone>();
	
	V_bone tempvbone;
	H_bone temphbone;
	
	public ControllerObject() {
		
		for (int i = 32; i < (Main.HEIGHT -160); i++)
		{
			addVbone(new V_bone(0,i));
			i += 31;
		}
		
		for (int i = 32; i < (Main.HEIGHT -160); i++)
		{
			addVbone(new V_bone(608,i));
			i += 31;
		}
		
		for (int i = 32; i < (Main.WIDTH -32); i++)
		{
			addHbone(new H_bone(i,0));
			i += 31;
		}
		
		for (int i = 32; i < (Main.WIDTH -32); i++)
		{
			addHbone(new H_bone(i,(Main.HEIGHT -160)));
			i += 31;
		}
		
		
	}
	
	public void draw(Graphics2D g2d) {
		for(int i = 0; i < v_bone.size(); i++) 
		{
		
			tempvbone = v_bone.get(i);
			tempvbone.draw(g2d);
			
			for (int y = 0; y < h_bone.size(); y++)
			{
				temphbone = h_bone.get(y);
				temphbone.draw(g2d);
			}
		
		}
		
	}
	
	public void update() {
		for (int i = 0; i < v_bone.size(); i++)
		{
			tempvbone = v_bone.get(i);
			tempvbone.update();
	
		}
		
		for (int y = 0; y < h_bone.size(); y++)
		{
			temphbone = h_bone.get(y);
			temphbone.update();
		}
		
	}
	
	public void addVbone(V_bone vbone) {
		v_bone.add(vbone);
	}
	
	public void removeVbone(V_bone vbone) {
		v_bone.remove(vbone);
	}
	
	public void addHbone(H_bone hbone) {
		h_bone.add(hbone);
	}
	
	public static LinkedList<V_bone> getv_boneBounds(){
		return v_bone;
	}
	
	
}


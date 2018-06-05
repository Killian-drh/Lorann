package Input;

import java.awt.Graphics2D;
import java.util.LinkedList;

import Game.Main;
import Objects.Bone;
import Objects.Enemy;
import Objects.H_bone;
import Objects.Player;
import Objects.Purse;
import Objects.V_bone;



public class ControllerObject {


	//public boolean test = false;
	
	static LinkedList<V_bone> v = new LinkedList<V_bone>();
	static LinkedList<H_bone> h = new LinkedList<H_bone>();
	static LinkedList<Bone> b = new LinkedList<Bone>();
	
	V_bone tempvbone;
	H_bone temphbone;
	Bone tempBone;
	Player pl;
	
	
	// ** getters ** //
	
	
	// ** setters ** //
	

	
	
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
		
		for (int i = 32; i < (Main.WIDTH - 40); i++)
		{
			addHbone(new H_bone(i,0));
			i += 31;
		}
		
		for (int i = 32; i < (Main.WIDTH - 40); i++)
		{
			addHbone(new H_bone(i,(Main.HEIGHT -160)));
			i += 31;
		}
		
		
		
		// ** add bones ** //
		
		addBone(new Bone(0,0));
		addBone(new Bone(0,(Main.HEIGHT - 160)));
		addBone(new Bone((Main.WIDTH - 38 ),0));
		addBone(new Bone((Main.WIDTH - 38 ),(Main.HEIGHT - 160)));
		
		
	}
	
	
	// ** Drawing ** //
	
	public void draw(Graphics2D g2d) {
		
		// ** Vertical Bone ** // 
		for(int i = 0; i < v.size(); i++) 
			{
		
			tempvbone = v.get(i);
			tempvbone.draw(g2d);
			}
		
		// ** Horizontal Bone ** //
		
		for (int y = 0; y < h.size(); y++)
			{
				temphbone = h.get(y);
				temphbone.draw(g2d);
			}
		
	
		
		// ** Bone ** //
		for (int y = 0; y < b.size(); y++)
		{
			tempBone = b.get(y);
			tempBone.draw(g2d);
		}
		
	}
	
	
	// ** Updater ** // 
	
	public void update() {
		
		
		// ** Vertical Bone ** // 
		for (int i = 0; i < v.size(); i++)
		{
			tempvbone = v.get(i);
			tempvbone.update();
	
		}
		
		// ** Horizontal Bone ** //
		for (int i = 0; i < h.size(); i++)
		{
			temphbone = h.get(i);
			temphbone.update();
		}
		
		// ** Purse ** //
	
		
		// ** Bone ** //
		for (int i = 0; i < b.size(); i++)
		{
			tempBone = b.get(i);
			System.out.println("je passe");
			tempBone.update();
		}

		//	CollisionPurse();
		
}
	


	// ** Vertical bone **//
	public void addVbone(V_bone vbone) {
		v.add(vbone);
	}
	
	public void removeVbone(V_bone vbone) {
		v.remove(vbone);
	}
	
	
	// ** Horizontal Bone ** //
	public void addHbone(H_bone hbone) {
		h.add(hbone);
	}
	
	
	// ** Bone ** // 
	
	public void addBone(Bone bone) {
		b.add(bone);
	}
	
	public void removeBone(Bone bone) {
		b.remove(bone);
	}
	
	
	// ** Purse **// 

	
	

	
}


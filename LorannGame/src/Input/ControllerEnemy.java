package Input;

import java.awt.Graphics2D;
import java.util.LinkedList;

import Objects.Enemy;


public class ControllerEnemy {

	// ** Variables ** //
	static LinkedList<Enemy> monster = new LinkedList<Enemy>();
	
	// ** Class calling ** //
	Enemy tempEnemy;
	
	// ** Constructor ** //
	public ControllerEnemy() {
		addEnemy(new Enemy(300,150));
		addEnemy(new Enemy(300,225));
}
	
	// ** Methods ** //
	
	// ** Drawing Enemy ** //
	public void draw(Graphics2D g2d) {
		for(int i = 0; i < monster.size(); i++) {
			tempEnemy = monster.get(i);
			tempEnemy.draw(g2d);
		
		}
		
	}
	// ** Updater ** //
	public void update() {
		for (int i = 0; i < monster.size(); i++)
		{
			tempEnemy = monster.get(i);
			
			tempEnemy.update();
	
		}
		
	}
	
	public void addEnemy(Enemy enemy) {
		monster.add(enemy);
	}
	
	public void removeEnemy(Enemy enemy) {
		monster.remove(enemy);
	}
	
	public static LinkedList<Enemy> getEnemyBounds(){
		return monster;
	}
	
	
}

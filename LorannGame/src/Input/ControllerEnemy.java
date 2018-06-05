package Input;

import java.awt.Graphics2D;
import java.util.LinkedList;

import Objects.Enemy;


public class ControllerEnemy {

	static LinkedList<Enemy> monster = new LinkedList<Enemy>();
	
	Enemy tempEnemy;
	
	public ControllerEnemy() {
		addEnemy(new Enemy(300,150));
}
	
	public void draw(Graphics2D g2d) {
		for(int i = 0; i < monster.size(); i++) {
			tempEnemy = monster.get(i);
			tempEnemy.draw(g2d);
		
		}
		
	}
	
	public void update() {
		for (int i = 0; i < monster.size(); i++)
		{
			tempEnemy = monster.get(i);
			
			if (tempEnemy.x < 64) {
				System.out.println("supprimer");
				//removeEnemy(tempEnemy);
			}
			
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

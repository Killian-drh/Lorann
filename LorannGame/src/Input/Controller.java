package Input;

import java.awt.Graphics2D;
import java.util.LinkedList;

import Objects.Enemy;


public class Controller {

	static LinkedList<Enemy> monster = new LinkedList<Enemy>();
	
	Enemy tempEnemy;
	
	public Controller() {
		addEnemy(new Enemy(300,150));
		addEnemy(new Enemy(400,50));
		addEnemy(new Enemy(32,250));
		addEnemy(new Enemy(0, 350));
		

		
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

// Space Race - Enemy class

import javax.swing.ImageIcon;
import java.util.Random;

public class Enemy {

	// global variables
	private int x, y;
	private ImageIcon imgEnemy;
	private Random rnd;
	private final int ROOM_WIDTH, ROOM_HEIGHT;
	
	// constructor
	public Enemy(boolean up) 	{
		ROOM_WIDTH = 1100;
		ROOM_HEIGHT = 700;
		rnd = new Random();
		imgEnemy = new ImageIcon("images\\spy.png");
		
		// assign random position above or below frame (depending on boolean variable passed in)
		if (up == true) 
			y = rnd.nextInt(100) + ROOM_HEIGHT;
		else 
			y = -(rnd.nextInt(100)) - imgEnemy.getIconHeight();
		
		// assign random x value within frame
		x = rnd.nextInt(ROOM_WIDTH - imgEnemy.getIconWidth() - 500) + 300;;
	}
	
	// get x value of enemy
	public int getX()  {
		return x;
	}
	
	// get y value of enemy
	public int getY()  {
		return y;
	}
	
	// get width of enemy image
	public int getWidth()  {
		return imgEnemy.getIconWidth();
	}
	
	// get height of enemy image
	public int getHeight()  {
		return imgEnemy.getIconHeight();
	}
	
	// get enemy image
	public ImageIcon getImage() {		
		return imgEnemy;
	}
	
	public void moveUp(int playerX) {
		// if player is to the left of the spy, assign left image
		if (x > playerX)
			imgEnemy = new ImageIcon("images\\spy.png");
		// if player is to the right of the spy, assign right image
		else 
			imgEnemy = new ImageIcon("images\\spy RIGHT.png");
		
		// move up if within the room
		if (y + imgEnemy.getIconHeight() > 0)	
			y -= 3;
		
		// if spy reaches the top of the room, go to a random spot just below room at a random x-coordinate within the room
		else {
			x = rnd.nextInt(ROOM_WIDTH - imgEnemy.getIconWidth() - 325) + 175;
			y = rnd.nextInt(100) + ROOM_HEIGHT;;
		}
	}
	
	public void moveDown(int playerX) {
		// if player is to the left of the spy, assign left image
		if (x > playerX)
			imgEnemy = new ImageIcon("images\\spy.png");
		// if player is to the right of the spy, assign right image
		else 
			imgEnemy = new ImageIcon("images\\spy RIGHT.png");
		
		// move down if within the room
		if (y + 40 < ROOM_HEIGHT)
			y += 3;
		
		// if spy reaches the bottom of the room, go to a random spot just above room at a random x-coordinate within the frame
		else {
			x = rnd.nextInt(ROOM_WIDTH - imgEnemy.getIconWidth() - 325) + 175;
			y = -(rnd.nextInt(100)) - imgEnemy.getIconHeight();
		}
	}	
}

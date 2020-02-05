package ie.tudublin;

import processing.core.PApplet;

public class BugZap extends PApplet
{
	// Player Variables.
	public float playerX;
	public float playerY;
	public float playerWidth;

	// Enemy Varaibles.
	public float enemyX;
	public float enemyY;
	public float enemyWidth;
	
	public void settings()
	{
		size(500, 500);
	}

	public void setup()
	{
		// Player setup.
		this.playerX = 260;
		this.playerY = 490;
		this.playerWidth = 40;

		// Enemy setup.
		this.enemyX = 260;
		this.enemyY = 10;
		this.enemyWidth = 20;
	}

	public void draw()
	{
		background(0);	// Set background to black.

		// Create player.
		stroke(255, 255, 255);
		this.drawPlayer(playerX, playerY, playerWidth);

		// Create enemy.
		stroke(255, 255, 255);
		this.drawPlayer(enemyX, enemyY, enemyWidth);
	}

	void drawPlayer(float x, float y, float w)
	{
		line(x, y, x-w, y);
	}

	void drawEnemy(float x, float y, float w)
	{
		line(x, y, x-w, y);
	}

	public void keyPressed()
	{
		// Key press LEFT
		if (keyCode == LEFT)
		{
			System.out.println("Left arrow pressed");
			this.playerX -= 10;

			// If player tries to leave left side of the screen.
			if (this.playerX == 40)
			{
				System.out.println("Out of bounds");
				this.playerX += 10;
			}
		}	//END LEFT KEY PRESS

		// Key press RIGHT
		if (keyCode == RIGHT)
		{
			System.out.println("Right arrow pressed");
			this.playerX += 10;

			// If player tries to leave left side of the screen.
			if (this.playerX == 500)
			{
				System.out.println("Out of bounds");
				this.playerX -= 10;
			}
		}	//END RIGHT KEY PRESS

		// Key press SPACE
		if (key == ' ')
		{
			System.out.println("SPACE key pressed");
			line((playerX-(playerWidth/2)), playerY, (playerX-(playerWidth/2)), 0);
		}	//END SPACE KEY PRESS
	}
}
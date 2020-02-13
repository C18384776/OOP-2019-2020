package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet
{	
	public void settings()
	{
		size(500, 500);
	}

	public void setup() 
	{
		
	}

	
	public void keyPressed()
	{
		if (key == ' ')
		{
			
		}
	}	


	public void draw()
	{
		// this.middle_lines_going_inside();
		// this.circles_going_left_to_right();
		// this.rainbow_down_lines();
		// this.circles_going_left_to_right_colours();
		// this.chess_board();
		// this.upside_down_pyramid();
		// this.square_of_circular_circles();
		this.checkers_board();
	}

	public void middle_lines_going_inside()
	{
		int i;

		//Left side lines
		for ( i = 500 ; i >= 0; i-= 20)
		{
			line(0, i, 250, 250);
		}

		//Top side lines
		for ( i = 500 ; i >= 0; i-= 20)
		{
			line(i, 0, 250, 250);
		}

		//Right side lines
		for ( i = 500 ; i >= 0; i-= 20)
		{
			line(500, i, 250, 250);
		}

		//Right side lines
		for ( i = 500 ; i >= 0; i-= 20)
		{
			line(i, 500, 250, 250);
		}
	}

	public void circles_going_left_to_right()
	{
		int i;

		for (i = 25 ; i <= 500 ; i+=50)
		{
			ellipse(i, 250, 50, 50);
		}
	}

	public void rainbow_down_lines()
	{
		int i;
		int one = 0;
		colorMode(HSB, 100);

			for( i = 0 ; i <=500 ; i+=50)
			{
				fill(one, 255, 100);
				one +=7;
				rect(i, 0, 50, 500);
			}
	}

	public void circles_going_left_to_right_colours()
	{
		int i;
		int one = 0;
		colorMode(HSB, 100);
		noStroke();

		for (i = 25 ; i <= 500 ; i+=50)
		{
			fill(one, 255, 100);
			one +=7;
			ellipse(i, 250, 50, 50);
		}
	}

	public void chess_board()
	{
		int square = 40;
		int i = square;
		int j;
		int number = -5;
		background(0);			// Black.
		fill(0);
		stroke(0, 128, 0);		// Green.

		//Adding chess boxes.
		for (j = square ; j <= 400 ; j+=square)
		{
			i+=square;
			for (i = square ; i <= 400 ; i += square)
			{
				rect(i, j, square, square);
			}
		}

		//Enumerating boxes.
		fill(255);				// White.
		for ( i = 40 ; i <= 450 ; i+= 40)//Down
		{
			text(number, 15, i);
			number++;
		}

		number = -5;
		for ( i = 40 ; i <= 450 ; i+= 40)//Accross
		{
			text(number, i, 25);
			number++;
		}
	}

	public void upside_down_pyramid()
	{
		int i;

		for ( i=50 ; i <= 200; i+=50)
		{
			rect(i, i, 500-(i+i), 50);
		}

	}

	public void square_of_circular_circles()
	{
		int i, j;
		float one = 4;
		float two = one;
		colorMode(HSB, 100);
		noStroke();

		for(j = 25 ; j <= 500; j+=50)
		{
			for (i = 25 ; i <= 500 ; i+=50)
			{
				fill(one, 255, 100);
				one +=4;
				ellipse(i, j, 50, 50);
			}
			two += 3;
			one = two;
		}
	}

	public void checkers_board()
	{
		int i, j;
		boolean trigger = true;
		for (i = 0 ; i <= 500; i+=25)
		{
			for(j = 0 ; j <= 500 ; j+=25)
			{
				if (trigger == true)
				{
					fill(0, 0, 255);
					trigger = false;
				}
				else
				{
					fill(0, 0, 140);
					trigger = true;
				}
				rect(i, j, 25, 25);
			}
		}
	}
}

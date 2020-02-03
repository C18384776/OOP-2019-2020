package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing extends PApplet
{	
	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
	}

	/*
	public void draw() {
		background(0, 0, 255);
		stroke(255, 0, 0);
		fill(255, 255, 0);
		line(10, 10, 100, 100);		// x1, y1, x2, y2
		point(50, 50); // x, y
		ellipse(100, 200, 50, 150); // cx, cy, w, h
		fill(0, 255, 0);
		rect(50, 10, 100, 200); // tlx, tly, w, h
		triangle(10, 10, 100, 90, 200, 200); // vertices	
	}	
	*/

	int x = 0; // 4 bytes
	
	public void draw()
	{	
		background(255, 0, 0);
		noStroke();
		fill(255, 255, 0);
		ellipse(250, 300, 400, 400);
		fill(0, 255, 255);
		triangle(250, 50, 50, 450, 450, 450);
		fill(255, 192, 203);
		ellipse(250, 250, 150, 100);
		fill(0);
		ellipse(250, 250, 80, 100);



		// background(0, 255,0);
		// stroke(0, 0, 255);
		// line(10, 10, 100, 100); 				// X1, Y1, X2, Y2.
		// point(50, 50);							// X, Y.
		// noStroke();
		// fill(0, 255, 255);
		// ellipse(100, 200, 100, 50);				// CX, CY, W, H.
		// fill(255, 0, 0);
		// rect(70, 150, 90, 10);					// TLX, TLY, W, H (TL means Top left)
		// triangle(150, 90, 200, 100, 100, 250);
	}
}

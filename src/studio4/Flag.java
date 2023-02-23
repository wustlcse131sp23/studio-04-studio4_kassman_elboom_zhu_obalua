package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.rectangle(.5, .5, .45, .3);
		StdDraw.setPenColor(91, 113, 210);
		StdDraw.filledRectangle(.35, .45, .2, .15); //whale body
		StdDraw.filledRectangle(.63, .35 , .1, .05); // whale tail
		StdDraw.filledRectangle(.7777777, .4 , .05, .1); //
		
		double [] x = {.63, .63, .7777777};
		double [] y = {.8, .5, .5}; 
		StdDraw.filledPolygon (x, y);
		StdDraw.setPenColor(181, 122, 200);
		}
		
	}


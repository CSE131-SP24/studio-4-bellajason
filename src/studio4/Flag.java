package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle(0.5, 0.3, 0.5, 0.3);
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledCircle(0.25, 0.3, 0.05);
		StdDraw.filledCircle(0.5, 0.3, 0.05);
		StdDraw.filledCircle(0.75, 0.3, 0.05);
		
		
	}
}
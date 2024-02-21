package studio4;

import java.io.File;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shape = in.next();
		if (shape.equals("ellipse")) {
			int red = in.nextInt();
			int green = in.nextInt();
			int blue = in.nextInt();
			Color col = new Color(red,green,blue);
			StdDraw.setPenColor(col);
			boolean filledOrNot = in.nextBoolean();
			double x = in.nextDouble();
			double y = in.nextDouble();
			double semiMajorAxis = in.nextDouble();
			double semiMinorAxis = in.nextDouble();
			if (filledOrNot) {
				StdDraw.filledEllipse(x, y, semiMajorAxis, semiMinorAxis);
			}
			else {
				StdDraw.ellipse(x, y, semiMajorAxis, semiMinorAxis);
			}
		}
		else if (shape.equals("rectangle")){
			int red = in.nextInt();
			int green = in.nextInt();
			int blue = in.nextInt();
			Color col = new Color(red,green,blue);
			StdDraw.setPenColor(col);
			boolean filledOrNot = in.nextBoolean();
			double x = in.nextDouble();
			double y = in.nextDouble();
			double halfWidth = in.nextDouble();
			double halfHeigh = in.nextDouble();
			if (filledOrNot) {
				StdDraw.filledRectangle(x, y, halfWidth, halfHeigh);
			}
			else {
				StdDraw.rectangle(x, y, halfWidth, halfHeigh);
			}
		}
		else {
			int red = in.nextInt();
			int green = in.nextInt();
			int blue = in.nextInt();
			Color col = new Color(red,green,blue);
			StdDraw.setPenColor(col);
			boolean filledOrNot = in.nextBoolean();
			double x1= in.nextDouble();
			double x2= in.nextDouble();
			double x3= in.nextDouble();
			
			double y1 = in.nextDouble();
			double y2= in.nextDouble();
			double y3= in.nextDouble();
			
			double[] xArray = {x1,x2,x3};
			double[] yArray = {y1,y2,y3};
			
			if (filledOrNot) {
				StdDraw.filledPolygon(xArray, yArray);
			}
			else {
				StdDraw.polygon(xArray, yArray);
			}
		}
}
}

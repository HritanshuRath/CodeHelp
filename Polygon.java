package GeneralCodes;

/**
 * 
 * @author Hritanshu Rath 
 * @version 1.0
 * @since 11/13/2020
 */

import java.awt.Color;

public class Polygon extends Shapes{

	private double length;
	private double [] Xval, Yval;
	private int sides;
	
	public Polygon ()
	{
		super();
		centerX = 20.0;
		centerY = 20.0;
		sides = 5;
		length = 10;
		color = Color.PINK;
		Xval = new double [5];
		Yval = new double [5];
	}
	public Polygon (double x, double y, int num, double le)
	{
		super();
		centerX = x;
		centerY = y;
		sides = num;
		length = le;
		color = Color.PINK;
		Xval = new double [num];
		Yval = new double [num];
	}
	public void draw() {
		for (int i = 0; i<sides; i++)
		{
			Xval[i] = Math.cos(2*Math.PI*i/sides)*length + centerX;
			Yval[i] = Math.sin(2*Math.PI*i/sides)*length + centerY;
		}
		StdDraw.setPenColor(color);
		StdDraw.filledPolygon(Xval,Yval);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.polygon(Xval, Yval);
	}


	public double area() {
		
		double area = length*length*Math.sin(Math.PI/sides)*Math.cos(Math.PI/sides)*sides;
		return area;
	}


	public double circumference() {
		double p = 2*Math.sin(Math.PI/sides)*length*sides;
		return p;
	}

}

package GeneralCodes;

/**
 * 
 * @author Scott Deruiter and Hritanshu Rath 
 * @version 1.0
 * @since 11/13/2020
 */

import java.awt.Color;

public class Triangle extends Shapes
{
	private double length;
	
	public Triangle ( )
	{
		super();
		centerX = 20.0;
		centerY = 20.0;
		length = 10.0;
		color = Color.RED;
	}
	
	public Triangle(double x, double y, double le)
	{
		super();
		centerX = x;
		centerY = y;
		length = le;
		color = Color.RED;
	}
	
	public void draw ( )
	{
		double [] x = {centerX - length/2, centerX + length/2, centerX};
		double [] y = {centerY - length * Math.tan(Math.PI/6) / 2, 
					centerY - length * Math.tan(Math.PI/6) / 2, 
					centerY + length * Math.sqrt(3) / 2 - length * Math.tan(Math.PI/6) / 2};
		StdDraw.setPenColor(color);
		StdDraw.filledPolygon(x,y);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.polygon(x,y);
	}
	
	public double area ( )
	{
		return Math.sqrt(3) / 4 * length * length;
	}
	
	public double circumference ( )
	{
		return length * 3.0;
	}
}
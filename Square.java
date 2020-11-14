package GeneralCodes;

/**
 * 
 * @author Scott Deruiter and Hritanshu Rath 
 * @version 1.0
 * @since 11/13/2020
 */

import java.awt.Color;

public class Square extends Rectangle
{
	private double length;
	
	public Square ( )
	{
		super();
		centerX = 20.0;
		centerY = 20.0;
		length = 10.0;
		color = Color.GRAY;
	}
	
	public Square(double x, double y, double le)
	{
		super();
		centerX = x;
		centerY = y;
		length = le;
		color = Color.GRAY;
	}
	
	public void draw ( )
	{
		StdDraw.setPenColor(color);
		StdDraw.filledRectangle(centerX,centerY,length/2,length/2);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.rectangle(centerX,centerY,length/2,length/2);
	}
	
	
	public double area ( )
	{
		return length * length;
	}
	
	public double circumference ( )
	{
		return length * 4.0;
	}
}
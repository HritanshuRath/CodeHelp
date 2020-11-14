package GeneralCodes;

/**
 * 
 * @author Scott Deruiter and Hritanshu Rath 
 * @version 1.0
 * @since 11/13/2020
 */

import java.awt.Color;

public class Rectangle extends Shapes
{
	private double width;
	private double height;
	
	public Rectangle ( )
	{
		super();
		centerX = 20.0;
		centerY = 20.0;
		width = 10.0;
		height = 10.0;
		color = Color.BLUE;
	}
	
	public Rectangle(double x, double y, double w, double h)
	{
		super();
		centerX = x;
		centerY = y;
		width = w;
		height = h;
		color = Color.BLUE;
	}
	
	public void draw ( )
	{
		StdDraw.setPenColor(color);
		StdDraw.filledRectangle(centerX,centerY,width/2,height/2);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.rectangle(centerX,centerY,width/2,height/2);
	}
	

	
	public double area ( )
	{
		return height * width;
	}
	
	public double circumference ( )
	{
		return height * 2.0 + width * 2.0;
	}
}
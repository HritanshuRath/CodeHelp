package GeneralCodes;

/**
 * An abstract superclass of Triangle, Square, 
 * Rectangle, Circle, and Polygon (my own shape).
 * This class sets up the common methods of all 
 * the subclasses.
 * @author Hritanshu Rath 
 * @version 1.0
 * @since 11/13/2020
 */

import java.awt.Color;


public abstract class Shapes {
	
	public double centerX, centerY; 					// This denotes the center of the shape to be drawn
	Color color;
	public void move(double newX, double newY)
	{
		centerX = newX;
		centerY = newY;
	}
	public double getX ( )
	{
		return centerX;
	}
	
	public double getY ( )
	{
		return centerY;
	}
	
	public void setColor(int r, int g, int b)
	{
		color = new Color(r,g,b);
	}
	
	public abstract void draw ();
	public abstract double area ();
	public abstract double circumference ();
	
	
}

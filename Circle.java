package GeneralCodes;
import java.awt.Color;

public class Circle extends Shapes
{
	private double radius;
	
	public Circle ( )
	{
		super();
		centerX = 20.0;
		centerY = 20.0;
		radius = 10.0;
		color = Color.GREEN;
	}
	
	public Circle(double x, double y, double r)
	{
		super();
		centerX = x;
		centerY = y;
		radius = r;
		color = Color.GREEN;
	}
	
	public void draw ( )
	{
		StdDraw.setPenColor(color);
		StdDraw.filledCircle(centerX,centerY,radius);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.circle(centerX,centerY,radius);
	}
	
	public double area ( )
	{
		return Math.PI * radius * radius;
	}
	
	public double circumference ( )
	{
		return radius * Math.PI * 2.0;
	}
}
import java.util.Date;
import java.lang.Math;

public class GeometricObject
{
	private String color;
	private boolean filled;
	private Date dateCreated;
	
	public GeometricObject() 
	{
		this("white", false);
	}
	public GeometricObject(String color, boolean filled)
	{
		this.color = color;
		this.filled = filled;
		this.dateCreated = new Date();
	}
	public String getColor() { return this.color; }
	public void setColor(String color) { this.color = color; }
	
	public boolean isFilled() { return this.filled; }
	public void setFilled(boolean filled) { this.filled = filled; }

	public Date getDateCreated() { return this.dateCreated; }
	
	public String toString() 
	{
		return "created on " + getDateCreated() + "\ncolor: " + getColor() + " and filled: " + isFilled();
	}
}

class Circle extends GeometricObject
{
	private double radius;
	
	public Circle() 
	{
		this(1);
	}
	public Circle(double radius) 
	{
		super();
		this.radius = radius;
	}
	public Circle(double radius, String color, boolean filled)
	{
		super(color, filled);
		this.radius = radius;
	}

	public double getRadius() { return this.radius; }
	public void setRadius(Double radius) { this.radius = radius; }
	
	public double getArea() { return Math.PI * this.radius * this.radius; }

	public double getPerimeter() { return Math.PI * getDiameter(); }

	public double getDiameter() { return 2 * this.radius; }
	
	public void printCircle(){}
}

class Rectangle extends GeometricObject
{	
	private double width, height;

	
	public Rectangle() 
	{
		this(1, 1);
	}
	public Rectangle(double width, double height) 
	{
		super();
		this.width = width;
		this.height = height;
	}
	public Rectangle(double width, double height, String color, boolean filled)
	{
		super(color, filled);
		this.width = width;
		this.height = height;
	}

	
	public double getWidth() { return this.width; }
	public void setWidth(Double width) { this.width = this.width; }

	public double getHeight() { return this.height; }
	public void setHeight(Double height) { this.height = height; }

	public double getArea() { return getWidth() * getHeight(); }

	public double getPerimeter() { return 2 * getWidth() + 2 * getHeight(); }
}
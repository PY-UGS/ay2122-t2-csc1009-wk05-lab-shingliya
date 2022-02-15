public abstract class Shape
{
	protected double dim1, dim2, PI;
	
	public Shape(double dim1, double dim2)
	{
		this.dim1 = dim1;
		this.dim2 = dim2;
		this.PI = 3.14;
	}

	public abstract double area();

	public static void main(String[] args)
	{
		Rectangle r = new Rectangle(9, 5);
		Triangle t = new Triangle(10, 8);
		Circle c = new Circle(5, 5);
		Ellipse e = new Ellipse(7, 7);
		Square s = new Square(6, 6);

		Shape figref;
		figref = r;
		System.out.println("Area is " + figref.area());
		figref = t;
		System.out.println("Area is " + figref.area());
		figref = c;
		System.out.println("Area is " + figref.area());
		figref = e;
		System.out.println("Area is " + figref.area());
		figref = s;
		System.out.println("Area is " + figref.area());
	}
}

class Rectangle extends Shape
{
	public Rectangle(double w, double h) { super(w, h); }

	public double area() { 
		System.out.println("Inside Area for Rectangle");
		return this.dim1 * this.dim2;
	}
}

class Triangle extends Shape
{
	public Triangle(double b, double h) { super(b, h); }

	public double area() { 
		System.out.println("Inside Area for Triangle");
		return 0.5 * this.dim1 * this.dim2;
	}
}

class Circle extends Shape
{	
	public Circle(double r, double r2) { super(r, r); }

	public double area() { 
		System.out.println("Inside Area for Circle");
		return this.PI * this.dim1 * this.dim1;
	}
}

class Ellipse extends Shape
{
	public Ellipse(double a, double b) { super(a, b); }

	public double area() { 
		System.out.println("Inside Area for Ellipse");
		return this.PI * this.dim1 * this.dim2;
	}
}

class Square extends Shape
{
	public Square(double l, double l2) { super(l, l); }

	public double area() { 
		System.out.println("Inside Area for Square");
		return this.dim1 * this.dim1;
	}
}
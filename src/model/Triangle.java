package model;

public class Triangle extends Shape{
	
	
private int sideSize;
	
	
	public Triangle(int SS)
	{
		super(SS);
		SS = sideSize;
	}
	
	
	public String getArea()
	{
		//gets the surface area because it is 3D
		double surfaceArea = sideSize*sideSize/2;
		String sa = "Triangle Area is: " + surfaceArea;
		return sa;
		
	}
}

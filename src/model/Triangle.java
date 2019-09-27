package model;

public class Triangle extends Shape{
	
	
private double sideSize;
	
	
	public Triangle(double SS)
	{
		super(SS);
		SS = sideSize;
	}
	
	
	public double getArea()
	{
		//gets the surface area because it is 3D
		double surfaceArea = sideSize*sideSize/2;
		System.out.println("Triangle Area is: " + surfaceArea);
		return surfaceArea;
		
	}
}

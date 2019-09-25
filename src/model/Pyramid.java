package model;

public class Pyramid extends Shape
{

private double sideSize;
	
	
	public Pyramid(double SS)
	{
		super(SS);
		SS = sideSize;
	}
	
	
	public double getArea()
	{
		//gets the surface area because it is 3D
		double surfaceArea = sideSize*sideSize*4/2;
		
		System.out.println("Pyramid surface Area is: " + surfaceArea);
		return surfaceArea;
	}
	
	
	
}

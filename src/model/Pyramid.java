package model;

public class Pyramid extends Shape
{

private double sideSize;
	
	
	public Pyramid(double SS)
	{
		super(SS);
		SS = sideSize;
	}
	
	
	public void getArea()
	{
		//gets the surface area because it is 3D
		double surfaceArea = sideSize*sideSize*6;
		
		System.out.println("Pyramid surface Area is: " + surfaceArea);
	}
	
	
	
}

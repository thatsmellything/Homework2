package model;

public class Cube extends Shape{

	
	private double sideSize;
	
	
	public Cube(double SS)
	{
		super(SS);
		SS = sideSize;
	}
	
	
	public void getArea()
	{
		//gets the surface area because it is 3D
		double surfaceArea = sideSize*sideSize*6;
		
		System.out.println("Cude surface Area is: " + surfaceArea);
	}
}

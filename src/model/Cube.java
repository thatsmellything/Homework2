package model;

public class Cube extends Shape{

	
	
	
	
	public Cube(double sideSize)
	{
		super(sideSize);
		
	}
	
	
	
	
	
	public String getArea()
	{
		//gets the surface area because it is 3D
		
		double surfaceArea = getSideSize()*getSideSize()*6;
		
		String cubeSA = "Cude surface Area is: " + surfaceArea;
		return cubeSA;
	}
}

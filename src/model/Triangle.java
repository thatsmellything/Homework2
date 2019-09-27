package model;

public class Triangle extends Shape{
	
	

	
	
	public Triangle(double sideSize)
	{
		super(sideSize);
		
	}
	
	
	public String getArea()
	{
		//gets the surface area because it is 3D
		double surfaceArea = getSideSize()*getSideSize()/2;
		String sa = "Triangle Area is: " + surfaceArea;
		return sa;
		
	}
}

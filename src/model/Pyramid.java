package model;

public class Pyramid extends Shape
{


	
	public Pyramid(double sideSize)
	{
		super(sideSize);
		
	}
	
	
	public String getArea()
	{
		//gets the surface area because it is 3D
		double surfaceArea = getSideSize()*getSideSize()*4/2;
		
		String sa = "Pyramid surface Area is: " + surfaceArea;
		return sa;
	}
	
	
	
}

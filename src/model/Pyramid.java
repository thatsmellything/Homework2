package model;

public class Pyramid extends Shape
{

private int sideSize;
	
	
	public Pyramid(int SS)
	{
		super(SS);
		SS = sideSize;
	}
	
	
	public String getArea()
	{
		//gets the surface area because it is 3D
		int surfaceArea = sideSize*sideSize*4/2;
		
		String sa = "Pyramid surface Area is: " + surfaceArea;
		return sa;
	}
	
	
	
}

package model;

public class Cube extends Shape{

	
	int sideSize;
	
	
	public Cube(int SS)
	{
		super(SS);
		SS = sideSize;
	}
	
	public void setSideSize(int SS)
	{
		SS = sideSize;
	}
	
	public int getSideSize()
	{
		
		return sideSize;
	}
	
	
	
	
	public String getArea()
	{
		//gets the surface area because it is 3D
		int s = this.getSideSize();
		int surfaceArea = s*s*6;
		
		String cubeSA = "Cude surface Area is: " + surfaceArea;
		return cubeSA;
	}
}

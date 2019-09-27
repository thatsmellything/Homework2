package model;

public class Square extends Shape{
	
private int sideSize;
	
	
	public Square(int SS)
	{
		super(SS);
		SS = sideSize;
	}
	
	
	public String getArea()
	{
		//gets the surface area because it is 3D
		double Area = sideSize*sideSize;
		
		String sa = "Square Area is: " + Area;
		return sa;
	}

}

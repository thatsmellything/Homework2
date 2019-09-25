package model;

public class Square extends Shape{
	
private double sideSize;
	
	
	public Square(double SS)
	{
		super(SS);
		SS = sideSize;
	}
	
	
	public void getArea()
	{
		//gets the surface area because it is 3D
		double Area = sideSize*sideSize;
		
		System.out.println("Square Area is: " + Area);
	}

}

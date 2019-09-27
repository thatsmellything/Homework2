package model;

public class Square extends Shape{
	

	
	
	public Square(double sideSize)
	{
		super(sideSize);
		
	}
	
	
	public String getArea()
	{
		//gets the surface area because it is 3D
		double Area = getSideSize()*getSideSize();
		
		String sa = "Square Area is: " + Area;
		return sa;
	}

}

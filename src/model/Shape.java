package model;

public class Shape {
	
	int sideSize;
	
	public Shape(int SS)
	{
		sideSize = SS;
	}
	
	public void setSideSize(int SS)
	{
		sideSize = SS;
	}
	
	public int getSideSize()
	{
		return sideSize;
	}

	
	public String getArea()
	{
		String getAr = "To get the area you times the width by the height";
		return getAr;
	}
}

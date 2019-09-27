package model;

public class Shape {
	
	private double sideSize;
	
	public Shape(double SS)
	{
		setSideSize(SS);
	}
	


	
	public String getArea()
	{
		String getAr = "To get the area you times the width by the height";
		return getAr;
	}




	public double getSideSize() {
		return sideSize;
	}




	public void setSideSize(double sideSize) {
		this.sideSize = sideSize;
	}
}

package tests;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import model.*;
import model.Triangle;

public class TestShape {
	
	public static void main(String[] args)
	{
		Shape[] shapes = {new Triangle(2), new Triangle(3), new Square(5), new Square(4), new Pyramid(9), new Pyramid(4), new Cube(10), new Cube(200)};
		for (int i = 0; i<shapes.length; i++)
		{
			System.out.println(shapes[i].getArea());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	//create the child models
	

	//Triangle triangleBaby2 = new Triangle(5.0);
	//Square squareChild = new Square(30.2);
	//Square squareChild2 = new Square(30.2);
	//Cube cubeBoi = new Cube(4.5);
	//Cube cubeBoi2 = new Cube(4.5);
	//Pyramid pLad = new Pyramid(9.9);
	//Pyramid pLad2 = new Pyramid(9.9);
	
	//Create the arraylist
	//LinkedList<Shape> shapelist = new LinkedList<Shape>();
	//ArrayList<Shape> shapeyBois = new ArrayList<Shape>(8);
	//Add the child models to the array
	//shapelist.add(new Triangle());
	
	//Possible other solution
	
	//	List<Shape> shapeyBois = new ArrayList<>(8);
	//		Shape o = list.get(x)
	//		if (o instanceof Child) {
  	//		  Child child = (Child) o;
  			  // Do something with child
}
		
	
	
	
	
	//iterate through the array (hopefully)
	//for(int i = 0; i<shapeyBois.size(); i++)
	//{
	//	Sysetm.out.println(shapeyBois.get(i.getArea()));	
	//}	



package tests;

import java.util.ArrayList;

import model.Shape;
import model.*;

public class TestShape {
	
	//create the child models
	
	Triangle triangleBaby = new Triagle(5.0);
	Square squareChild = new Square(30.2);
	
	//Create the arraylist
	
	List<Shape> shapeyBois = new ArrayList<Shape>(8);
	//Add the child models to the array
	shapeyBois.add(squareChild);
	
	
	shapeyBois.add(triangleBaby);
	
	
	//iterate through the array (hopefully)
	for(int i = 0; i<shapeyBois.size(); i++)
	{
		Sysetm.out.println(shapeyBois.get(i.getArea()));	
	}	


}

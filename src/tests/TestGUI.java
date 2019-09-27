 package tests;

 import javafx.application.Application;
 import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
 import javafx.scene.control.TextField;
 import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;
 
public class TestGUI extends Application {
	@Override
	public void start(Stage stage)
	{
		
		//GUI NEEDS STAGE SCENE PANE AND THEN ANYTHING ELSE AKA BUTTONS AND TEXT
		
		
		
		//Creates the Pane for the GUI
		StackPane pane = new StackPane();
		
		
		
		//Creates the texts, changes the color and adds the text to the screen
			//Hello portion
			Text helloText = new Text();
			helloText.setText("Hello ");
			helloText.setFill(Color.BLUE);
			//World portion
			Text worldText = new Text();
			worldText.setText("World!");
			worldText.setFill(Color.DARKORANGE);
			//Add the texts to the screen
			
			//Create a textflow so that the text doesnt overlap and make you sad
			TextFlow TF = new TextFlow();
			TF.setLayoutX(300);
			TF.setLayoutY(200);
			TF.getChildren().addAll(helloText,worldText);
			

			//create a group so you can center it in the screen
			Group group = new Group(TF);
		
		//Add it to the pane and boom gottem	
		pane.getChildren().addAll(group);
		
		//Sets the scene and the title 
		//(which is the little thing that shows up at the top of applications)
		Scene scene = new Scene(pane, 600, 400);
		stage.setTitle("Hello world v1.420");
		stage.setScene(scene);
		
		//Makes the stage and GUI actually show up on the screen
		stage.show();
	}
	
	
	public static void main(String[] args)
	{
		launch(args);
	}

}

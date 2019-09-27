 package tests;

 import javafx.application.Application;
 import javafx.collections.ObservableList;
 import javafx.scene.Scene;
 import javafx.scene.control.TextField;
 import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
 
public class TestGUI extends Application {
	@Override
	public void start(Stage stage)
	{
		
		//GUI NEEDS STAGE SCENE PANE AND THEN ANYTHING ELSE AKA BUTTONS AND TEXT
		
		
		
		//Creates the Pane for the GUI
		StackPane pane = new StackPane();
		
		//Creates the text, changes the color and adds the text to the screen
		Text helloText = new Text();
		helloText.setText("Hello World");
		helloText.setFill(Color.BLUE);
		pane.getChildren().add(helloText);
		
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

package JFX10.RadioButtonsProject;

import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.*;

public class MainClass extends Application{
	final double X_SIZE = UtilityClass.X_SIZE;
	final double Y_SIZE = UtilityClass.Y_SIZE;
	
	RadioButton rb1 ;
	RadioButton rb2;
	RadioButton rb3;
	
	public static void main(String[] args) {
		launch(args);
	}
	public void start(Stage stage) {
		// Create a Border Pane
		BorderPane p = UtilityClass.createBorderPane(200, 200, 200);
		
		// Create a Top and Bottom Horizontal Box
		HBox hTBox = UtilityClass.createHBox(155, 155, 180);
		hTBox.setMaxHeight(50.0);
		hTBox.setPadding(new Insets(15, 12, 15, 12));
		
		HBox hBBox = UtilityClass.createHBox(155, 155, 180);
		hBBox.setPadding(new Insets(15, 12, 15, 12));
		
		// Create a Left and Right Vertical Box
		VBox vLBox = UtilityClass.createVBox(200, 200, 210);
		vLBox.setPadding(new Insets(15, 12, 15, 12));
		VBox vRBox = UtilityClass.createVBox(200, 200, 210);
		
		// Create the center Pane
		Pane pane = UtilityClass.createPane(245, 245, 250);
		
		// Configure the Border Pane
		p.setTop(hTBox);
		p.setBottom(hBBox);
		p.setLeft(vLBox);
		p.setRight(vRBox);
		p.setCenter(pane);
		
		//**********************************
		// Create Radio Buttons
		ToggleGroup group = new ToggleGroup();
		RadioButton rb1 = new RadioButton("1900");
		rb1.setToggleGroup(group);
		rb1.setSelected(true);
		
		RadioButton rb2 = new RadioButton("1960");
		rb2.setToggleGroup(group);
		
		RadioButton rb3 = new RadioButton("2000");
		rb3.setToggleGroup(group);
		
		vLBox.getChildren().addAll(rb1, rb2, rb3);
		
		
		//**********************************
		// Create Button
		Button btnSubmit= new Button("Submit");
		btnSubmit.setMinSize(75.0, 40.0);
		hTBox.getChildren().add(btnSubmit);
		btnSubmit.setOnAction((ActionEvent e) -> {
		
		String buffer = "";
			String text = "";
			if (rb1.isSelected())
			{
				buffer = "Radio Button 1 is selected";
				text = "Jazz, originated in New Orleans.";
			}
			else if (rb2.isSelected())
			{
				buffer = "Radio Button 2 is selected";
				text = "Blues-Rock, created in the early 1960's but did not became popular until 1965.";
			}
			else if (rb3.isSelected())
			{
				buffer = "Radio Button 3 is selected";
				text = "Hip Hop, Eminem, 50 Cent, Gwen Stefani";
			}
			
			Label lblStatus = new Label(buffer);
			hBBox.getChildren().clear();
			hBBox.getChildren().add(lblStatus);
			
			Label lblText = new Label(text);
			lblText.setLayoutX(50.0);
			lblText.setLayoutY(25.0);
			pane.getChildren().clear();
			pane.getChildren().add(lblText);
		});
		
		//Set the scene
		Scene scene = new Scene(p, X_SIZE, Y_SIZE);
		UtilityClass.createStage(stage, scene, "Radio Buttons Project");
	}
}

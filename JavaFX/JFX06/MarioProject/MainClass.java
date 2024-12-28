package JFX06.MarioProject;

import javafx.application.*;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.stage.*;

public class MainClass extends Application{
	final int X_SIZE = 550;
	final int Y_SIZE = 440;
	final int LEFT = 0;
	final int RIGHT = 1;
	
	public static void main(String[] args) {
		launch(args);
	}
	public void start(Stage stage) {
		Image img = new Image("./Images/Goomba.png");
		Image coinL = new Image("./Images/CoinL.jpg");
		Image bgImg = new Image("./Images/background.jpg");
		
		Circle cL = CircleClass.createCircle(100, 120, 20, coinL) ;
		Circle goomba = CircleClass.createCircle(250, 250, 30, img);
		
		Button btnLeft = new Button("Move Left");
		btnLeft.setFocusTraversable(false);
		btnLeft.setOnAction((ActionEvent e) -> {
			goomba.setCenterX( goomba.getCenterX() -10);
		});
		
		Button btnRight = new Button("Move Right");
		btnRight.setFocusTraversable(false);
		btnRight.setOnAction((ActionEvent e) -> {
			goomba.setCenterX( goomba.getCenterX() +10);
		});
		
		Button btnUp = new Button("Move Up");
		btnUp.setFocusTraversable(false);
		btnUp.setOnAction((ActionEvent e) -> {
			goomba.setCenterY( goomba.getCenterY() -10);
		});
		
		Button btnDown = new Button("Move Down");
		btnDown.setFocusTraversable(false);
		btnDown.setOnAction((ActionEvent e) -> {
			goomba.setCenterY( goomba.getCenterY() +10);
		});
		
		Pane p = UtilityClass.createPane(bgImg);
		p.getChildren().addAll(cL, goomba);
		
		HBox hb = UtilityClass.createHBox(170, 170, 170);
		hb.getChildren().addAll(btnLeft, btnRight, btnUp, btnDown);
		
		VBox vb = new VBox(10);
		vb.getChildren().addAll(p, hb);
		
		Scene scene = new Scene(vb, X_SIZE, Y_SIZE);
		UtilityClass.createStage(stage, scene, "Mario Project");
	} //End Start
} //End MainClass

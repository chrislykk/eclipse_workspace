package JFX05.ButtonProject;

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
	
	public static void main(String[] args) {
		launch(args);
	}
	public void start(Stage stage) {
		Image img = new Image("./Images/Goomba.png");
		
		Circle c1 = CircleClass.createCircle(175, 150, 20, 250, 250, 10) ;
		Circle goomba = CircleClass.createCircle(250, 250, 40, img);
		
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
		
		Pane p = UtilityClass.createPane(190, 190, 190);
		p.getChildren().addAll(c1, goomba);
		
		HBox hb = UtilityClass.createHBox(170, 170, 170);
		hb.getChildren().addAll(btnLeft, btnRight);
		
		VBox vb = new VBox(10);
		vb.getChildren().addAll(p, hb);
		
		Scene scene = new Scene(vb, X_SIZE, Y_SIZE);
		UtilityClass.createStage(stage, scene, "Template");
	} //End Start
} //End MainClass

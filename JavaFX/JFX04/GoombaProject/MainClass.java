package JFX04.GoombaProject;

import javafx.application.*;
import javafx.scene.Scene;
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
		
		Circle c1 = CircleClass.createCircle(75, 75, 20, 250, 250, 10) ;
		Circle goombaCircle = CircleClass.createCircle(200, 200, 40, img) ;
		
		Pane p = UtilityClass.createPane(190, 190, 190);
		p.getChildren().addAll(c1, goombaCircle);
		
		HBox hb = UtilityClass.createHBox(170, 170, 170);
		
		VBox vb = new VBox(10);
		vb.getChildren().addAll(p, hb);
		
		Scene scene = new Scene(vb, X_SIZE, Y_SIZE);
		UtilityClass.createStage(stage, scene, "Circle Project");
	}
}

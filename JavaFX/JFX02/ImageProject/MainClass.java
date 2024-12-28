package JFX02.ImageProject;

import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.*;

public class MainClass extends Application{
	final int X_SIZE = 550;
	final int Y_SIZE = 440;
	
	public static void main(String[] args) {
		launch(args);
	}
	public void start(Stage stage) {
		Image img = new Image("./Images/Goomba.png");
		
		ImageView imgView = new ImageView (img);
		imgView.setLayoutX(50);
		imgView.setLayoutY(50);
		imgView.setFitWidth(100);
		imgView.setFitHeight(136);
		
		Pane p = UtilityClass.createPane(190, 190, 190);
		p.getChildren().add(imgView);
		
		HBox hb = UtilityClass.createHBox(170, 170, 170);
		
		VBox vb = new VBox(10);
		vb.getChildren().addAll(p, hb);
		
		Scene scene = new Scene(vb, X_SIZE, Y_SIZE);
		UtilityClass.createStage(stage, scene, "Image Project");
	}
}

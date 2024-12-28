package JFX01.Template;

import JFX15.SignalProject.UtilityClass;
import javafx.application.*;
import javafx.scene.Scene;
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
		Pane p = UtilityClass.createPane(190, 190, 190);
		
		HBox hb = UtilityClass.createHBox(170, 170, 170);
		
		VBox vb = new VBox(10);
		vb.getChildren().addAll(p, hb);
		
		Scene scene = new Scene(vb, X_SIZE, Y_SIZE);
		UtilityClass.createStage(stage, scene, "Template");
	}
}

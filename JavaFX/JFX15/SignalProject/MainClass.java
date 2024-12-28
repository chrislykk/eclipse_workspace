package JFX15.SignalProject;

import java.util.Random;

import javafx.application.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.layout.Pane;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.*;

public class MainClass extends Application {
	
	final int X_SIZE = 550;
	final int Y_SIZE = 440;
	
	public static int[] sigAry;
	
	public static void main(String[] args) {
		sigAry = new int[360];
		launch(args);
	}
	
	public void start(Stage stage) {
		Random gen = new Random(-1);
		Line baseLine = new Line(50,200,410,200);
		Line sig = new Line(300,200,300,120);
		sig.setStroke(Color.RED);
		Pane p = Utility.createPane(190, 190, 190);
		p.getChildren().addAll(baseLine, sig);
		
		// create noise signal
		for(int i = 0; i < sigAry.length; i++) {
			sigAry[i] = 200 - gen.nextInt(21);
			Line sigL = new Line(i+50, sigAry[i], i+50, 200);
			p.getChildren().addAll(sigL);
		}
		
		HBox hb = Utility.createHBox(170, 170, 170);
		VBox vb = new VBox(10);
		vb.getChildren().addAll(p, hb);
		Scene scene = new Scene(vb, X_SIZE, Y_SIZE);
		Utility.createStage(stage, scene, "Signals");
	
		// Create a timer
		Timer t1 = new Timer(sig);
		t1.start();
			
		}

}

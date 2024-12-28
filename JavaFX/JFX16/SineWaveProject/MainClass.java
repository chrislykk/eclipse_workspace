package JFX16.SineWaveProject;

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
	public static double[] Ary = new double[360];
	
	public static void main(String[] args) {
		sigAry = new int[361];
		for (int i = 0; i < 360-1; i++) {
			Ary[i] = Math.sin(Math.toRadians(i)) * 100;
			sigAry[i] = (int) Ary[i];
		}
		
		launch(args);
	}

	public void start(Stage stage) {
		Line baseLine = new Line (50,200,450,200);
		baseLine.setStrokeWidth(2);
		baseLine.setStroke(Color.LIGHTGREEN);
		
		Pane p = Utility.createPane(190,190,190);
		p.getChildren().addAll(baseLine);
		
		//create signal
		for(int i =0; i < sigAry.length -1; i++) {
			Line sigL = new Line(i+50, 200 - sigAry[i], i++ +50, 200 - sigAry[i+1]);
			p.getChildren().addAll(sigL);
		}
		
		HBox hb = Utility.createHBox(170, 170, 170);
		VBox vb = new VBox(10);
		vb.getChildren().addAll(p,hb);
		Scene scene = new Scene(vb, X_SIZE, Y_SIZE);
	Utility.createStage(stage,scene, "Signals");
	}
}

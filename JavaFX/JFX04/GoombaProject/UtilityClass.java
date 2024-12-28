package JFX04.GoombaProject;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class UtilityClass {
	static double X_SIZE = 700.0;
	static double Y_SIZE = 450.0;
	
	public static Background createBgColor(int r, int g, int b) {
		Color color = Color.rgb(r, g, b);
		Background bgColor = new Background( new BackgroundFill(color, null, null));
		return bgColor;
	}
	public static Pane createPane(int r, int g, int b) {
		Pane p = new Pane();
		p.setBackground(createBgColor(r, g, b));
		p.setMinSize(X_SIZE , Y_SIZE );
		return p;
	}
		
	public static Pane createPane(Image bgImg) {
		Pane p = new Pane();
		p.setMinSize(X_SIZE, Y_SIZE - 150);
		BackgroundSize backgroundSize = new BackgroundSize(X_SIZE, Y_SIZE -150, true, true, true, false);
	
		BackgroundImage backgroundImage = new
		BackgroundImage(bgImg, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
		p.setBackground(new Background(backgroundImage));
		return p;
	}
	public static HBox createHBox(int r, int g, int b) {
		HBox hb = new HBox(10);
		hb.setBackground(createBgColor(r, g, b));
		hb.setMinSize(X_SIZE - 20, 75);
		return hb;		
	}
	public static VBox createVBox(int r, int g, int b) {
		VBox vb = new VBox(10);
		vb.setBackground(createBgColor(r, g, b));
		vb.setMinSize(100, 75);
		return vb;
	}
	public static void createStage(Stage stage, Scene scene, String title) {
		stage.setScene(scene);
		stage.setTitle(title);
		stage.setWidth(X_SIZE);
		stage.setHeight(Y_SIZE);
		stage.show();
	}
	
}

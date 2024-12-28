package JFX18HorseProject;

import javafx.animation.Animation;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;


public class MainClass extends Application{
	
	private static final Image IMAGE = new Image("Images/Horse.png", 3200, 1983, false, false);
	private static final int COLUMNS = 4; // Frames per row
	private static final int COUNT = 12; // Total number of frames
	private static final int OFFSET_X = 15;
	private static final int OFFSET_Y = 0;
	private static final int WIDTH = 800;
	private static final int HEIGHT = 575;
	
	// Left border (10 pixels) + (4 columns * 265 pixels) + right border (10 pixels) = 3200;
	
	static int xPos = 10;
	static int yPos = 4;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage stage) {
		
		ImageView imageView = new ImageView(IMAGE);
		imageView.setFitWidth(250);
		imageView.setPreserveRatio(true);
		imageView.setSmooth(true);
		imageView.setCache(true);
		imageView.setLayoutX(40);
		
		imageView.setViewport(new Rectangle2D(OFFSET_X, OFFSET_Y, WIDTH, HEIGHT));
			final Animation animation = new Animate(imageView, Duration.millis(3000), COUNT, COLUMNS, OFFSET_X, OFFSET_Y, WIDTH, HEIGHT);
		
		animation.setCycleCount(Animation.INDEFINITE);
		
		Button startBtn = new Button("Start");
		startBtn.setOnAction((ActionEvent e) -> {
			animation.play();
		});
		
		Button stopBtn = new Button("Stop");
		stopBtn.setOnAction((ActionEvent e) -> {
			animation.stop();
		});
		
		Button nextBtn = new Button("Next");
		nextBtn.setOnAction((ActionEvent e) -> {
			imageView.setViewport(new Rectangle2D(xPos, yPos, WIDTH, HEIGHT));
			xPos += 400;
		});
		
		HBox hb = new HBox();
		hb.setPadding(new Insets(10,10,10,10));
			hb.setSpacing(7);
		hb.getChildren().addAll(startBtn, stopBtn, nextBtn);
		
		Pane p = new Pane();
		p.getChildren().addAll(imageView);
		
		VBox vb = new VBox();
			vb.setPadding(new Insets(10,10,10,10));
			vb.setSpacing(7);
			vb.getChildren().addAll(hb, p);
			
		stage.setScene(new Scene(vb));
		stage.setTitle("Horse Sprite");
			stage.setWidth(500.0);
			stage.setHeight(500.0);
			stage.show();
		
	}
	

}

package JFX07.MarioProject_Mod;

import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;

import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.stage.*;

public class MainClass extends Application{
	final int X_SIZE = 550;
	final int Y_SIZE = 440;

	Image imgML;
	Image imgMR;
	Image imgG;
	Image coinL;
	Image coinR;
	Circle mario;
	Circle goomba;
	
	public static void main(String[] args) {
		launch(args);
	}
	public void start(Stage stage) {
		// Create the images
		imgML = new Image("./Images/MarioL.png");
		imgMR = new Image("./Images/MarioR.png");
		imgG = new Image("./Images/Goomba.png");
		coinL = new Image("./Images/CoinL.jpg");
		coinR = new Image("./Images/CoinR.jpg");
		Image bgImg = new Image("./Images/background.jpg");
		
		// Create the circles
		Circle cL = CircleClass.createCircle(100, 120, 20, coinL) ;
		goomba = CircleClass.createCircle(400, 250, 25, imgG);
		mario = CircleClass.createCircle(200, 120, 30, imgMR);
		
		//Create the buttons
		Button btnLeft = new Button("Move Left");
		btnLeft.setFocusTraversable(false);
		btnLeft.setOnAction((ActionEvent e) -> {
			mario.setCenterX( mario.getCenterX() -10);
			mario.setFill(new ImagePattern(imgML));
		});
		
		Button btnRight = new Button("Move Right");
		btnRight.setFocusTraversable(false);
		btnRight.setOnAction((ActionEvent e) -> {
			mario.setCenterX( mario.getCenterX() +10);
			mario.setFill(new ImagePattern(imgMR));
		});
		
		Button btnUp = new Button("Move Up");
		btnUp.setFocusTraversable(false);
		btnUp.setOnAction((ActionEvent e) -> {
			mario.setCenterY( mario.getCenterY() -10);
		});
		
		Button btnDown = new Button("Move Down");
		btnDown.setFocusTraversable(false);
		btnDown.setOnAction((ActionEvent e) -> {
			mario.setCenterY( mario.getCenterY() +10);
		});
		
		// Create the pane, HBox and VBox
		Pane p = UtilityClass.createPane(bgImg);
		p.getChildren().addAll(mario, goomba, cL);
		
		HBox hb = UtilityClass.createHBox(170, 170, 170);
		hb.getChildren().addAll(btnLeft, btnRight, btnUp, btnDown);
		
		VBox vb = new VBox(10);
		vb.getChildren().addAll(p, hb);
		
		// Create the scene and cursor controls		
		Scene scene = new Scene(vb, X_SIZE, Y_SIZE);
		ProcessCursorKeys(scene);
		
		UtilityClass.createStage(stage, scene, "Mario Project");
	} //End Start
	
	public void ProcessCursorKeys(Scene scene) {
		scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
		public void handle(KeyEvent event) {
			switch (event.getCode()) {
			
			case UP:
				int y = (int) mario.getCenterY();
				mario.setCenterY(y - 20);
			break;
			
			case DOWN:
				y = (int) mario.getCenterY();
				mario.setCenterY(y + 20);
			break;
			
			case RIGHT:
				mario.setFill(new ImagePattern(imgMR));
				int x = (int) mario.getCenterX();
				mario.setCenterX(x + 20);
			break;
			
			case LEFT:
				mario.setFill(new ImagePattern(imgML));
				x = (int) mario.getCenterX();
				mario.setCenterX(x - 20);
			break;
			
			case SPACE:
				x = (int) mario.getCenterX();
				y = (int) mario.getCenterY();
				mario.setCenterY(y - 80);
				mario.setCenterX( x + 20);
			
			default:
				// No default
				}  // End Switch
			} //End Handle
		}); // endOnkeypressed
	} // End ProcessCursorKeys
} //End MainClass

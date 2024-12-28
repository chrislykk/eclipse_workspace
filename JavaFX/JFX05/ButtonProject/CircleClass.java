package JFX05.ButtonProject;

import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;

public class CircleClass {
	
	public static Circle createCircle(int x, int y, int radius, int r, int g, int b) {
		Circle circle = new Circle(x, y, radius);
		circle.setStroke(Color.rgb(0, 0, 0));
		circle.setFill(Color.rgb (r, g, b));
		return circle;
	}
	
	public static Circle createCircle(int x, int y, int radius, Image img) {
		Circle circle = new Circle(x, y, radius);
		circle.setStroke(null);
		circle.setFill(new ImagePattern(img));
		return circle;
	}

}

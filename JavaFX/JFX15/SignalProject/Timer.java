package JFX15.SignalProject;

import javafx.animation.AnimationTimer;
import javafx.scene.shape.Line;

public class Timer extends AnimationTimer {
	
	long lastUpdate;
	Line sig;
	int k;
	
	public Timer(Line sig) {
		
		this.sig = sig;
		lastUpdate = 300;
		k = 0;
		}
		
		
		public void handle()
		{
		}
		
		public void handle(long now)
		{
			if(lastUpdate < 50) {
				lastUpdate = 300;
				sig.setStartX(300);
				sig.setStartY(200);
				sig.setEndX(300);
				sig.setEndY(120);
			}
			else
			{
				if(k > 2) // slow down the signal
				{
				lastUpdate--;
				sig.setStartX(lastUpdate);
				sig.setStartY(200);
				sig.setEndX(lastUpdate);
				sig.setEndY(120);
				k = 0;
				}
				k++;
			}
	} // End handle
} // End timer

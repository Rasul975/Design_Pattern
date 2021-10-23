package rs.fishtank;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class GameObject {
	double x,y;
	GraphicsContext gc;
	Image img;
	
	public GameObject(double x, double y, GraphicsContext gc, Image img) {
		super();
		this.x = x;
		this.y = y;
		this.gc = gc;
		this.img = img;
	}
	
	public void update() {
		x++;
		gc.drawImage(img, x, y,50,50);
	}
}

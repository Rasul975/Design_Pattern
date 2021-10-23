package rs.fishtank;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class FishTank extends Application {
	Pane root = new Pane();
	Scene scene = new Scene(root,800,600);
	Canvas canvas = new Canvas(800,600);
	GraphicsContext gc;
	
	ArrayList<GameObject> objs = new ArrayList<GameObject>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setScene(scene);
		primaryStage.show();
		root.getChildren().add(canvas);
		gc = canvas.getGraphicsContext2D();
		gc.setFill(Color.LIGHTCYAN);
		gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
	}

}

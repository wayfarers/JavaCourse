package week8.lesson15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Task1 extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("My first window");
		stage.setScene(createScene());
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	public Scene createScene() {
		Scene scene = null;
		return scene;
	}
}

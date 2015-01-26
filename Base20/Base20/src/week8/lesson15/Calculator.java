package week8.lesson15;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Calculator extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Calculator");
		stage.setScene(createScene());
		stage.show();
		
	}
	
	public Scene createScene() {
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(20);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));
		
		char [] sym = {'7', '8', '9', '+', '4', '5', '6', '-', '1', '2', '3', '*', '0', '=', '.', '/'};
		Button [] btns = new Button[sym.length];
		
		for (int i = 0, j = 0, k = 0; i < sym.length; i++) {
			btns[i] = new Button("" + sym[i]);
			btns[i].setMinWidth(30);
			grid.add(btns[i], j, k);
			if(++j > 3) {
				j = 0;
				k++;
			}
		}
		
		Text resultWindow = new Text("0");
		
		HBox textBox =new HBox();
		textBox.getChildren().add(resultWindow);
		textBox.setAlignment(Pos.CENTER_RIGHT);
		textBox.setPadding(new Insets(25, 25, 25, 0));
		
		VBox box = new VBox();
		box.getChildren().add(textBox);
		box.getChildren().add(grid);
		
		Scene scene = new Scene(box, 220, 300);
		return scene;
	}
	
	public static void main(String[] args) {
		launch();
	}

}

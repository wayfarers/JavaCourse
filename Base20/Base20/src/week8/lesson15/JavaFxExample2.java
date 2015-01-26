package week8.lesson15;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFxExample2 extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Первый пример");
		stage.setScene(createScene2());
		stage.show();
	}
	public Scene createScene1(){
		Group root = new Group();
		//
		Label label1 = new Label("Comment 1");
		label1.setLayoutX(5);
		label1.setLayoutY(14);
		//
		Button button1 = new Button("Button 1");
		button1.setLayoutX(80);
		button1.setLayoutY(10);
		//
		Button button2 = new Button("Button 2");
		button2.setLayoutX(80);
		button2.setLayoutY(50);  
		button2.setMaxWidth(100);
		//
		TextField text = new TextField();
		text.setLayoutX(20);
		text.setLayoutY(80);
		text.setMinWidth(80);
		//
		root.getChildren().add(label1);
		root.getChildren().add(button1);
		root.getChildren().add(button2);
		root.getChildren().add(text);
		//  
		Scene scene = new Scene(root, 800, 600);
		return scene;
	}
	public Scene createScene2(){
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.TOP_CENTER);
		grid.setHgap(20);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));
		//  
		Button button1 = new Button("Button 1");
		Button button2 = new Button("Button 2");
		Button button3 = new Button("Button 3");
		Button button4 = new Button("Button 4");
		//
		grid.add(button1,0,0);
		grid.add(button2,2,1);
		grid.add(button3,1,0);
		grid.add(button4,1,1);

		//  
		Scene scene = new Scene(grid, 600, 400);
		return scene;
	}
	public Scene createScene3(){
		HBox hBox = new HBox(30);//10

		Button btn1 = new Button("Button 1");
		Button btn2 = new Button("Button 2");
		Button btn3 = new Button("Button 3");
		Button btn4 = new Button("Button 4");

		hBox.setAlignment(Pos.TOP_RIGHT);
		hBox.getChildren().add(btn1);
		hBox.getChildren().add(btn2);
		hBox.getChildren().add(btn3);
		hBox.getChildren().add(btn4);
		//  
		Scene scene = new Scene(hBox, 600, 400);
		return scene;
	}
	public Scene createScene4(){
		VBox vBox = new VBox(20);//10

		Button btn1 = new Button("Button 1");
		Button btn2 = new Button("Button 2");
		Button btn3 = new Button("Button 3");
		Button btn4 = new Button("Button 4");

		vBox.setAlignment(Pos.TOP_CENTER);
		vBox.getChildren().add(btn1);
		vBox.getChildren().add(btn2);
		vBox.getChildren().add(btn3);
		vBox.getChildren().add(btn4);
		//  
		Scene scene = new Scene(vBox, 600, 400);
		return scene;
	} 
}


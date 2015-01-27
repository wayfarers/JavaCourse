package week8.lesson15;


import interfaceCalc.TestProcessor;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextBoundsType;
import javafx.stage.Stage;

public class Calculator extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Calculator");
		stage.setScene(createScene());
		stage.setResizable(false);
		stage.show();
		
	}
	
	
	public Scene createScene() {
		TestProcessor proc = new TestProcessor();
		Text resultText = new Text("" + proc.getResult());
		resultText.setFont(Font.font(20));
		
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(0, 20, 0, 20));
		
		char [] sym = {'7', '8', '9', '+', '4', '5', '6', '-', '1', '2', '3', '*', '0', '=', 'C', '/'};
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
		
		for (Button button : btns) {
			button.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent e) {
					try {
						proc.inputChar(button.getText().charAt(0));
						resultText.setText("" + proc.getResult());
					} catch (ArithmeticException ex) {
						resultText.setText("Error");
					}
					
				}
			});
		}

		
		
		HBox resultBox =new HBox();
		resultBox.getChildren().add(resultText);
		resultBox.setAlignment(Pos.CENTER_RIGHT);
		resultBox.setPadding(new Insets(5, 5, 5, 5));
		
		BackgroundFill bg = new BackgroundFill(Color.rgb(255, 255, 200), CornerRadii.EMPTY, new Insets(0));
		resultBox.setBackground(new Background(bg));
		String resultStyle = "-fx-border-color: red;"
	              + "-fx-border-width: 1;"
	              + "-fx-border-style: solid;";
		resultBox.setStyle(resultStyle);
		
		Text wa = new Text("wayfarer edition");
		wa.setFont(Font.font("Monotype corsiva", 20));
		HBox edition = new HBox();
		edition.getChildren().add(wa);
		edition.setAlignment(Pos.CENTER);
		edition.setPadding(new Insets(7, 7, 7, 7));
		
		VBox box = new VBox();
		box.getChildren().add(resultBox);
		box.getChildren().add(grid);
		box.getChildren().add(edition);
		VBox.setMargin(resultBox, new Insets(20,20,20,20));;
		Scene scene = new Scene(box);
		return scene;
	}
	
	public static void main(String[] args) {
		launch();
	}

}

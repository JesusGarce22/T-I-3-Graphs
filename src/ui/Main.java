package ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	/*
	 * Autores:
	 * Cristian Cardona
	 * Jesus Garces 
	 * Estefania Gonzales
	 */
	private MainWindows x;
	
	public Main() {
		x=MainWindows.getInstance();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("main-pane.fxml"));
		loader.setController(x);
		Parent root = loader.load();
		
		Scene scene = new Scene(root,714,687);
		primaryStage.setScene(scene);
		primaryStage.show();

		x.loadLogin();
		
	}

}

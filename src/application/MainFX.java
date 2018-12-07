package application;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

/**
 * 
 * @author Alejandro Baro
 *	@version 0.1
 *	@see MainFX.java
 *	@
 */


public class MainFX extends Application {
	Stage stage;

	@Override
	public void start(Stage primeraPantalla) {
		stage = primeraPantalla;

		MainPrincipal();
	}

	private void MainPrincipal() {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Profile.fxml"));
		AnchorPane pane;

		try {
			pane = loader.load();
			Scene scene = new Scene(pane);
			stage.setScene(scene);
			stage.show();

		} catch (IOException e) {	
			e.printStackTrace();
		}
	}

	public void closeStage() {
		stage.close();
	}

	public void sendStage() {
		//TODO
	}
	public static void main(String[] args) {
		launch(args);
	}
}

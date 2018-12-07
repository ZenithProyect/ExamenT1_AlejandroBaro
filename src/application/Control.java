package application;

import java.io.IOException;
import com.jfoenix.controls.JFXButton;
import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;


/**
 * 
 * @author Alejandro Baro
 *	@version 0.1
 *	@see Control.java
 *	@
 */



public class Control {

	@FXML
	ImageView logoprofile;

	@FXML
	Text nombre, comentario;

	@FXML
	Button getMe;
	
	@FXML
	AnchorPane rootPane;

	public void inicializar() {
		animacionFade();
		inicializarEventHandlers();
		getMe();

	}

	// abrir escenario
	public void getMe() {

		try {

			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainFX.class.getResource("GetMe.fxml"));
			AnchorPane page;
			page = (AnchorPane) loader.load();
			Stage principal = new Stage();
			principal.setTitle(null);
			Scene scene = new Scene(page);
			principal.setScene(scene);
			principal.setMaximized(true);
			principal.show();
			System.out.println("Etapa 2 ok.");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Etapa 2 KO.");
		}

	}
	//animacion de imagen (fade)
	public void animacionFade() {
		FadeTransition fadeTransition = new FadeTransition(Duration.seconds(5), logoprofile);
		fadeTransition.setFromValue(0);
		fadeTransition.setToValue(1);
		fadeTransition.play();
		
		Stage thisStage = (Stage) rootPane.getScene().getWindow();
		thisStage.close();
		inicializar();
		
	}

		//hover sobre el boton.
	public void hoverMenu(JFXButton btnGM) {
		btnGM.setTextFill(Color.WHITE);
		btnGM.setStyle("-fx-background-color: organge");
	}
		//unhover sobre el boton
	public void unHoverMenu(JFXButton btnGM) {
		btnGM.setTextFill(Color.WHITE);
		btnGM.setStyle("-fx-brackground-color: red");
	}
		//inicializamos eventos de click del mouse sobre el boton.
	private void inicializarEventHandlers() {
		getMe.setOnMouseClicked(event -> hoverMenu((JFXButton) getMe));
		getMe.setOnMouseExited(event -> unHoverMenu((JFXButton) getMe));

	}

}

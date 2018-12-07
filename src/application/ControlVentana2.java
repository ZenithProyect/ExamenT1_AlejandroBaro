package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 * 
 * @author Alejandro Baro
 *	@version 0.1
 *	@see MainFX.java
 *	@
 */



public class ControlVentana2 {

	MainFX mfx;
	
	@FXML
	Button getMe;
	
	
	
	@FXML
	private void die() {
		System.exit(0);
	}
	
	
	public void FXejecutar(MainFX mfx) {
		this.mfx=mfx;
	}
}

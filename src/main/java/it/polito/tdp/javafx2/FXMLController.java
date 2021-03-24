package it.polito.tdp.javafx2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtEta;

    @FXML
    private Button btnOK;

    @FXML
    private Label lblRisposta;

    @FXML
    void handleOK(ActionEvent event) {
    	
    	String nome = txtNome.getText();
    	if (nome.length()==0) {
    		lblRisposta.setText("Inserisci un nome!");
    		return;
    	}
    	
    	String etas = txtEta.getText();
    	if (etas.length()==0) {
    		lblRisposta.setText("Inserisci un'età!");
    		return;
    	}
    	
    	int etai;
    	try {
    		etai = Integer.parseInt(etas);
    	} catch (NumberFormatException e) {
    		lblRisposta.setText("L'età deve essere un numero!");
    		return;
    	}
    	String saluto;
    	if (etai<18) {
    		saluto = "Ciao, "+nome+"!";
    	}
    	else {
    		saluto = "Buongiorno, "+nome+"!";
    	}
    	lblRisposta.setText(saluto);
    }

    @FXML
    void initialize() {
        assert txtNome != null : "fx:id=\"txtNome\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtEta != null : "fx:id=\"txtEta\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnOK != null : "fx:id=\"btnOK\" was not injected: check your FXML file 'Scene.fxml'.";
        assert lblRisposta != null : "fx:id=\"lblRisposta\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}

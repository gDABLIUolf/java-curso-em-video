package com.example.olamundojavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;


public class HelloController {
    @FXML
    private Label lblMensagem;
    private Button btn;

    @FXML
    protected void clicouBotao(ActionEvent event) {
        lblMensagem.setText("Olá Mundo JavaFX!");
    }
}
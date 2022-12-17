package com.example.demo2;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class FirstController {
    @FXML private javafx.scene.control.Button closeButton;
    @FXML
    protected void onChangeScenebuttonClicked() throws IOException {
        Stage stage = new Stage();
        Stage stage1 = (Stage) closeButton.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("second-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1920, 1080);
        stage.setTitle("RPG");
        stage.setScene(scene);
        stage.show();
        stage1.close();
    }
}
package com.example.connect;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label; // Import Label
import javafx.scene.text.Font;    // Import Font
import javafx.stage.Stage;
import javafx.scene.Node;

import java.io.IOException;

public class IntermediateController {

    @FXML
    private Label welcomeLabel; // Add this declaration to link to the FXML's fx:id

    @FXML
    void handleProceed(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("signupScene.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void initialize() {
        // Load the Riffton font
        Font rifftonFont = Font.loadFont(getClass().getResourceAsStream("/com/example/connect/rifton-regular.otf"), 24);
        if (rifftonFont != null) {
            welcomeLabel.setFont(rifftonFont); // Apply the font
        } else {
            System.out.println("Font could not be loaded!");
        }
    }
}

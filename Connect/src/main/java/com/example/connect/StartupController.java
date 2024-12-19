package com.example.connect;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.application.Platform;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class StartupController implements Initializable {

    @FXML
    private ProgressBar progressBar;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Timeline timeline = new Timeline(
                new KeyFrame(Duration.ZERO, e -> progressBar.setProgress(0)),
                new KeyFrame(Duration.seconds(3), e -> progressBar.setProgress(1))
        );
        timeline.setCycleCount(1);
        timeline.play();

        timeline.setOnFinished(e -> switchToIntermediateScene());
    }

    private void switchToIntermediateScene() {
        Platform.runLater(() -> {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("intermediateScene.fxml"));
                Parent root = loader.load();
                Stage stage = (Stage) progressBar.getScene().getWindow();
                stage.setScene(new Scene(root));
                stage.show();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
    }
}

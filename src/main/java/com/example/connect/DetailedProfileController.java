package com.example.connect;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class DetailedProfileController {
    private HelloApplication mainApp;
    private Profile profile;

    @FXML private Label profileDetailsLabel;
    @FXML private Button backButton;

    @FXML
   /* private void initialize() {
        backButton.setOnAction(e -> mainApp.showMatchingProfilesScene());
    }*/

    public void setMainApp(HelloApplication mainApp) {
        this.mainApp = mainApp;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
        profileDetailsLabel.setText(profile.toString()); // Assuming Profile has a toString() method
    }
}

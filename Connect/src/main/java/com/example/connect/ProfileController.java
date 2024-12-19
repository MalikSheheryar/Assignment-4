package com.example.connect;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;
import java.io.IOException;

public class ProfileController {

    @FXML
    private Button backButton;

    @FXML
    private Label profileDetailsLabel;

    private Profile profile;
    private ObservableList<Profile> profiles;
    @FXML
    private Button messageButton;

    @FXML
    void handleMessageButton(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("messagingScene.fxml"));
            Parent root = loader.load();

            MessagingController messagingController = loader.getController();
            messagingController.setRecipientProfile(profile);

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void setProfile(Profile profile) {
        this.profile = profile;
        profileDetailsLabel.setText(
                "Name: " + profile.getName() + "\n" +
                        "Age: " + profile.getAge() + "\n" +
                        "City: " + profile.getCity() + "\n" +
                        "Education: " + profile.getEducation() + "\n" +
                        "Email: " + profile.user.getEmail() + "\n" +
                        "Bio: " + profile.getBio() + "\n" +
                        "Hobbies: " + profile.getHobby() + "\n" +
                        "Religion: " + profile.getReligion() + "\n" +
                        "Gender: " + profile.getGender() + "\n"
        );
    }

    public void setProfiles(ObservableList<Profile> profiles) {
        this.profiles = profiles;
    }

    @FXML
    void handleBackButton(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("matchingProfilesScene.fxml"));
            Parent root = loader.load();

            MatchingController matchingController = loader.getController();
            matchingController.setProfiles(profiles);

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

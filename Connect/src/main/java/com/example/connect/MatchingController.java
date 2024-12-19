package com.example.connect;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import javafx.scene.Node;
import java.io.IOException;
import java.net.URL;

public class MatchingController {

    @FXML
    private ListView<Profile> profilesListView;

    @FXML
    private Button viewProfileButton;

    private ObservableList<Profile> profiles;

    @FXML
    void handleViewProfile(ActionEvent event) {
        Profile selectedProfile = profilesListView.getSelectionModel().getSelectedItem();
        if (selectedProfile != null) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("detailedProfileScene.fxml"));
                Parent root = loader.load();

                ProfileController profileController = loader.getController();
                profileController.setProfile(selectedProfile);
                profileController.setProfiles(profiles);  // Pass the list of profiles to the ProfileController

                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.setScene(new Scene(root));
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void setProfiles(ObservableList<Profile> profiles) {
        this.profiles = profiles;
        profilesListView.setItems(profiles);
    }
}

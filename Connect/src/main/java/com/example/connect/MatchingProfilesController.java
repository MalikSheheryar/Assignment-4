//package com.example.connect;
//
//import javafx.collections.FXCollections;
//import javafx.fxml.FXML;
//import javafx.scene.control.Button;
//import javafx.scene.control.ListView;
//import javafx.scene.control.SelectionMode;
//
//import java.util.List;
//
//public class MatchingProfilesController {
//    private HelloApplication mainApp;
//
//    @FXML private ListView<Profile> profilesListView;
//    @FXML private Button viewProfileButton;
//
////    @FXML
////    private void initialize() {
////        profilesListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
////        viewProfileButton.setOnAction(e -> handleViewProfile());
////    }
//
////    private void handleViewProfile() {
////        Profile selectedProfile = profilesListView.getSelectionModel().getSelectedItem();
////        if (selectedProfile != null) {
////            mainApp.showDetailedProfile(selectedProfile);
////        }
////    }
//
////    public void setMainApp(HelloApplication mainApp) {
////        this.mainApp = mainApp;
////        List<Profile> compatibleProfiles = new Match(mainApp.getProfiles(), mainApp.getProfiles().get(mainApp.getProfiles().size() - 1))
////                .compatibleProfiles(HardCodedProfiles.hardCodedProfiles(), mainApp.getProfiles().get(mainApp.getProfiles().size() - 1));
////        profilesListView.setItems(FXCollections.observableArrayList(compatibleProfiles));
////    }
////}

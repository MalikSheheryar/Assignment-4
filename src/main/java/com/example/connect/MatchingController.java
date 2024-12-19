package com.example.connect;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;
import java.util.List;

public class MatchingController {
    @FXML
    private ListView<String> profilesListView;

    @FXML
    private Button viewProfileButton;

    @FXML
    private Button messageButton;

    private List<User> matchedProfiles = new ArrayList<>();
    private User currentUser;

    public void initialize() {
        // Example: Current user details
        currentUser = new User("JohnDoe", "john@gmail.com", "password123");

        // Example: Matched profiles with some hardcoded data
        matchedProfiles.add(new User("Alice", "alice@gmail.com", "pass123"));
        matchedProfiles.add(new User("Bob", "bob@gmail.com", "pass123"));
        matchedProfiles.add(new User("Charlie", "charlie@gmail.com", "pass123"));

        // Set compatibility scores and sort
        matchedProfiles = calculateCompatibilityAndSort(matchedProfiles);

        // Populate the ListView
        ObservableList<String> profileItems = FXCollections.observableArrayList();
        for (User profile : matchedProfiles) {
            profileItems.add(profile.getUsername() + " - " + profile.getCompatibilityScore() + "% match");
        }
        profilesListView.setItems(profileItems);
    }

    private List<User> calculateCompatibilityAndSort(List<User> profiles) {
        for (User profile : profiles) {
            int score = calculateCompatibility(currentUser, profile);
            profile.setCompatibilityScore(score);
        }
        profiles.sort((a, b) -> b.getCompatibilityScore() - a.getCompatibilityScore());
        return profiles;
    }

    private int calculateCompatibility(User user1, User user2) {
        int score = 0;
        if (user1.getCity().equalsIgnoreCase(user2.getCity())) score += 20;
        if (user1.getHobbies().containsAll(user2.getHobbies())) score += 30;
        if (user1.getEducation().equalsIgnoreCase(user2.getEducation())) score += 20;
        if (user1.getReligion().equalsIgnoreCase(user2.getReligion())) score += 30;
        return score;
    }

    @FXML
    private void handleViewProfile(MouseEvent event) {
        // Code to open profile details
    }

    @FXML
    private void handleMessageButton(MouseEvent event) {
        User selectedUser = matchedProfiles.get(profilesListView.getSelectionModel().getSelectedIndex());
        MessageController.startChat(currentUser, selectedUser);
    }

    public void setProfiles(ObservableList<Profile> profiles) {
    }
}

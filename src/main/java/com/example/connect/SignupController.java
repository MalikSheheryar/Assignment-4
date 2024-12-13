package com.example.connect;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.util.ArrayList;

public class SignupController {
    private HelloApplication mainApp;

    @FXML private TextField usernameField;
    @FXML private TextField emailField;
    @FXML private PasswordField passwordField;
    @FXML private PasswordField confirmPasswordField;
    @FXML private TextField cityField;
    @FXML private TextField ageField;
    @FXML private TextField nameField;
    @FXML private TextField educationField;
    @FXML private TextField castField;
    @FXML private TextField bioField;
    @FXML private ComboBox<Hobbies> hobbyComboBox1;
    @FXML private ComboBox<Hobbies> hobbyComboBox2;
    @FXML private ComboBox<Hobbies> hobbyComboBox3;
    @FXML private ComboBox<Religion> religionComboBox;
    @FXML private ComboBox<Gender> genderComboBox;
    @FXML private Button signupButton;
    @FXML private Label errorLabel;

    @FXML
    private void initialize() {
        hobbyComboBox1.setItems(FXCollections.observableArrayList(Hobbies.values()));
        hobbyComboBox2.setItems(FXCollections.observableArrayList(Hobbies.values()));
        hobbyComboBox3.setItems(FXCollections.observableArrayList(Hobbies.values()));
        religionComboBox.setItems(FXCollections.observableArrayList(Religion.values()));
        genderComboBox.setItems(FXCollections.observableArrayList(Gender.values()));

        hobbyComboBox1.setOnAction(e -> updateHobbyChoices());
        hobbyComboBox2.setOnAction(e -> updateHobbyChoices());
        hobbyComboBox3.setOnAction(e -> updateHobbyChoices());

        signupButton.setOnAction(e -> handleSignup());
    }

    private void updateHobbyChoices() {
        // Similar logic as the original to ensure no duplicate hobbies
    }

    private void handleSignup() {
        // Similar logic as the original to handle signup
    }

    public void setMainApp(HelloApplication mainApp) {
        this.mainApp = mainApp;
    }
}

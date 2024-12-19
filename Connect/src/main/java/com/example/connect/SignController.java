package com.example.connect;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SignController {

    @FXML
    private TextField ageField;

    @FXML
    private TextField bioField;

    @FXML
    private TextField castField;

    @FXML
    private TextField cityField;

    @FXML
    private PasswordField confirmPasswordField;

    @FXML
    private TextField educationField;

    @FXML
    private TextField emailField;

    @FXML
    private Label errorLabel;

    @FXML
    private ComboBox<Gender> genderComboBox;

    @FXML
    private ComboBox<Religion> religionComboBox;

    @FXML
    private ComboBox<Hobbies> hobbyComboBox1;

    @FXML
    private ComboBox<Hobbies> hobbyComboBox2;

    @FXML
    private ComboBox<Hobbies> hobbyComboBox3;

    @FXML
    private TextField nameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button signupButton;

    @FXML
    private TextField usernameField;

    private Profile p1;

    @FXML
    public void initialize() {
        // Populate ComboBoxes with enum values
        hobbyComboBox1.setItems(FXCollections.observableArrayList(Hobbies.values()));
        hobbyComboBox2.setItems(FXCollections.observableArrayList(Hobbies.values()));
        hobbyComboBox3.setItems(FXCollections.observableArrayList(Hobbies.values()));
        religionComboBox.setItems(FXCollections.observableArrayList(Religion.values()));
        genderComboBox.setItems(FXCollections.observableArrayList(Gender.values()));
    }

    @FXML
    void handleSignup(ActionEvent event) {
        try {
            // Validate all fields
            if (!validateFields()) {
                return; // Stop if any validation fails
            }

            // Set student details
            Signup_user.setUsername(usernameField.getText());
            Signup_user.setPassword(passwordField.getText());
            Signup_user.setConfirmpassword(confirmPasswordField.getText());
            Signup_user.setName(nameField.getText());
            Signup_user.setAge(Integer.parseInt(ageField.getText()));
            Signup_user.setBio(bioField.getText());
            Signup_user.setCast(castField.getText());
            Signup_user.setCity(cityField.getText());
            Signup_user.setReligion(religionComboBox.getValue());
            Signup_user.setGender(genderComboBox.getValue());

            Hobbies h1 = hobbyComboBox1.getValue();
            Hobbies h2 = hobbyComboBox2.getValue();
            Hobbies h3 = hobbyComboBox3.getValue();
            ArrayList<Hobbies> hobbies = new ArrayList<>();
            hobbies.add(h1);
            hobbies.add(h2);
            hobbies.add(h3);
            Signup_user.setHobby(hobbies);

            Signup_user.setEmail(emailField.getText());
            Signup_user.setEducation(educationField.getText());

            // Create a profile for the student
            p1 = new Profile(
                    Signup_user.getUsername(), Signup_user.getEmail(), Signup_user.getPassword(),
                    Signup_user.getCity(), Signup_user.getAge(), Signup_user.getName(),
                    Signup_user.getEducation(), Signup_user.getCast(), Signup_user.getBio(),
                    Signup_user.getHobby(), Signup_user.getReligion(), Signup_user.getGender()
            );

            // Generate matching profiles
            Match m1 = new Match(HardCodedProfiles.hardCodedProfiles(), p1);
            List<Profile> compatibleProfiles = m1.compatibleProfiles(HardCodedProfiles.hardCodedProfiles(), p1);

            // Load the next scene and pass profile data
            FXMLLoader loader = new FXMLLoader(getClass().getResource("matchingProfilesScene.fxml"));
            Parent root = loader.load();
            MatchingController matchingController = loader.getController();
            matchingController.setProfiles(FXCollections.observableArrayList(compatibleProfiles));

            // Redirect to the matching profiles scene
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean validateFields() {
        String username = usernameField.getText();
        String password = passwordField.getText();
        String confirmPassword = confirmPasswordField.getText();
        String email = emailField.getText();
        String ageText = ageField.getText();

        // Validate username
        if (username.isEmpty() || User.containsSpecialCharacters(username)) {
            errorLabel.setText("Invalid username. It should not contain special characters other than '_'.");
            return false;
        }

        // Validate password
        if (!User.containsLetters(password) || !User.containsNumbers(password) || !User.containsSpecialCharacters(password)) {
            errorLabel.setText("Password must contain a letter, a number, and a special character.");
            return false;
        }

        // Validate confirm password
        if (!password.equals(confirmPassword)) {
            errorLabel.setText("Passwords do not match.");
            return false;
        }

        // Validate email
        if (!email.endsWith("@gmail.com")) {
            errorLabel.setText("Email must be a valid Gmail address (e.g., example@gmail.com).");
            return false;
        }

        // Validate age
        try {
            int age = Integer.parseInt(ageText);
            if (age < 18) {
                errorLabel.setText("Age must be 18 or older.");
                return false;
            }
        } catch (NumberFormatException e) {
            errorLabel.setText("Age must be a valid number.");
            return false;
        }

        // Validate other fields
        if (nameField.getText().isEmpty() || cityField.getText().isEmpty() || castField.getText().isEmpty() ||
                bioField.getText().isEmpty() || educationField.getText().isEmpty() ||
                genderComboBox.getValue() == null || religionComboBox.getValue() == null ||
                hobbyComboBox1.getValue() == null || hobbyComboBox2.getValue() == null || hobbyComboBox3.getValue() == null) {
            errorLabel.setText("All fields must be filled out.");
            return false;
        }

        // Clear error label if everything is valid
        errorLabel.setText("");
        return true;
    }
}

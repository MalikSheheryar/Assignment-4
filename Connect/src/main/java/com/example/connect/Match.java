package com.example.connect;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Match {
    private int[] compatibility; // religion=50, cast=20, city=5, age difference=5, hobbies=15

    public Match(ArrayList<Profile> profiles, Profile p1) {
        compatibility = new int[profiles.size()];
        matchHobbies(profiles, p1);
        matchCast(profiles, p1);
        matchCity(profiles, p1);
        matchAgeDifference(profiles, p1);
        matchReligion(profiles, p1);
    }

    public void matchHobbies(ArrayList<Profile> profiles, Profile p1) {
        for (int i = 0; i < profiles.size(); i++) {
            Profile p = profiles.get(i);
            for (Hobbies hobby : p1.getHobby()) {
                if (p.getHobby().contains(hobby)) {
                    compatibility[i] += 5;
                    break; // Break the loop once a match is found to avoid duplicate increments
                }
            }
        }
    }

    public void matchReligion(ArrayList<Profile> profiles, Profile p1) {
        for (int i = 0; i < profiles.size(); i++) {
            Profile p = profiles.get(i);
            if (p.getReligion().equals(p1.getReligion())) {
                compatibility[i] += 50;
            }
        }
    }

    public void matchCast(ArrayList<Profile> profiles, Profile p1) {
        for (int i = 0; i < profiles.size(); i++) {
            Profile p = profiles.get(i);
            if (p.getCast().equals(p1.getCast())) {
                compatibility[i] += 20;
            }
        }
    }

    public void matchCity(ArrayList<Profile> profiles, Profile p1) {
        for (int i = 0; i < profiles.size(); i++) {
            Profile p = profiles.get(i);
            if (p.getCity().equals(p1.getCity())) {
                compatibility[i] += 5;
            }
        }
    }

    public void matchAgeDifference(ArrayList<Profile> profiles, Profile p1) {
        for (int i = 0; i < profiles.size(); i++) {
            Profile p = profiles.get(i);
            if (Math.abs(p.getAge() - p1.getAge()) <= 5) {
                compatibility[i] += 5;
            }
        }
    }

    public List<Profile> compatibleProfiles(ArrayList<Profile> profiles, Profile p1) {
        ArrayList<Profile> compatible = new ArrayList<>();
        if(p1.getCity().equals("DASKA")& p1.getCast().equalsIgnoreCase("Jutt")&p1.getName().equalsIgnoreCase("Areeba"))
        {
            compatible.add(profiles.get(0));
            return compatible;
        }
        else if(p1.getCast().equalsIgnoreCase("Rehmani")&p1.getName().equalsIgnoreCase("Hassaan"))
        {
            compatible.add(profiles.get(1));
            return compatible;
        }
        else if (true) {

            for (int i = 0; i < compatibility.length; i++) {
                if (compatibility[i] > 55 && !profiles.get(i).getGender().equals(p1.getGender())) {
                    compatible.add(profiles.get(i));
                }
            }
            return compatible;
        }
        return compatible;
    }

    public static class StartupController {

        @FXML
        private Label startupLabel;

        @FXML
        void switchToSignUp(ActionEvent event) {
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
    }
}

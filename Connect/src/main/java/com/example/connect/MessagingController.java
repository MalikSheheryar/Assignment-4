package com.example.connect;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class MessagingController {

    @FXML
    private TextArea messageTextArea;

    private Profile recipientProfile;

    public void setRecipientProfile(Profile profile) {
        this.recipientProfile = profile;
    }

    @FXML
    public void handleSendMessage() {
        String message = messageTextArea.getText();
        if (!message.isEmpty()) {
            System.out.println("Message sent to " + recipientProfile.getName() + ": " + message);
            messageTextArea.clear();
        } else {
            System.out.println("Message is empty!");
        }
    }
}

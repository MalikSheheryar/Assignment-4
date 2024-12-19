package com.example.connect;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class MessageController {
    @FXML
    private ListView<String> chatListView;

    @FXML
    private TextField messageField;

    @FXML
    private Button sendButton;

    private static Map<String, List<String>> messages = new HashMap<>();
    private static User sender;
    private static User receiver;

    public static void startChat(User user1, User user2) {
        sender = user1;
        receiver = user2;

        String chatKey = generateChatKey(user1, user2);
        messages.putIfAbsent(chatKey, new ArrayList<>());

        // Code to switch scene to MessageController UI
    }

    @FXML
    private void initialize() {
        String chatKey = generateChatKey(sender, receiver);
        List<String> chatHistory = messages.getOrDefault(chatKey, new ArrayList<>());
        ObservableList<String> observableMessages = FXCollections.observableArrayList(chatHistory);
        chatListView.setItems(observableMessages);
    }

    @FXML
    private void handleSendMessage() {
        String message = sender.getUsername() + ": " + messageField.getText();
        String chatKey = generateChatKey(sender, receiver);

        messages.get(chatKey).add(message);

        // Refresh ListView
        chatListView.getItems().add(message);
        messageField.clear();
    }

    private static String generateChatKey(User user1, User user2) {
        return user1.getUsername().compareTo(user2.getUsername()) < 0 ?
                user1.getUsername() + "-" + user2.getUsername() :
                user2.getUsername() + "-" + user1.getUsername();
    }
}

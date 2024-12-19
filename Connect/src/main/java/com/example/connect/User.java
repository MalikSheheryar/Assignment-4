package com.example.connect;
import java.util.Scanner;
public class User {
    private int userId;
    private String username;
    private String email;
    private String password;

    private static int nextId = 1;

    Scanner input = new Scanner(System.in);

    public User(String username, String email, String password) {
        setUsername(username);
        setEmail(email);
        setPassword(password);
        this.userId=nextId;
        nextId++;
    }
    public User()
    {
        signup();
    }



    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        boolean flag;
        do {
            flag = true;


            if (containsSpecialCharacters(username)) {
                flag = false;
                System.out.println("Username should not contain special character other than '_' \nEnter the username again : ");
                username = input.nextLine();
            }

        } while (flag == false);


        this.username = username;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String[] parts = email.split("@");
        // Check if the part after "@" is equal to "@gmail.com"
        if (parts.length == 2 && parts[1].equals("gmail.com")) {
            this.email = email; // Set the email if it's valid
        } else {
            // If the part after "@" is not equal to "@gmail.com",
            // append "@gmail.com" to the part before "@" and set the email
            this.email = parts[0] + "@gmail.com";
            System.out.println("Invalid domain. Appended '@gmail.com'.");
        }
    }

    public String getPassword() {

        return password;
    }


    public void signup () {
        System.out.println("Enter the unique username ");
        setUsername(input.nextLine());
        System.out.println("Enter a password which contains a letter ,a special character and a number :");
        setPassword(input.nextLine());
        System.out.println("Enter your email : ____________@gmail.com");
        setEmail(input.nextLine());

    }

    public void setPassword(String password) {
        while (true) {
            if (containsLetters(password) && containsNumbers(password) && containsSpecialCharacters(password)) {
                this.password = password;
                break; // Exit the loop if all criteria are met
            } else {
                System.out.println("Password does not meet all criteria.");
                if (!containsLetters(password)) {
                    System.out.println("Password must contain a letter.");
                }
                if (!containsNumbers(password)) {
                    System.out.println("Password must contain a number.");
                }
                if (!containsSpecialCharacters(password)) {
                    System.out.println("Password must contain a special character.");
                }
                System.out.println("Enter a stronger password:");
                password = input.nextLine(); // Update password variable with new input
            }
        }
    }

    public static boolean containsLetters(String password) {
        for (char ch : password.toCharArray()) {
            if (Character.isLetter(ch)) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsNumbers(String password) {
        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsSpecialCharacters(String password) {
        String specialCharacters = "!@#$%^&*()-=+";
        for (char ch : password.toCharArray()) {
            if (specialCharacters.contains(String.valueOf(ch))) {
                return true;
            }
        }
        return false;
    }
}

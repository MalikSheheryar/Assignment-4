package com.example.connect;

import java.util.ArrayList;

public class Signup_user {
    private static String city;
    private static int age;
    private static  String name;
    private static String education;
    private static String cast;
    private static String bio;
    private static ArrayList<Hobbies> hobby = new ArrayList<Hobbies>();
    private static Religion religion;
    private static Gender gender;
    private static int userId;
    private static String username;
    private static String email;
    private static String password;

    public static String getConfirmpassword() {
        return confirmpassword;
    }

    public static void setConfirmpassword(String confirmpassword) {
        Signup_user.confirmpassword = confirmpassword;
    }

    private static String confirmpassword;

    public static int getUserId() {
        return userId;
    }

    public static void setUserId(int userId) {
        Signup_user.userId = userId;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        Signup_user.username = username;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        Signup_user.email = email;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        Signup_user.password = password;
    }

    public static String getCity() {
        return city;
    }

    public static void setCity(String city) {
        Signup_user.city = city;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Signup_user.age = age;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Signup_user.name = name;
    }

    public static String getEducation() {
        return education;
    }

    public static void setEducation(String education) {
        Signup_user.education = education;
    }

    public static String getCast() {
        return cast;
    }

    public static void setCast(String cast) {
        Signup_user.cast = cast;
    }

    public static String getBio() {
        return bio;
    }

    public static void setBio(String bio) {
        Signup_user.bio = bio;
    }

    public static ArrayList<Hobbies> getHobby() {
        return hobby;
    }

    public static void setHobby(ArrayList<Hobbies> hobby) {
        Signup_user.hobby = hobby;
    }

    public static Religion getReligion() {
        return religion;
    }

    public static void setReligion(Religion religion) {
        Signup_user.religion = religion;
    }

    public static Gender getGender() {
        return gender;
    }

    public static void setGender(Gender gender) {
        Signup_user.gender = gender;
    }


}

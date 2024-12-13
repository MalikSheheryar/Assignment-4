package com.example.connect;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Profile {
    private String city;
    private int age;
    private String name;
    private String education;
    private String cast;
    private String bio;
    private ArrayList<Hobbies> hobby = new ArrayList<Hobbies>();
    private Religion religion;
    private Gender gender;
    Scanner input = new Scanner(System.in);
    User user;

    public Profile()//for user profile
    {
        user = new User();
        setProfile();

    }

    public Profile(String username, String email, String password,String city, int age, String name, String education, String cast, String bio, ArrayList<Hobbies> hobby, Religion religion, Gender gender) {
        user=new User(username,email,password);
        setAge(age);
        setCity(city);
        setBio(bio);
        setCast(cast);
        setEducation(education);
        setName(name);
        this.hobby.addAll(hobby);
        setReligion(religion);
        setGender(gender);
    }

    //for hard coded profiles
    public ArrayList<Hobbies> getHobby() {
        return hobby;
    }

    private Set<Hobbies> selectedHobbies = new HashSet<>();



    public void setHobby() {

        System.out.println("Select 3 hobbies: ");
        displayhobbies();
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter hobby " + (i + 1) + ": ");
            String h = input.nextLine();
            try {
                Hobbies hobby = Hobbies.valueOf(h.toUpperCase());
                if (!selectedHobbies.contains(hobby)) {
                    selectedHobbies.add(hobby);
                } else {
                    System.out.println("This hobby is already selected. Please choose another one.");
                    i--; // Decrement i to re-prompt for the same index
                }
            }catch(IllegalArgumentException exp){
                System.out.println(exp.getMessage());
            }


        }
    }

    public Religion getReligion() {
        return religion;
    }

    public void setReligion(Religion religions)
    {

        this.religion = religions;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender)
    {

        this.gender = gender;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeInvalidException
    {
        if (age < 18)
        {
            throw new AgeInvalidException();

        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education.toUpperCase();
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast.toUpperCase();
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    @Override
    public String toString() {
        return "profile{" +
                "city='" + city + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", education='" + education + '\'' +
                ", cast='" + cast + '\'' +
                ", bio='" + bio + '\'' +
                '}';
    }
    public void setProfile() {
        System.out.println("Enter Name : ");
        setName(input.nextLine());
        System.out.println("Enter city : ");
        setCity(input.nextLine());
        while (true) {
            try {
                System.out.println("Enter Age (required age 18): ");
                int age = input.nextInt();
                setAge(age);
                break;
            } catch (AgeInvalidException | InputMismatchException exp) {
                System.out.println(exp.getMessage());
                input.nextLine(); // Clear the input buffer
            }
        }
        System.out.println("Enter Cast : ");
        input.nextLine();
        setCast(input.nextLine());
        System.out.println("Enter Education : ");
        setEducation(input.nextLine());
        System.out.println("Enter Bio : ");
        setBio(input.nextLine());
        while(true) {
            try {
                System.out.println("Select one of the following gender : ");
                displayGender();
                System.out.println(" Enter your selection : ");
                String g = input.nextLine();
                setGender(Gender.valueOf(g.toUpperCase()));
                break;
            } catch (IllegalArgumentException exp) {
                System.out.println(exp.getMessage());
            }
        }
        while(true) {
            try {
                System.out.println("Select one of the Religions : ");
                displayReligion();
                System.out.println("Enter your selection  : ");
                String r = input.nextLine();
                setReligion(Religion.valueOf(r.toUpperCase()));
                break;
            } catch (IllegalArgumentException exp) {
                System.out.println(exp.getMessage());
            }
        }
        while(true) {
            try {
                setHobby();
                break;
            } catch (IllegalArgumentException exp) {
                System.out.println(exp.getMessage());
            }
        }
    }
    public void show_short_profile()
    {
        System.out.println("Name : "+getName());

    }

    //display methods for enums
    public void displayhobbies()
    {
        for (Hobbies h : Hobbies.values()) {
            System.out.println(h);
        }
    }

    public void displayReligion(){
        for(Religion r : Religion.values()){
            System.out.println(r);
        }
    }

    public void displayGender(){
        for(Gender g : Gender.values()){
            System.out.println(g);
        }
    }

    //profile display methods

    public void displayLessProfile(){
        System.out.println("Id : "+user.getUserId());
        System.out.println("Name : "+getName());
        System.out.println("Age : "+getAge());
        System.out.println("Gender : "+getGender());
        System.out.println("Bio : "+getBio());
    }

    public String displayCompleteProfile(){
        displayLessProfile();
        return "Id : "+user.getUserId()+"Cast : "+getCast()+ "\n City : "+getCity()+"\n Education : "+getEducation()+"\nReligion : "+getReligion()+"\nHobby : "+getHobby();
    }





}
//add display method for religion and gender done
//constructor
//show short and complete profile with proper getter functions done
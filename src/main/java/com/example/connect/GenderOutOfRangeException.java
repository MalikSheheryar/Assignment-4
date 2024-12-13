package com.example.connect;

public class GenderOutOfRangeException extends RuntimeException{

    public String getMessage(){
        return"Gender invalid , Try Again : ";
    }
}


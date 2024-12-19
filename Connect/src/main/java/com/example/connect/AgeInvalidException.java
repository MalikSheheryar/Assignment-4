package com.example.connect;

public class AgeInvalidException extends RuntimeException {

    public String getMessage(){
        return "You are Under age ";
    }

}

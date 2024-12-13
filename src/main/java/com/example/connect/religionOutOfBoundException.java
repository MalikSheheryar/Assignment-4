package com.example.connect;

public class religionOutOfBoundException extends RuntimeException {

    public String getMessage(){
        return "Religion invalid , Try Again : ";
    }
}


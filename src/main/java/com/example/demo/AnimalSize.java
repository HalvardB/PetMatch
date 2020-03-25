package com.example.demo;

public enum AnimalSize {
    SMALL("Liten"),
    MEDIUM("Mellomstor"),
    LARGE("Stor");

    private final String displayValuet;

    private AnimalSize(String displayValue) {
        this.displayValuet = displayValue;
    }

    public String getDisplayValuet() {
        return displayValuet;
    }



}

package com.example.demo;

public enum Municipality {
    AGDER("Agder"),
    INNLANDET("Innlandet"),
    MORE_OG_ROMSDAL("Møre og Romsdal"),
    NORDLAND("Nordland"),
    OSLO("Oslo"),
    ROGALAND("Rogaland"),
    VESTFOLD_OG_TELEMARK("Vestfold og Telemark"),
    TROMS_OG_FINNMARK("Troms og Finnmark"),
    TRONDELAG("Trøndelag"),
    VESTLAND("Vestland"),
    VIKEN("Viken");

    private final String displayValue;

    private Municipality(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return displayValue;
    }
}
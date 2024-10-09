package com.democorp.dummy.data.dto.enums;

public enum DumbTitle {

    STUPIDITY_EMPEROR("STUPIDITY_EMPEROR"),
    KING_OF_THE_STUPIDS("KING_OF_THE_STUPIDS"),
    IDIOT_TOWN_MAYOR("IDIOT_TOWN_MAYOR"),
    PLAIN_DUMB("PLAIN_DUMB");


    private String value;

    DumbTitle(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

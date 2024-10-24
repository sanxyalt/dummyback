package com.democorp.dummy.data.entities.enums;

public enum DumbShitStatus {

    HOLY_SHIT("HOLY_SHIT"),
    MAD_SHIT("MAD_SHIT"),
    REGULAR_SHIT("REGULAR_SHIT"),
    SHITFACED("SHITFACED"),
    BULLSHIT("BULLSHIT");


    private final String value;

    DumbShitStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

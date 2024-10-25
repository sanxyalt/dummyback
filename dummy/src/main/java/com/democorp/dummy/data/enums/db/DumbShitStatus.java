package com.democorp.dummy.data.enums.db;

import com.democorp.dummy.data.enums.EnumInterface;

public enum DumbShitStatus implements EnumInterface {

    HOLY_SHIT("HOLY_SHIT_DESCRIPTION"),
    MAD_SHIT("MAD_SHIT_DESCRIPTION"),
    REGULAR_SHIT("REGULAR_SHIT_DESCRIPTION"),
    SHITFACED("SHITFACED_DESCRIPTION"),
    BULLSHIT("BULLSHIT_DESCRIPTION");


    private final String description;

    DumbShitStatus(String description) {
        this.description = description;
    }

    @Override
    public String getDescription() {
        return description;
    }
}

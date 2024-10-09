package com.democorp.dummy.utils;

import com.democorp.dummy.data.dto.enums.DumbTitle;

public class DumbUtils {

    public static String determineTitleFromRank(Integer dumbRank) {
        if (dumbRank == null) {
            return DumbTitle.PLAIN_DUMB.getValue();
        }
        return switch (dumbRank) {
            case 1 -> DumbTitle.STUPIDITY_EMPEROR.getValue();
            case 2 -> DumbTitle.KING_OF_THE_STUPIDS.getValue();
            case 3 -> DumbTitle.IDIOT_TOWN_MAYOR.getValue();
            default -> DumbTitle.PLAIN_DUMB.getValue();
        };
    }

}

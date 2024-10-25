package com.democorp.dummy.data.enums;

import com.democorp.dummy.data.enums.api.EnumDto;

public interface EnumInterface {

    default EnumDto toDto(){
        return new EnumDto(((Enum<?>) this).name(), getDescription());
    }

    String getDescription();
}

package com.democorp.dummy.services;

import com.democorp.dummy.data.enums.api.EnumDto;

import java.util.Map;
import java.util.Set;

public interface EnumService {

    Map<String, Set<EnumDto>> getAllEnumValues();

}

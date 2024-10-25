package com.democorp.dummy.data.dto;

import com.democorp.dummy.data.enums.api.EnumDto;

public record ShitResponseDto(Integer id, String name, EnumDto status, Integer dumbRank, String dumbTitle) {
}

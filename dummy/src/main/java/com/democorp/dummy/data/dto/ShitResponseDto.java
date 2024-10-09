package com.democorp.dummy.data.dto;

import com.democorp.dummy.data.entities.enums.DumbShitStatus;

public record ShitResponseDto(Integer id, String name, DumbShitStatus status, Integer dumbRank, String dumbTitle) {
}

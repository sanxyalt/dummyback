package com.democorp.dummy.data.dto;

import com.democorp.dummy.data.entities.enums.DumbShitStatus;

public record ShitRequestDto(String name, DumbShitStatus status, Integer dumbRank) {
}

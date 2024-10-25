package com.democorp.dummy.data.dto;

import com.democorp.dummy.data.enums.db.DumbShitStatus;

public record ShitRequestDto(String name, DumbShitStatus status, Integer dumbRank) {
}

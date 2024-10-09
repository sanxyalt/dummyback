package com.democorp.dummy.services;

import com.democorp.dummy.data.dto.ShitRequestDto;
import com.democorp.dummy.data.dto.ShitResponseDto;

public interface DumbService {

    ShitResponseDto createUpdateShit(Integer id, ShitRequestDto shitRequest);

    ShitResponseDto fetchShit(Integer id);
}

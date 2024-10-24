package com.democorp.dummy.services;

import com.democorp.dummy.data.dto.ShitRequestDto;
import com.democorp.dummy.data.dto.ShitResponseDto;
import com.democorp.dummy.data.dto.ShitSearchResponseDto;
import org.springframework.data.domain.Page;

import java.util.List;

public interface DumbService {

    ShitResponseDto createUpdateShit(Integer id, ShitRequestDto shitRequest);

    ShitResponseDto fetchShit(Integer id);

    Page<ShitSearchResponseDto> search(int page, int size);
}

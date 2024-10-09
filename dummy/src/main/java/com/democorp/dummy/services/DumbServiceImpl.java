package com.democorp.dummy.services;

import com.democorp.dummy.data.dto.ShitRequestDto;
import com.democorp.dummy.data.dto.ShitResponseDto;
import com.democorp.dummy.data.entities.DumbShit;
import com.democorp.dummy.data.repositories.DumbShitRepository;
import com.democorp.dummy.mapping.DumbMapper;
import org.springframework.stereotype.Service;

@Service
public class DumbServiceImpl implements DumbService {

    private final DumbShitRepository dumbShitRepository;
    private final DumbMapper dumbMapper;

    public DumbServiceImpl(DumbShitRepository dumbShitRepository,
                           DumbMapper dumbMapper) {
        this.dumbShitRepository = dumbShitRepository;
        this.dumbMapper = dumbMapper;
    }

    @Override
    public ShitResponseDto createUpdateShit(Integer id, ShitRequestDto shitRequest) {
        DumbShit dumbShit = dumbMapper.shitRequestToDumbShitEntity(id, shitRequest);
        DumbShit savedDumbShit = dumbShitRepository.save(dumbShit);
        return dumbMapper.dumbShitEntityToShitResponse(savedDumbShit);
    }

    @Override
    public ShitResponseDto fetchShit(Integer id) {
        DumbShit dumbShit = dumbShitRepository.findById(id).orElseThrow(() -> new RuntimeException("NOT FOUND"));
        return dumbMapper.dumbShitEntityToShitResponse(dumbShit);
    }
}

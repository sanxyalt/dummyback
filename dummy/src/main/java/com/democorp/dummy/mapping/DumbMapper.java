package com.democorp.dummy.mapping;

import com.democorp.dummy.data.dto.ShitRequestDto;
import com.democorp.dummy.data.dto.ShitResponseDto;
import com.democorp.dummy.data.entities.DumbShit;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface DumbMapper {

    @Mapping(source = "dumbShit.shitName", target = "name")
    @Mapping(source = "dumbShit.shitStatus", target = "status")
    ShitResponseDto dumbShitEntityToShitResponse(DumbShit dumbShit);

    @Mapping(source = "shitRequest.name", target = "shitName")
    @Mapping(source = "shitRequest.status", target = "shitStatus")
    @Mapping(source = "id", target = "id")
    DumbShit shitRequestToDumbShitEntity(Integer id, ShitRequestDto shitRequest);

}

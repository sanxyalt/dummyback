package com.democorp.dummy.mapping;

import com.democorp.dummy.data.dto.ShitRequestDto;
import com.democorp.dummy.data.dto.ShitResponseDto;
import com.democorp.dummy.data.dto.ShitSearchResponseDto;
import com.democorp.dummy.data.entities.DumbShit;
import com.democorp.dummy.data.entities.enums.DumbShitStatus;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface DumbMapper {

    @Mapping(target = "name", source = "dumbShit.shitName")
    @Mapping(target = "status", source = "dumbShit.shitStatus")
    ShitResponseDto dumbShitEntityToShitResponse(DumbShit dumbShit);

    @Mapping(target = "shitName", source = "shitRequest.name")
    @Mapping(target = "shitStatus", source = "shitRequest.status")
    @Mapping(target = "id", source = "id")
    DumbShit shitRequestToDumbShitEntity(Integer id, ShitRequestDto shitRequest);


    @Mapping(target = "name", source = "dumbShit.shitName")
    @Mapping(target = "dumbColor", source = "dumbShit.shitStatus", qualifiedByName = "mapDumbShitStatusToColor")
    ShitSearchResponseDto dumbShitEntityToShitSearchResponse(DumbShit dumbShit);

    @Named("mapDumbShitStatusToColor")
    default String mapDumbShitStatusToColor(DumbShitStatus status) {
        return switch (status) {
            case REGULAR_SHIT, BULLSHIT, SHITFACED -> "BROWN";
            case HOLY_SHIT, MAD_SHIT -> "YELLOW";
        };
    }

}

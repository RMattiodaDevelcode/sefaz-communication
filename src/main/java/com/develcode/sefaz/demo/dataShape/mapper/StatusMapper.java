package com.develcode.sefaz.demo.dataShape.mapper;

import com.develcode.sefaz.demo.dataShape.domain.Status;
import com.develcode.sefaz.demo.dataShape.dto.StatusDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface StatusMapper {
    StatusDTO toDto(Status status);
}

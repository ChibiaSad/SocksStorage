package com.example.socksstorage.mapper;

import com.example.socksstorage.dto.UpdateQuantityDTO;
import com.example.socksstorage.entity.Socks;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SocksMapper {
    SocksMapper INSTANCE = Mappers.getMapper(SocksMapper.class);

    @Mapping(source = "color", target = "color")
    @Mapping(source = "cottonPart", target = "cottonPart")
    @Mapping(source = "quantity", target = "quantity")
    Socks updateToSocks(UpdateQuantityDTO update);
}

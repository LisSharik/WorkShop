package com.riwi.book_store.infraestructure.helpers.mappers;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.springframework.beans.factory.annotation.Autowired;

import com.riwi.book_store.api.dto.request.UserRequest;
import com.riwi.book_store.api.dto.response.UserBasicResponse;
import com.riwi.book_store.api.dto.response.UserResponse;
import com.riwi.book_store.domain.entities.UserEntity;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {

    @Autowired
    
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "loans", ignore = true)
    @Mapping(target = "reservations", ignore = true)
    UserEntity toUserEntity(UserRequest userRequest);

    @InheritInverseConfiguration
    UserResponse toUserResponse(UserEntity userEntity);

    @InheritInverseConfiguration
    UserBasicResponse toUserBasicResponse(UserEntity userEntity);

    List<UserBasicResponse> userListToResponseList(List<UserEntity> userEntities);
}

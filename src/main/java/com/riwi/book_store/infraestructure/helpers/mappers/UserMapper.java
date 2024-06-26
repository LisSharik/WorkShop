package com.riwi.book_store.infraestructure.helpers.mappers;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.MappingTarget;

import com.riwi.book_store.api.dto.request.UserCreateRequest;
import com.riwi.book_store.api.dto.request.UserUpdateRequest;
import com.riwi.book_store.api.dto.response.UserBasicResponse;
import com.riwi.book_store.api.dto.response.UserResponse;
import com.riwi.book_store.domain.entities.UserEntity;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {

    
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "loans", ignore = true)
    @Mapping(target = "reservations", ignore = true)
    @Mapping(target = "role", ignore = true)
    UserEntity toUserCreateEntity(UserCreateRequest request);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "loans", ignore = true)
    @Mapping(target = "reservations", ignore = true)
    UserEntity toUserUpdateEntity(UserUpdateRequest request, @MappingTarget UserEntity user);


    @InheritInverseConfiguration
    UserResponse toUserResponse(UserEntity userEntity);

    @InheritInverseConfiguration
    UserBasicResponse toUserBasicResponse(UserEntity userEntity);

    List<UserBasicResponse> userListToResponseList(List<UserEntity> userEntities);
}

package com.riwi.workshop.infraestructure.abstract_services;


import org.springframework.data.domain.Page;

import com.riwi.workshop.api.dto.request.UserCreateRequest;
import com.riwi.workshop.api.dto.request.UserUpdateRequest;
import com.riwi.workshop.api.dto.response.BookBasicResponse;
import com.riwi.workshop.api.dto.response.UserBasicResponse;
import com.riwi.workshop.api.dto.response.UserResponse;

public interface IUserService extends CrudService<UserCreateRequest, UserUpdateRequest, UserResponse, UserBasicResponse, Long> {
    public Page<BookBasicResponse> getAll(int page, int size);
}

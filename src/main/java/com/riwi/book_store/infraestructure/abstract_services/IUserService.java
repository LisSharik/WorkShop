package com.riwi.book_store.infraestructure.abstract_services;


import org.springframework.data.domain.Page;

import com.riwi.book_store.api.dto.request.UserCreateRequest;
import com.riwi.book_store.api.dto.request.UserUpdateRequest;
import com.riwi.book_store.api.dto.response.BookBasicResponse;
import com.riwi.book_store.api.dto.response.UserBasicResponse;
import com.riwi.book_store.api.dto.response.UserResponse;

public interface IUserService extends CrudService<UserCreateRequest, UserUpdateRequest, UserResponse, UserBasicResponse, Long> {
    public Page<BookBasicResponse> getAll(int page, int size);
}

package com.riwi.book_store.infraestructure.abstract_services;


import com.riwi.book_store.api.dto.request.UserRequest;
import com.riwi.book_store.api.dto.response.UserBasicResponse;

public interface IUserService extends CrudService<UserRequest, UserBasicResponse, Long> {
    
}

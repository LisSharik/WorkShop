package com.riwi.book_store.infraestructure.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.riwi.book_store.api.dto.request.UserRequest;
import com.riwi.book_store.api.dto.response.BookBasicResponse;
import com.riwi.book_store.api.dto.response.UserBasicResponse;
import com.riwi.book_store.api.dto.response.UserResponse;
import com.riwi.book_store.domain.entities.UserEntity;
import com.riwi.book_store.domain.repositories.UserRepository;
import com.riwi.book_store.infraestructure.abstract_services.IUserService;
import com.riwi.book_store.infraestructure.helpers.mappers.UserMapper;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService implements IUserService{

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserMapper userMapper;


    @Override
    public UserBasicResponse create(UserRequest request) {
        UserEntity userEntity = this.userMapper.toUserEntity(request);

        return this.userMapper.toUserResponse(this.userRepository.save(userEntity));
    }

    @Override
    public UserResponse get(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public UserBasicResponse update(UserRequest request, Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public Page<BookBasicResponse> getAll(int page, int size) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }


    
}

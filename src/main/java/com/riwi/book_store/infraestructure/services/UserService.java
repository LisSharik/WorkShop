package com.riwi.book_store.infraestructure.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.riwi.book_store.api.dto.request.UserCreateRequest;
import com.riwi.book_store.api.dto.request.UserUpdateRequest;
import com.riwi.book_store.api.dto.response.BookBasicResponse;
import com.riwi.book_store.api.dto.response.UserBasicResponse;
import com.riwi.book_store.api.dto.response.UserResponse;
import com.riwi.book_store.domain.entities.UserEntity;
import com.riwi.book_store.domain.repositories.UserRepository;
import com.riwi.book_store.infraestructure.abstract_services.IUserService;
import com.riwi.book_store.infraestructure.helpers.mappers.UserMapper;
import com.riwi.book_store.utils.enums.Role;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService implements IUserService{

    @Autowired
    private final UserRepository userRepository;

    @Autowired
    private final UserMapper userMapper;

    @Override
    public UserBasicResponse create(UserCreateRequest request) {
        UserEntity userEntity = this.userMapper.toUserCreateEntity(request);
        userEntity.setRole(Role.CUSTOMER);
        return this.userMapper.toUserBasicResponse(this.userRepository.save(userEntity));
    }

    @Override
    public UserResponse get(Long id) {
        UserEntity userEntity = this.find(id);
        return this.userMapper.toUserResponse(userEntity);
    }

    @Override
    public UserResponse update(UserUpdateRequest request, Long id) {
        UserEntity userEntity = this.find(id);
        userEntity = this.userMapper.toUserUpdateEntity(request, userEntity);
        return this.userMapper.toUserResponse(this.userRepository.save(userEntity));

    }

    @Override
    public void delete(Long id) {
        UserEntity userEntity = this.find(id);
        this.userRepository.delete(userEntity);

    }

    @Override
    public Page<BookBasicResponse> getAll(int page, int size) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    private UserEntity find(Long id){
        return this.userRepository.findById(id).orElseThrow();
    }





    
}

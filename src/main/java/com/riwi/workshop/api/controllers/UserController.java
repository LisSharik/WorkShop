package com.riwi.workshop.api.controllers;

import com.riwi.workshop.api.controllers.BasicControllers.PutController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.riwi.workshop.api.controllers.BasicControllers.PostController;
import com.riwi.workshop.api.dto.request.UserCreateRequest;
import com.riwi.workshop.api.dto.request.UserUpdateRequest;
import com.riwi.workshop.api.dto.response.UserBasicResponse;
import com.riwi.workshop.api.dto.response.UserResponse;
import com.riwi.workshop.infraestructure.abstract_services.IUserService;
import org.springframework.validation.annotation.Validated;


import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "/user")
@AllArgsConstructor
public class UserController implements PostController<UserBasicResponse, UserCreateRequest>, PutController<UserResponse, UserUpdateRequest>
        {

    @Autowired
    private final IUserService userService;

    @Override
    public ResponseEntity<UserBasicResponse> insert(UserCreateRequest request) {
        return ResponseEntity.ok(this.userService.create(request));
    }

        @Override
        public ResponseEntity<UserResponse> update(UserUpdateRequest request, Long id) {
        return ResponseEntity.ok(this.userService.update(request, id));
    }

}

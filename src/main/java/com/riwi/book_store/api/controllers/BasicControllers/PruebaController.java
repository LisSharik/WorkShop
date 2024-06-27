package com.riwi.book_store.api.controllers.BasicControllers;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.riwi.book_store.api.dto.request.UserUpdateRequest;
import com.riwi.book_store.api.dto.response.UserResponse;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "/prueba")
@AllArgsConstructor
public class PruebaController {
    
    @PutMapping("/{id}")
    public ResponseEntity<UserResponse> update(@PathVariable Long id, @Validated @RequestBody UserUpdateRequest request) {
        System.out.println("================ TEST ============="+id);
        return null;
    }

    @PutMapping("/segundo/{id}")
    public ResponseEntity<UserResponse> updatEntity(
            @PathVariable Long id,
            @Validated @RequestBody UserUpdateRequest request) {
        System.out.println("================ TEST ============="+id);

        return null;
    }

}

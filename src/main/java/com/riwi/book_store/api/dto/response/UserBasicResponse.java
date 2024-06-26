package com.riwi.book_store.api.dto.response;

import com.riwi.book_store.utils.enums.Role;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class UserBasicResponse {
    private Long id;
    private String username;
    // private String password;
    private String email;
    private Role role;
    
}

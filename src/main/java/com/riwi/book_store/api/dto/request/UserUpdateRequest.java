package com.riwi.book_store.api.dto.request;

import com.riwi.book_store.utils.enums.Role;


import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class UserUpdateRequest extends UserCreateRequest {
    @NotNull(message = "The rol is requaried")
    private Role role;
    
}

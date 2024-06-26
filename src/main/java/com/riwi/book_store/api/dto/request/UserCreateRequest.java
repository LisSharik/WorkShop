package com.riwi.book_store.api.dto.request;




import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class UserCreateRequest {
    @Size(min = 1, max = 50, message = "The username has to be 1 or up to 50 characters long")
    @NotBlank(message = "The username is requaried")
    private String username;

    @Size(min = 1, max = 100, message = "The password has to be 1 or up to 100 characters long")
    @NotBlank(message = "The password is requaried")
    private String password;
    
    @Size(min = 1, max = 100, message = "The email has to be 1 or up to 100 characters long")
    @NotBlank(message = "The email is requaried")
    @Email(message = "email is invalid")
    private String email;

    @NotBlank(message = "The full name is requaried")
    @Size(min = 1, max = 100, message = "The full name has to be 1 or up to 100 characters long")
    private String fullName;

   

}

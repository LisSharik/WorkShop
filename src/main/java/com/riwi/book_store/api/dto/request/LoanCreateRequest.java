package com.riwi.book_store.api.dto.request;




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
public class LoanCreateRequest extends LoanBasicRequest {

    @NotNull(message = "The user id is requaried")
    private Long userId; 

    @NotNull(message = "The book id is requaried")
    private Long bookId;


}
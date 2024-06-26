package com.riwi.book_store.api.dto.request;

import java.time.LocalDate;

import jakarta.validation.constraints.FutureOrPresent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class LoanBasicRequest {

    @FutureOrPresent(message = "The date must be current day or a later day")
    private LocalDate returnDate;

    @FutureOrPresent(message = "The date must be current day or a later day")
    private LocalDate loanDate;

    // @NotNull(message = "The status is requaried")
    // private boolean status;

    // @NotNull(message = "The user id is requaried")
    // private Long userId;

    // @NotNull(message = "The book id is requaried")
    // private Long bookId;

}

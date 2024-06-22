package com.riwi.book_store.api.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class ReservationRequest {

    @NotNull(message = "The status is requaried")
    private boolean status;

    @NotNull(message = "The user id is requaried")
    private Long userId; 

    @NotNull(message = "The book id is requaried")
    private Long bookId;
}

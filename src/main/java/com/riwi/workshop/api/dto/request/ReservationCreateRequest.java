package com.riwi.workshop.api.dto.request;

import java.time.LocalDate;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class ReservationCreateRequest {

  
    @FutureOrPresent(message = "The date must be current day or a later day")
    private LocalDate reservationDate;

    @NotNull(message = "The user id is requaried")
    private Long userId; 

    @NotNull(message = "The book id is requaried")
    private Long bookId;
}

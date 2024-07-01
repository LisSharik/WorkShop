package com.riwi.workshop.api.dto.request;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookRequest {
    @Size(min = 1, max = 100, message = "The title has to be 1 or up to 100 characters long")
    @NotBlank(message = "The title is required")
    private String title;

    @Size(min = 1, max = 100, message = "The author has to be 1 or up to 100 characters long")
    @NotBlank(message = "The author is required")
    private String author;

    @Min(value = 1, message = "The minimum publication year is 1")
    @Max(value = 9999, message = "The maximum publication year is 9999")
    @NotNull(message = "The author is required")
    private Integer publicationYear;

    @Size(min = 1, max = 50, message = "The genere has to be 1 or up to 100 characters long")
    @NotBlank(message = "The genere is required")
    private String genre;

    @Size(min = 1, max = 11, message = "The isbn has to be 1 or up to 100 characters long")
    @NotBlank(message = "The isbn is required")
    private String isbn;

}

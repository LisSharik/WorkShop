package com.riwi.workshop.infraestructure.abstract_services;

import com.riwi.workshop.api.dto.request.BookRequest;
import com.riwi.workshop.api.dto.response.BookBasicResponse;
import com.riwi.workshop.api.dto.response.BookResponse;

public interface IBookService extends CrudService<BookRequest, BookRequest, BookResponse, BookBasicResponse, Long> {
    
}

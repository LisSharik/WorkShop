package com.riwi.book_store.infraestructure.abstract_services;

import com.riwi.book_store.api.dto.request.BookRequest;
import com.riwi.book_store.api.dto.response.BookBasicResponse;
import com.riwi.book_store.api.dto.response.BookResponse;

public interface IBookService extends CrudService<BookRequest, BookRequest, BookResponse, BookBasicResponse, Long> {
    
}

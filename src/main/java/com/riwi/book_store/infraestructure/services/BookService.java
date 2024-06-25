package com.riwi.book_store.infraestructure.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.riwi.book_store.api.dto.request.BookRequest;
import com.riwi.book_store.api.dto.response.BookBasicResponse;
import com.riwi.book_store.api.dto.response.BookResponse;
import com.riwi.book_store.domain.entities.Book;
import com.riwi.book_store.domain.repositories.BookRepository;
import com.riwi.book_store.infraestructure.abstract_services.IBookService;
import com.riwi.book_store.infraestructure.helpers.mappers.BookMapper;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BookService implements IBookService {
    
    @Autowired
    private final BookRepository bookRepository;

    @Autowired
    private final BookMapper bookMapper;


    @Override
    public BookBasicResponse create(BookRequest request) {
        Book book = this.bookMapper.toBookEntity(request);
        return this.bookMapper.toBookBasicResponse(this.bookRepository.save(book));

    }

    @Override
    public BookResponse get(Long id) {
        Book book = this.bookRepository.findById(id).orElseThrow();
        return this.bookMapper.toBookResponse(book);
    }

    @Override
    public BookBasicResponse update(BookRequest request, Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Long id) {
        Book book = this.bookRepository.findById(id).orElseThrow();
        this.bookRepository.delete(book);
    }
    
}

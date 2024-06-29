package com.riwi.workshop.infraestructure.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.riwi.workshop.api.dto.request.BookRequest;
import com.riwi.workshop.api.dto.response.BookBasicResponse;
import com.riwi.workshop.api.dto.response.BookResponse;
import com.riwi.workshop.domain.entities.Book;
import com.riwi.workshop.domain.repositories.BookRepository;
import com.riwi.workshop.infraestructure.abstract_services.IBookService;
import com.riwi.workshop.infraestructure.helpers.mappers.BookMapper;

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
        // Book book = this.bookMapper.toBookEntity(request);
        // return this.bookMapper.toBookBasicResponse(this.bookRepository.save(book));
         // TODO Auto-generated method stub
         throw new UnsupportedOperationException("Unimplemented method 'update'");

    }

    @Override
    public BookResponse get(Long id) {
        // Book book = this.bookRepository.findById(id).orElseThrow();
        // return this.bookMapper.toBookResponse(book);
         // TODO Auto-generated method stub
         throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public BookResponse update(BookRequest request, Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Long id) {
        Book book = this.bookRepository.findById(id).orElseThrow();
        this.bookRepository.delete(book);
    }
    
}

package com.riwi.book_store.infraestructure.helpers.mappers;

import java.util.List;

import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import com.riwi.book_store.api.dto.request.BookRequest;
import com.riwi.book_store.api.dto.response.BookBasicResponse;
import com.riwi.book_store.api.dto.response.BookResponse;
import com.riwi.book_store.domain.entities.Book;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface BookMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "loans", ignore =  true)
    @Mapping(target = "reservations", ignore =  true)
    Book toBookEntity(BookRequest request);


    @InheritConfiguration
    BookBasicResponse toBookBasicResponse(Book book);

    @InheritConfiguration
    BookResponse toBookResponse(Book book);

    List<BookBasicResponse> bookListToResponseList(List<Book> books);





}

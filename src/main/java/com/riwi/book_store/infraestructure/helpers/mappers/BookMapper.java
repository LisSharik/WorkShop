package com.riwi.book_store.infraestructure.helpers.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import com.riwi.book_store.domain.entities.Book;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface BookMapper {
    
    Book toBookEntity(Book bookEntity);


}

package com.riwi.book_store.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.riwi.book_store.domain.entities.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    
}

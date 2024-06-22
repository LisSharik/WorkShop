package com.riwi.book_store.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.riwi.book_store.domain.entities.Loan;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long>  {
    
}
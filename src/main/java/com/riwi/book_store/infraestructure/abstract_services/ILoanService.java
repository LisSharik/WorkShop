package com.riwi.book_store.infraestructure.abstract_services;

import com.riwi.book_store.api.dto.request.LoanRequest;
import com.riwi.book_store.api.dto.response.LoanBasicResponse;
import com.riwi.book_store.api.dto.response.LoanResponse;

public interface ILoanService extends CrudService<LoanRequest, LoanResponse, LoanBasicResponse, Long> {
    
}

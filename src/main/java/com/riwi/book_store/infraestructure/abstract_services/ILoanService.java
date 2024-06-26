package com.riwi.book_store.infraestructure.abstract_services;

import com.riwi.book_store.api.dto.request.LoanCreateRequest;
import com.riwi.book_store.api.dto.request.LoanUpdateRequest;
import com.riwi.book_store.api.dto.response.LoanBasicResponse;
import com.riwi.book_store.api.dto.response.LoanResponse;

public interface ILoanService extends CrudService<LoanCreateRequest, LoanUpdateRequest, LoanResponse, LoanBasicResponse, Long> {
    
}

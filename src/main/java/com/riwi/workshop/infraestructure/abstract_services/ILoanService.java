package com.riwi.workshop.infraestructure.abstract_services;

import com.riwi.workshop.api.dto.request.LoanCreateRequest;
import com.riwi.workshop.api.dto.request.LoanUpdateRequest;
import com.riwi.workshop.api.dto.response.LoanBasicResponse;
import com.riwi.workshop.api.dto.response.LoanResponse;

public interface ILoanService extends CrudService<LoanCreateRequest, LoanUpdateRequest, LoanResponse, LoanBasicResponse, Long> {
    
}

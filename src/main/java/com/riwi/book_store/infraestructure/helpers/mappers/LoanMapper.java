package com.riwi.book_store.infraestructure.helpers.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import com.riwi.book_store.api.dto.request.LoanCreateRequest;
import com.riwi.book_store.domain.entities.Loan;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface LoanMapper {

    @Mapping(target = "id", ignore = true)
    Loan toLoanEntity(LoanCreateRequest loanRequest);

}

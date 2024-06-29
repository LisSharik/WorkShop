package com.riwi.workshop.infraestructure.helpers.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import com.riwi.workshop.api.dto.request.LoanCreateRequest;
import com.riwi.workshop.domain.entities.Loan;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface LoanMapper {

    @Mapping(target = "id", ignore = true)
    Loan toLoanEntity(LoanCreateRequest loanRequest);

}

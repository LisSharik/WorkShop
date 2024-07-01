package com.riwi.workshop.infraestructure.abstract_services.basic_abstract_services;

// import org.springframework.data.domain.Page;

/*
 * @RCQ -> Create Request
 * @RUQ -> Update request
 * @RS -> Response
 * @BRS -> Basic Response
 * @ID -> Type Id
 */
public interface BasicCrudService<RCQ, RUQ, RS, BRS, ID> extends 
    CreateService<RCQ, BRS>, 
    GetService<RS, ID>, 
    UpdateService<RS, RUQ, ID>, 
    DeleteService<ID> {
}
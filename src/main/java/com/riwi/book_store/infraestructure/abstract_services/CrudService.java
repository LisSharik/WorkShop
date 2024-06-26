package com.riwi.book_store.infraestructure.abstract_services;

// import org.springframework.data.domain.Page;

/*
 * @RCQ -> Create Request
 * @RUQ -> Update request
 * @RS -> Response
 * @BRS -> Basic Response
 * @ID -> Type Id
 */
public interface CrudService<RCQ, RUQ, RS, BRS, ID> {
    public BRS create(RCQ request);

    public RS get(ID id);

    public BRS update(RUQ request, ID id);

    public void delete(ID id);

    


    // public Page<RS> getAll(int page, int size);
}

package com.riwi.book_store.infraestructure.abstract_services;

// import org.springframework.data.domain.Page;

/*
 * @RQ -> Request
 * @RS -> Response
 * @BRS -> Basic Response
 * @ID -> Type Id
 */
public interface CrudService<RQ, RS, BRS, ID> {
    public BRS create(RQ request);

    public RS get(ID id);

    public BRS update(RQ request, ID id);

    public void delete(ID id);

    // public Page<RS> getAll(int page, int size);
}

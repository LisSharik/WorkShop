package com.riwi.book_store.infraestructure.abstract_services;

import com.riwi.book_store.api.dto.request.ReservationCreateRequest;
import com.riwi.book_store.api.dto.response.ReservationBasicResponse;
import com.riwi.book_store.api.dto.response.ReservationResponse;

public interface IReservationService extends CrudService<ReservationCreateRequest, ReservationCreateRequest, ReservationResponse, ReservationBasicResponse, Long> {
    
}

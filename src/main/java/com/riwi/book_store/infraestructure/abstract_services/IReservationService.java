package com.riwi.book_store.infraestructure.abstract_services;

import com.riwi.book_store.api.dto.request.ReservationRequest;
import com.riwi.book_store.api.dto.response.ReservationBasicResponse;
import com.riwi.book_store.api.dto.response.ReservationResponse;

public interface IReservationService extends CrudService<ReservationRequest, ReservationResponse, ReservationBasicResponse, Long> {
    
}

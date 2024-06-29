package com.riwi.workshop.infraestructure.abstract_services;

import com.riwi.workshop.api.dto.request.ReservationCreateRequest;
import com.riwi.workshop.api.dto.response.ReservationBasicResponse;
import com.riwi.workshop.api.dto.response.ReservationResponse;

public interface IReservationService extends CrudService<ReservationCreateRequest, ReservationCreateRequest, ReservationResponse, ReservationBasicResponse, Long> {
    
}

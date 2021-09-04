package com.WS.AppointmentBookingService.Repository;

import java.util.List;

import com.WS.AppointmentBookingService.Model.AppointmentModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<AppointmentModel, Long> {
    AppointmentModel findByReferenceNumber(long referenceNumber);
    AppointmentModel findByIdNo(String idNo);
}

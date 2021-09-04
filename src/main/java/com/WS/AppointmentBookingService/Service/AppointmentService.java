package com.WS.AppointmentBookingService.Service;

import com.WS.AppointmentBookingService.Model.AppointmentModel;
import com.WS.AppointmentBookingService.Repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class AppointmentService {


    @Autowired
    private final AppointmentRepository appointmentRepository;

    public AppointmentService(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    public AppointmentModel bookAppointment(AppointmentModel appointmentModel){
        AppointmentModel newAppointmentModel = appointmentRepository.save(appointmentModel);
        return newAppointmentModel;
    }


    public Boolean cancelAppointment(Long referenceNumber){
        appointmentRepository.deleteById(referenceNumber);
        return true;
    }


    public List<AppointmentModel> getAppointments(){
        return appointmentRepository.findAll();
    }

}

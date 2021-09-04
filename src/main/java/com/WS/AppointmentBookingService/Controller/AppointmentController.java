package com.WS.AppointmentBookingService.Controller;

import com.WS.AppointmentBookingService.DTO.AppointmentDto;
import com.WS.AppointmentBookingService.Model.AppointmentModel;
import com.WS.AppointmentBookingService.Service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class AppointmentController {

    @Autowired
    AppointmentService appointmentService;

    @PostMapping("/bookAppointmentBy8089NX")
    public String bookAppointmentBy8089NX(@RequestBody AppointmentDto appointmentDto){
        AppointmentModel appointmentModel = appointmentService.bookAppointment(new AppointmentModel(appointmentDto));

        if(appointmentModel != null){
            return "Your appointment is successful. Reference number is "+ appointmentModel.getReferenceNumber();
        }
        return "Your appointment is failed.";
    }


    @PostMapping("/cancelAppointment")
    public Boolean cancelAppointment(@RequestBody Long referenceNumber){
        return appointmentService.cancelAppointment(referenceNumber);
    }


    @GetMapping("/appointment")
    public List<AppointmentModel> getAppointments(){
        return appointmentService.getAppointments();
    }

}

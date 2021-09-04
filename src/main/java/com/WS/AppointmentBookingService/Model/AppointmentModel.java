package com.WS.AppointmentBookingService.Model;

import com.WS.AppointmentBookingService.DTO.AppointmentDto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class AppointmentModel {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long referenceNumber;
    private String nameWithInitials;
    private String idNo;
    private Date appointmentDate;

    public AppointmentModel() {
    }

    public AppointmentModel(AppointmentDto appointmentDto) {
        this.nameWithInitials = appointmentDto.getNameWithInitials();
        this.idNo = appointmentDto.getIdNo();
        this.appointmentDate = appointmentDto.getAppointmentDate();
    }

    public Long getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(Long referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public String getNameWithInitials() {
        return nameWithInitials;
    }

    public void setNameWithInitials(String nameWithInitials) {
        this.nameWithInitials = nameWithInitials;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }
}

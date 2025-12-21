package com.example.demo.service;

import com.example.demo.model.Appointment;
import com.example.demo.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    private final AppointmentRepository appointmentRepository;

    @Autowired
    public AppointmentServiceImpl(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    @Override
    public Appointment createAppointment(Appointment appointment) {
        if (appointment.getAppointmentDate().isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("Appointment date cannot be in the past.");
        }
        if (appointment.getStatus() == null) {
            appointment.setStatus("SCHEDULED");
        }
        return appointmentRepository.save(appointment);
    }

    @Override
    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }

    @Override
    public Appointment getAppointmentById(Long id) {
        Optional<Appointment> optionalAppointment = appointmentRepository.findById(id);
        if (optionalAppointment.isEmpty()) {
            throw new RuntimeException("Appointment not found with id: " + id);
        }
        return optionalAppointment.get();
    }

    @Override
    public Appointment updateAppointment(Long id, Appointment appointment) {
        Appointment existingAppointment = getAppointmentById(id);
        if (appointment.getAppointmentDate() != null) {
            if (appointment.getAppointmentDate().isBefore(LocalDate.now())) {
                throw new IllegalArgumentException("Appointment date cannot be in the past.");
            }
            existingAppointment.setAppointmentDate(appointment.getAppointmentDate());
        }
        if (appointment.getPurpose() != null) {
            existingAppointment.setPurpose(appointment.getPurpose());
        }
        if (appointment.getStatus() != null) {
            existingAppointment.setStatus(appointment.getStatus());
        }
        if (appointment.getVisitor() != null) {
            existingAppointment.setVisitor(appointment.getVisitor());
        }
        if (appointment.getHost() != null) {
            existingAppointment.setHost(appointment.getHost());
        }
        return appointmentRepository.save(existingAppointment);
    }

    @Override
    public void deleteAppointment(Long id) {
        appointmentRepository.deleteById(id);
    }
}

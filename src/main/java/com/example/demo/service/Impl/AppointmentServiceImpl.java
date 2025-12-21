package com.example.demo.service.Impl;

import com.example.demo.model.Appointment;
import com.example.demo.repository.AppointmentRepository;
import com.example.demo.service.AppointmentService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    private final AppointmentRepository appointmentRepository;

    public AppointmentServiceImpl(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    @Override
    public Appointment createAppointment(Appointment appointment) {

        if (appointment.getAppointmentDate().isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("Appointment date cannot be in the past");
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
        Optional<Appointment> optional = appointmentRepository.findById(id);
        if (optional.isEmpty()) {
            throw new RuntimeException("Appointment not found with id: " + id);
        }
        return optional.get();
    }

    @Override
    public Appointment updateAppointment(Long id, Appointment appointment) {

        Appointment existing = getAppointmentById(id);

        if (appointment.getAppointmentDate() != null) {
            if (appointment.getAppointmentDate().isBefore(LocalDate.now())) {
                throw new IllegalArgumentException("Appointment date cannot be in the past");
            }
            existing.setAppointmentDate(appointment.getAppointmentDate());
        }

        if (appointment.getPurpose() != null) {
            existing.setPurpose(appointment.getPurpose());
        }

        if (appointment.getStatus() != null) {
            existing.setStatus(appointment.getStatus());
        }

        return appointmentRepository.save(existing);
    }

    @Override
    public void deleteAppointment(Long id) {
        appointmentRepository.deleteById(id);
    }
}

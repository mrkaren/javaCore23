package homework.medicalCenter.model;

import java.util.Date;

public class Patient extends Person {

    private Doctor doctor;
    private Date registerDateTime;
    private Date appointmentDateTime;

    public Patient(String id, String name, String surname, String email, String phone, Doctor doctor, Date registerDateTime, Date appointmentDateTime) {
        super(id, name, surname, email, phone);
        this.doctor = doctor;
        this.registerDateTime = registerDateTime;
        this.appointmentDateTime = appointmentDateTime;
    }

    public Patient() {
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Date getRegisterDateTime() {
        return registerDateTime;
    }

    public void setRegisterDateTime(Date registerDateTime) {
        this.registerDateTime = registerDateTime;
    }

    public Date getAppointmentDateTime() {
        return appointmentDateTime;
    }

    public void setAppointmentDateTime(Date appointmentDateTime) {
        this.appointmentDateTime = appointmentDateTime;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "doctor=" + doctor +
                ", registerDateTime=" + registerDateTime +
                ", appointmentDateTime=" + appointmentDateTime +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                "} ";
    }
}

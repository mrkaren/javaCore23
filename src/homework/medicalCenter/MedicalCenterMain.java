package homework.medicalCenter;

import homework.medicalCenter.exception.PersonNotFoundException;
import homework.medicalCenter.model.Doctor;
import homework.medicalCenter.model.Patient;
import homework.medicalCenter.storage.PersonStorage;
import homework.medicalCenter.util.DateUtil;

import java.text.ParseException;
import java.util.Date;

public class MedicalCenterMain {

    static PersonStorage personStorage = new PersonStorage();

    public static void main(String[] args) throws ParseException {
        Doctor doctor = new Doctor("D001","Dr. Poxos", "Poxosyan", "dr.poxos@mail.com", "0987654","dentist");
        Doctor doctor1 = new Doctor("D002","Dr. Petros", "Petrosyan", "dr.petros@mail.com", "092345","surgeon");

        personStorage.add(doctor);
        personStorage.add(doctor1);

        try {
            Doctor doctorD001 = personStorage.getDoctorById("D001");
            System.out.println(doctorD001.getProfession());
        } catch (PersonNotFoundException e) {
            System.out.println(e.getMessage());
        }

        String appointmentDateStr = "19/10/2023 10:00";
        Date appointmentDate = DateUtil.stringToDateTime(appointmentDateStr);
        Patient patient = new Patient("12345", "Martiros", "Martirosyan","mart@mail.com", "1234567", doctor, new Date(), appointmentDate);
        if (personStorage.isValidDate(doctor,appointmentDate)) {
            personStorage.add(patient);
        }
        String appointmentDateStr1 = "19/10/2023 10:20";
        Date appointmentDate1 = DateUtil.stringToDateTime(appointmentDateStr1);

        Patient patient1 = new Patient("6655443", "Poxosuhi", "Poxosyan","poxosuhi@mail.com", "2345678", doctor, new Date(), appointmentDate1);
        if (personStorage.isValidDate(doctor,appointmentDate1)) {
            personStorage.add(patient1);
        }

        System.out.println("Doctors");
        personStorage.printDoctors();
        System.out.println("Patients");
        personStorage.printPatients();

    }
}

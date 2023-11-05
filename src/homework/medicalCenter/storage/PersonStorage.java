package homework.medicalCenter.storage;

import homework.medicalCenter.exception.PersonNotFoundException;
import homework.medicalCenter.model.Doctor;
import homework.medicalCenter.model.Patient;
import homework.medicalCenter.model.Person;

import java.util.Calendar;
import java.util.Date;

public class PersonStorage {

    private Person[] people = new Person[10];
    private int size;

    public void add(Person person) {
        if (people.length == size) {
            extend();
        }
        people[size++] = person;
    }

    public Doctor getDoctorById(String id) throws PersonNotFoundException {
        for (int i = 0; i < size; i++) {
            if (people[i] instanceof Doctor doctor) {
                if (doctor.getId().equals(id)) {
                    return (Doctor) people[i];
                }
            }
        }
        throw new PersonNotFoundException("Doctor with " + id + " does not found!");
    }

    public void printDoctors() {
        for (int i = 0; i < size; i++) {
            if (people[i] instanceof Doctor) {
                System.out.println(people[i]);
            }
        }
    }

    public void printPatients() {
        for (int i = 0; i < size; i++) {
            if (people[i] instanceof Patient) {
                System.out.println(people[i]);
            }
        }
    }

    public boolean isValidDate(Doctor doctor, Date appointmentDateTime) {
        for (int i = 0; i < size; i++) {
            if (people[i] instanceof Patient patient) {
                if (patient.getDoctor().getId().equals(doctor.getId())) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(patient.getAppointmentDateTime());
                    calendar.add(Calendar.MINUTE, 29);
                    Date appointmentDatePlus30Min = calendar.getTime();
                    if (appointmentDateTime.before(appointmentDatePlus30Min)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private void extend() {
        Person[] tmp = new Person[people.length + 10];
        System.arraycopy(people, 0, tmp, 0, size);
        people = tmp;
    }


}

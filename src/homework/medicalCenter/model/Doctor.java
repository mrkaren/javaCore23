package homework.medicalCenter.model;

public class Doctor extends Person {

    private String profession;

    public Doctor(String id, String name, String surname, String email, String phone, String profession) {
        super(id, name, surname, email, phone);
        this.profession = profession;
    }

    public Doctor() {
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Doctor {" +
                "profession='" + profession + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                "} ";
    }

}

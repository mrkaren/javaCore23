package chapter12;

import chapter12.annotation.FirstAnnotation;
import chapter12.annotation.Model;

@Model(value = 55, name ="234qwef" )
public class User {

    @FirstAnnotation
    private String name;
    private String surname;
    private String email;
    private Language lang;

    @FirstAnnotation
    public User(@FirstAnnotation String name, String surname, String email, Language lang) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.lang = lang;
    }

    @FirstAnnotation
    @Model( value = 7)
    public  String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    @FirstAnnotation
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    @FirstAnnotation
    public void setEmail(String email) {
        this.email = email;
    }

    public Language getLang() {
        return lang;
    }

    public void setLang(Language lang) {
        this.lang = lang;
    }


    public static void printHello() {
        System.out.println("hello");
    }

    @Override
    @FirstAnnotation
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", lang='" + lang + '\'' +
                '}';
    }
}

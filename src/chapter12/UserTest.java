package chapter12;

public class UserTest {

    public static void main(String[] args) {
        String lang = "Hy";
        Language language = Language.valueOf(lang.toUpperCase());

        User user = new User("Poxos", "Poxosyan", "poxos@mail.com", language);

        String surname = user.getSurname();
//        User user1 = new User("petros", "Poxosyan", "petros@mail.com", Language.RU);
//        String lang = user.getLang().name();
//        System.out.println(user);

        Language[] values = Language.values();

        for (Language value : values) {
            System.out.println(value + " " + value.getLanguageName() + " " + value.ordinal());
        }


    }

}

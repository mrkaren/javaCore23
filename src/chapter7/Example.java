package chapter7;

public class Example {

    public static void main(String[] args) {
        if (args.length >= 1) {
            String language = args[0];
            switch (language) {
                case "HY":
                    System.out.println("Բարև");
                    break;
                case "RU":
                    System.out.println("Привет");
                    break;
                case "ENG":
                    System.out.println("Hello");
                    break;
                default:
                    System.out.println("language does not support!");
            }
        } else {
            System.out.println("Language argument is required!");
        }
    }
}

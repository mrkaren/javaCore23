package chapter7;

public class ADemo {

    public static void main(String[] args) {
        A.name = "poxos";

        A.printHello();

        A.y = 10;
        System.out.println(A.name);

        A a = new A();
        System.out.println(A.name);

    }
}

package chapter8;

public class ABTest {

    public static void main(String[] args) {
        A a = new A();
//        B b = new B();
//        a.equals(b);
        a.i = 10;
        a.j = 20;
        System.out.println(a);
        a.i  = 100;
        System.out.println(a);
//        A a = new B();

//        a.show();

    }
}

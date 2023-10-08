package chapter8;

public class A {

    int i;
    int j;

    public A(String a) {
        System.out.println("constructor A");
    }

    public A() {

    }

    void show() {
        System.out.println(i + " " + j);
    }

    @Override
    public String toString() {
        return "A{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }
}

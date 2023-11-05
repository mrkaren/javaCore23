package chapter9.hello;

import chapter7.A;

public class InterfaceTest {

    public static void main(String[] args) {
        ArmPerson armPerson = new ArmPerson();
        EnglishPerson ep = new EnglishPerson();


        printHelloAndGoodBy(ep);
        printHelloAndGoodBy(armPerson);
    }

    static void printHelloAndGoodBy(SayHello sayHello) {
        System.out.println(sayHello.sayHello());
        if (sayHello instanceof SayGoodBy) {
            SayGoodBy sayGoodBy = (SayGoodBy) sayHello;
            System.out.println(sayGoodBy.sayGoodBy());
        }
    }
}

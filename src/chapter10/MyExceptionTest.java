package chapter10;

public class MyExceptionTest {

    static void meth() throws StudentNotFoundException {
        throw new StudentNotFoundException("sdfgh");
    }

}

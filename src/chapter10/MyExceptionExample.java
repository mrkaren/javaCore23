package chapter10;

public class MyExceptionExample {

    public static void main(String[] args) {

//        int a = -9;
//        int[] nums = new int[a];
//        System.out.println(nums.length);
        try {
            System.out.println("hello from Try");
            throw new RuntimeException("");
        } catch (Exception e) {
             e.printStackTrace();
        } finally {
            System.out.println("bye");
        }
//        String name = "Poxos 21";
//        String s = null;
//        try {
//            s = StringUtil.checkString(name);
//            System.out.println(s);
//        } catch (Exception e) {
//            System.out.println(e);
//        }

//        String numberStr = "23t456";
//        try {
//            int i = Integer.parseInt(numberStr);
//            System.out.println(i * i);
//        }catch (NumberFormatException e){
//            System.err.println("Error: " + e.getMessage());
//        }

//        int a = 10;
//        int b = 0;
//        if (b != 0) {
//            System.out.println(a / b);
//        }


//        int c = a * 6;
//        int[] numbers = {1, 2, 3};
//        int index = 7;
//        if (index > 0 && index < numbers.length - 1) {
//            System.out.println(numbers[index]);
//        }
//
//        try {
//            System.out.println("end of try block");
//        } catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("catch block works!");
//        }
    }


}

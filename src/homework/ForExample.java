package homework;

public class ForExample {

    public static void main(String[] args) {
//        int count = 100;
//        for (int i = 0; i < count; i++) {
//            System.out.print(i + 1);
//            if (i != count - 1) {
//                System.out.print(" - ");
//            }
//        }

//        for (int i = 2; i <= 100; i = i + 2) {
//            System.out.print(i + " ");
//        }

//        for (int i = 1; i <= 100; i++) {
//            if (i % 2 == 0) {
//                System.out.print(i + " ");
//            }
//        }

        int[] array = {1, 2, 3, 4, 5, 789, 343, 2, 345, 6};

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Max: " + max);
    }


}

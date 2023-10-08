package homework;

public class ArrayUtil {

    public static void main(String[] args) {
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("First element: " + numbers[0]);
        System.out.println("Last element: " + numbers[numbers.length - 1]);
        System.out.println("length is: " + numbers.length);

        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("min: " + min);
        if (numbers.length > 2) {
            if (numbers.length % 2 == 0) {
                System.out.println("middle numbers: " +
                        numbers[numbers.length / 2 - 1] + " " + numbers[numbers.length / 2]);
            } else {
                System.out.println("middle number: " +
                        numbers[numbers.length / 2]);
            }
        } else {
            System.out.println("Can't print middle values");
        }

        int evenCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0 && numbers[i] % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("evenCount: " + evenCount);

        int oddCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println("oddCount: " + oddCount);

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum: " + sum);
        System.out.println("Avg: " + sum / numbers.length);

    }

}

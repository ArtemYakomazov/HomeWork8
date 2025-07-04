import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Task1
        System.out.println("Task1");

        int[] arrInt = {1, 2, 3};
        System.out.println(Arrays.toString(arrInt));
        float[] arrFloat = {1.57f, 7.654f, 9.986f};
        System.out.println(Arrays.toString(arrFloat));
        long[] arrLong = {1_234_567L, 3_123_123_123L, 412_123_124_345L};
        System.out.println(Arrays.toString(arrLong));

        //Task2
        System.out.println("Task2");

        for (int i = 0; i < arrInt.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arrInt[i]);
        }
        System.out.println();
        for (int i = 0; i < arrFloat.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arrFloat[i]);
        }
        System.out.println();
        for (int i = 0; i < arrLong.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arrLong[i]);
        }
        System.out.println();

        //Task3
        System.out.println("Task3");

        System.out.println(arrInt[2] + ", " + arrInt[1] + ", " + arrInt[0]);
        System.out.println(arrFloat[2] + ", " + arrFloat[1] + ", " + arrFloat[0]);
        System.out.println(arrLong[2] + ", " + arrLong[1] + ", " + arrLong[0]);

        //Task4
        System.out.println("Task4");

        int[] numbers = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] = numbers[i] + 1;
                System.out.println(Arrays.toString(numbers));
            }
        }
    }
}
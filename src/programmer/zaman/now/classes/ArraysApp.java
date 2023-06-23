package programmer.zaman.now.classes;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {
        int[] numbers = {
                1,4,234,5,6,19,21,34,44,55,86,5,6,7
        };

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.binarySearch(numbers, 4));
        System.out.println(Arrays.binarySearch(numbers, 44));
        System.out.println(Arrays.binarySearch(numbers, 100));


        int[] result = Arrays.copyOf(numbers, 5);
        System.out.println(Arrays.toString(result));

        int[] result2 = Arrays.copyOfRange(numbers, 5,10);
        System.out.println(Arrays.toString(result2));

    }
}

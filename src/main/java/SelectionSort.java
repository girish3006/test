import java.util.Arrays;
import java.util.stream.IntStream;

public class SelectionSort {

    public static void main(String[] args) {
        int[] a = {3, 4, 5, 2, 1, 11, 8, 9};

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int temp;
                if (a[i] < a[j]) {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }

        IntStream list = Arrays.stream(a);
        list.forEach(System.out::println);
    }
}

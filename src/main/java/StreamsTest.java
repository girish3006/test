import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamsTest {

    public static void main(String[] args) {

        int[] a = {14,54,1,5,32};

        IntStream list = Arrays.stream(a);

//        list.sorted().forEach( i -> System.out.println(i));

//        list.filter(i -> i>5).limit(2).forEach(i -> System.out.println(i));

//        System.out.println(list.reduce(Integer::sum).getAsInt());
        System.out.println(list.max().getAsInt());
        System.out.println(list.min().getAsInt());
    }
}

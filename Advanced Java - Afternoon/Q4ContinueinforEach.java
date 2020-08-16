import java.util.Arrays;
import java.util.List;

public class Q4ContinueinforEach {
    public static void main(String[] args) {
        //first filter, then apply forEach!
        //print even nums
        List<Integer> arr = Arrays.asList(7, 9, 8, 1, 3, 6, 10, 11, 17, 22, 11);
        arr.stream().filter(x-> (x & 1) == 0).forEach(System.out::println);
    }
}

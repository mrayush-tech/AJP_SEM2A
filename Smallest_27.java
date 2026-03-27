import java.util.*;

public class Smallest_27 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ram", "shyam", "amit", "zeva", "ravi");

        Optional<String> result = list.stream()
                                      .min((a, b) -> a.compareTo(b));

        result.ifPresent(System.out::print);
    }
}
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Four_31 {
    public static void main(String[] args) {
    List<Integer> list = Arrays.asList(2,6,3,8,4,10);
  int product = list.stream().skip(2).min(null)



                         // .filter(n -> n > 5)   // greater than 5
                         // .reduce(1, (a, b) -> a * b); // produc
                          System.out.println(product);
    }
}
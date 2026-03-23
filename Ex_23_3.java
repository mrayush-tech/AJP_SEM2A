import java.util.Arrays;
import java.util.List;

public class Ex_23_3 {
    
        public static void main(String[] args) {
        List<Integer> lsit = Arrays.asList(12,45,7,89,23,56);
     
        int max=lsit.stream().reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);

        System.out.println(+max);


    }
}

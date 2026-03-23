import java.util.Arrays;
import java.util.List;

public class Ex_23_11 {
    public static void main(String[] args) {
        List<Integer> lsit = Arrays.asList(1,2,3,4,5,6);
     
        long count=lsit.stream().reduce(0, (a, b) -> a+b);

        System.out.println("count="+count);
    }
}

import java.util.Arrays;
import java.util.List;

public class Ex_23_10 {
    
         public static void main(String[] args) {
        List<Integer> lsit = Arrays.asList(10,20,30,40,50);
     
        long count=lsit.stream().reduce(0, (a, b) -> a+b/2);

        System.out.println("count="+count);


    }
}
    

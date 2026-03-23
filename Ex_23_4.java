
import java.util.Arrays;
import java.util.List;

public class Ex_23_4 {
    
        public static void main(String[] args) {
        List<Integer> lsit = Arrays.asList(12,45,7,89,23,56);
     
        long count=lsit.stream().reduce(0, (a, b) -> a+ 1);

        System.out.println("count="+count);


    }
}



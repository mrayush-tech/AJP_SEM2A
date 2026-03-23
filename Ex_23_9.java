import java.util.Arrays;
import java.util.List;

public class Ex_23_9 {
    
        public static void main(String[] args) {
        List<String> lsit = Arrays.asList("API","Java","Programming","stram","function");
     
        String count=lsit.stream().reduce("", (a, b) -> a.length() > b.length() ? a : b);

        System.out.println("count="+count);


    }
}

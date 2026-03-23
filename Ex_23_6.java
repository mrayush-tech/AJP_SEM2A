import java.util.Arrays;
import java.util.List;

public class Ex_23_6 {
    
        public static void main(String[] args) {
        List<String> lsit = Arrays.asList("java","stram","API","Reduce");
     
        String finallist =lsit.stream().reduce("", (a, b) ->" "+b );

        System.out.println(finallist);


    }
}
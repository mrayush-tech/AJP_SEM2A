import java.util.Arrays;
import java.util.List;

public class Ex_23_7{
    public static void main(String[] args) {
        List<Integer> lsit = Arrays.asList(10,20,30,40,50);
     
        
        int multi=lsit.stream().reduce(1,(a,b)->a+(b*b));

        System.out.println("multiply is="+multi);
    }
}
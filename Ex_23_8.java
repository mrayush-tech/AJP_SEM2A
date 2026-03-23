import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex_23_8{
    public static void main(String[] args) {
        List<Integer> lsit = Arrays.asList(10,20,30,40,50);
     
        
      //  int smax =list.stream().reduce(0,(a,b)->a>b&&a<max>a:b);
//int smin = lsit.stream() .reduce(Integer.MAX_VALUE, (a, b) -> a < b ? a : b);
              // .filter(x -> x != min)
              int smin =list.stream().reduce(0,(a,b)->a<b&&a<max<a:b);

System.out.println("Second smallest: " + smin);
                                
       
       // System.out.println("multiply is="+multi);
    }
}
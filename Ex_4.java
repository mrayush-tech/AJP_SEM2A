import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex_4 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", null, "spring", null, "react");
        ArrayList<String> data=new ArrayList<String>();
        list.addAll(list);
        
        
        list.stream()
            .filter(s -> s != null)          
            .filter(s -> s.length() > 4)   
            .forEach(s -> System.out.println(s));
    }
}
    


import java.lang.classfile.ClassFile.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.sound.sampled.SourceDataLine;

public class Streamimax_25 {

    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(12,1,4,100,200,45,67,99);
        Optional<Integer> result=list.stream().min((a,b)->0);
        result.ifPresent(System.out::println);

        
    }
}
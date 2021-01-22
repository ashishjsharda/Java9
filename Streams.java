import java.util.Arrays;
import java.util.List;

/**
 * Example using TakeWhile
 * @author ashish
 */
public class Streams {
    public static void main(String[] args) {

        List<String> list= Arrays.asList("Tom" ,"Dick", "Larry","","Aj","Jim");
        list.stream().takeWhile(s->!s.isEmpty()).forEach(System.out::println);
    }
}

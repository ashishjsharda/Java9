package Java9;
import java.util.stream.Stream;

/**
 * Example using TakeWhile
 * @author ashish
 */
public class TakeWhileExample {

    public static void main(String[] args) {

        Stream.of("a","b","c","","d").takeWhile(s -> !s.isEmpty()).forEach(System.out::print);
    }
}

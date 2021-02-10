import java.util.Random;
import java.util.stream.Stream;

/**
 * Generate random number using Streams
 * @author ashish
 */
public class RandomNumStream {
    public static void main(String[] args) {
      Stream.generate(new Random()::nextDouble).limit(5).forEach(System.out::println);
    }
}

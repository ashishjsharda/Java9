package Java9;
import java.util.stream.IntStream;

/**
 * Using IntStream iterate
 */
public class IntStreamTut {
    public static void main(String[] args) {
        IntStream.iterate(2,x->x<10,x->x+2).forEach(System.out::println);
    }
}

package Java9;
import java.util.stream.Stream;

/**
 * Nullable Test
 * @author ashish
 */
public class NullableTest {
    public static void main(String[] args) {
        long count=Stream.ofNullable(100.5).count();
        System.out.println(count);
        count=Stream.ofNullable(null).count();
        System.out.println(count);
    }
}

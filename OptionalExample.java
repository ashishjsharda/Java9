package Java9;
import java.util.Optional;
/**
 * Using Optionals
 * @author ashish
 */
public class OptionalExample {

    public static void show(Optional<Integer> optional)
    {
        optional.ifPresentOrElse(x-> System.out.println(x),()-> System.out.println("X is empty"));
    }
    public static void main(String[] args) {
        Optional<Integer> optionalInteger=Optional.of(2);
        show(optionalInteger);
        optionalInteger=Optional.empty();
        show(optionalInteger);

    }
}

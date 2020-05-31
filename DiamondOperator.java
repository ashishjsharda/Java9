package Java9;

/**
 * Abstract Class Handle
 * @param <T>
 */
abstract class Handle<T>{

    public T input;
    public Handle(T input)
    {
        this.input=input;
    }

    public abstract void show();

}

/**
 * Using DiamondOperator
 * @author ashish
 */
public class DiamondOperator {
    public static void main(String[] args) {

        Handle<Integer> handle=new Handle<>(2) {
            @Override
            public void show() {
                System.out.println(input);
            }
        };
        handle.show();

        Handle<? extends Number> numhandle=new Handle<Double>(10.0){
            @Override
            public void show() {
                System.out.println(input);
            }
        };
        numhandle.show();

        Handle<?> stringhandle=new Handle<String>("Hello"){
            @Override
            public void show() {
                System.out.println(input);
            }
        };
        stringhandle.show();
    }
}

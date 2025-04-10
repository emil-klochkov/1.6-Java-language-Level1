package Ex2;

public class GenericMethods {
    public static <T, U, V> void printThree(T t, U u, V v) {
        System.out.println("Argument 1: " + t);
        System.out.println("Argument 2: " + u);
        System.out.println("Argument 3: " + v);
    }
}
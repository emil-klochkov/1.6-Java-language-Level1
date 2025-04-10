package Ex1;

public class Main {
    public static void main(String[] args) {
        NoGenericMethods obj = new NoGenericMethods("Apple", "Banana", "Cherry");
        obj.printObjects();

        System.out.println("\nWith numbers:");
        NoGenericMethods numbers = new NoGenericMethods(1, 2, 3);
        numbers.printObjects();
    }
}

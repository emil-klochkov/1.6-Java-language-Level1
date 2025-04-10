package Ex2;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", "Doe", 28);
        String message = "Generic method test";
        double value = 3.14;

        GenericMethods.printThree(person, message, value);
        System.out.println("---");
        GenericMethods.printThree(value, person, message);
        System.out.println("---");
        GenericMethods.printThree(message, value, person);
    }
}
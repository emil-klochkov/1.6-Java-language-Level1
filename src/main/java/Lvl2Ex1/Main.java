package Lvl2Ex1;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alice", "Brown", 35);
        String message = "I'm not generic!";
        int number = 10;

        GenericMethods.printMixed(person, message, number);
    }
}
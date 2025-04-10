package Lvl2Ex2;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Lucas", "Martin", 22);
        String text = "Testing varargs";
        double number = 9.99;
        boolean flag = true;

        GenericMethods.printVarArgs(person, text, number, flag, 100, 'A');
    }
}
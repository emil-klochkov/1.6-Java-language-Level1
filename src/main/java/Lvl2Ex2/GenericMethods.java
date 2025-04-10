package Lvl2Ex2;

public class GenericMethods {

    public static <T, V> void printMixed(T t, String fixedString, V v) {
        System.out.println("Argument 1 (Generic): " + t);
        System.out.println("Argument 2 (Fixed String): " + fixedString);
        System.out.println("Argument 3 (Generic): " + v);
    }

    public static void printVarArgs(Object... args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + (i + 1) + ": " + args[i]);
        }
    }
}
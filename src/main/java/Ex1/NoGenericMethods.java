package Ex1;

public class NoGenericMethods {
    private Object obj1;
    private Object obj2;
    private Object obj3;

    public NoGenericMethods(Object obj1, Object obj2, Object obj3) {
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
    }

    public Object getObj1() {
        return obj1;
    }

    public Object getObj2() {
        return obj2;
    }

    public Object getObj3() {
        return obj3;
    }

    public void printObjects() {
        System.out.println("Object 1: " + obj1);
        System.out.println("Object 2: " + obj2);
        System.out.println("Object 3: " + obj3);
    }
}
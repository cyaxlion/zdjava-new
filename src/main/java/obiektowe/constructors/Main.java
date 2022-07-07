package obiektowe.constructors;

public class Main {
    public static void main(String[] args) {
        A a = new A("Testing");
        System.out.println("Class A constructed");
        B b = new B("BParameter");
        System.out.println("Class B constructed");
    }
}


class A{
    public A(String text) {
        System.out.println("Constructor A" + text);
    }
}

class B extends A {
    public B(String text) {
        super(text);
        System.out.println("Constructor B");
    }

}
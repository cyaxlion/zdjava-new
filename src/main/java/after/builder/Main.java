package after.builder;

public class Main {
    public static void main(String[] args) {
        Boxer boxer = new Boxer ();
        boxer.setPunch (new LeftPunch ());
        boxer.hit ();
    }
}

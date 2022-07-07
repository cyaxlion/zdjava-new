package obiektowe.interface_exercises;


interface Human {
    default void getType() {
        System.out.println("I am a human");
    }
}
public interface FamilyMember extends Human {
    default void przedstawSie() {
        System.out.println("I am just a simple family member");
    };
    boolean jestDorosly();
}

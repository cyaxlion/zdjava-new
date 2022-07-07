package obiektowe.interfaces;

public interface FarmAnimal {
    void makeSound();
    public abstract void eat();
    public default void metoda() {
        System.out.println("Hello");
    }
}

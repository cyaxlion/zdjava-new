package obiektowe.inheritance;

import obiektowe.interfaces.FarmAnimal;
import obiektowe.interfaces.LandCreature;

public class Cow extends Animal implements LandCreature, FarmAnimal {

    public Cow(String name, int age) {
        super();
    }

    public void makeSound() {
        System.out.println("Muuuuu!");
    }
}

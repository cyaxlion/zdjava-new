package obiektowe.interfaces;


interface Animal {
    String name = null;
    void eat();
}


class Pet implements Animal {

    @Override
    public void eat() {
        System.out.println("Nom nom nom");
    }
}

public class Main {
    public static void main(String[] args) {

    }
}

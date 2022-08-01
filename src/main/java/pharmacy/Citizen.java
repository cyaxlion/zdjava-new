package pharmacy;

public class Citizen {
    public String name;
    public int age;
    public double discount;

    public double getDiscount() {
        return discount;
    }

    public Citizen(String name, int age) {
        this.name = name;
        this.age = age;
        if (this.age >= 50) this.discount = 0.1;
    }


}

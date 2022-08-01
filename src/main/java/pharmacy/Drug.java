package pharmacy;

import java.text.DecimalFormat;

public class Drug {
    public String name;
    public double price;
    public String getName() {
        return name;
    }

    public Drug(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public double buy(double discount) {
        double currentPrice = this.price - (this.price * discount);
        System.out.println("Lek "
                + this.getName()
                + " został kupiony ze zniżką "
                + new DecimalFormat("#%").format(discount)
                + ", nowa cena: "
                + currentPrice
        );
        return currentPrice;
    }
    public double buy() {
        System.out.println("Lek "
                + this.getName()
                + " został kupiony za "
                + this.getPrice()
        );
        return this.getPrice();
    }

    public double getPrice() {
        return this.price;
    }
}

package zbiory;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> potrawy = new HashSet<>();

        potrawy.add("Lasagna");
        potrawy.add("Steak");
        potrawy.add("Soup");
        potrawy.add("Seafood");
        potrawy.add("Salad");

        potrawy.add("Steak");
        for(String potrawa : potrawy) {
            System.out.println(potrawa);
            break;
        }
        System.out.println(potrawy);

        for ( String potrawa : potrawy) {
            System.out.println(potrawa.toUpperCase());
        }


        Restaurant restaurant = new Restaurant();
        Dish tost = new Dish("Tost", 200, 350, DishType.BREAKFAST);
        restaurant.addDish(tost);

        Dish szakszuka = new Dish("Szakszuka", 350, 400, DishType.BREAKFAST);
        restaurant.addDish(szakszuka);

        Dish koreczki = new Dish("Koreczki", 100, 500, DishType.APPETIZER);
        restaurant.addDish(koreczki);

        Dish stek = new Dish("Stek", 200, 700, DishType.DINNER);
        restaurant.addDish(stek);

        Dish lazania = new Dish("Lazania", 100, 500, DishType.DINNER);
        restaurant.addDish(lazania);

        System.out.println(lazania.equals(stek));
        System.out.println(stek.equals(koreczki));

        try {
            System.out.println(restaurant.findDish("lazania"));
            System.out.println(restaurant.findDish("b"));
        } catch(Exception e) {
            System.out.println(e.getMessage());

        }
        System.out.println(restaurant.findDishesByType(DishType.DINNER));


    }
}

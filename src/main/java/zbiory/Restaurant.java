package zbiory;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Restaurant {
    Set<Dish> dishes = new HashSet<>();
    public Restaurant() {}

    boolean addDish(Dish dish) {
        return dishes.add(dish);
    }

    boolean removeDish(Dish dish) {
        return dishes.remove(dish);
    }

    Dish findDish(String name) throws RestaurantException {
        Dish dish = null;
        for (Dish queryDish : dishes) {
            if(queryDish.getName().equalsIgnoreCase(name)) dish = queryDish;
        }
        if(dish == null) throw new RestaurantException("Dish not found");
        return dish;
    }

    List<Dish> findDishesByType(DishType type) {
        List<Dish> found = new ArrayList<>();
        for (Dish dish : dishes) {
            if(dish.getType() == type) found.add(dish);
        }
        return found;
    }


}

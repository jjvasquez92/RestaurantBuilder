
package co.unicauca.patterns.restaurantbuilder.builderConsola;

import co.unicauca.patterns.restaurantbuilder.Dish;
import co.unicauca.patterns.restaurantbuilder.DishBuilder;
import co.unicauca.patterns.restaurantbuilder.EnumSize;
import co.unicauca.patterns.restaurantbuilder.ItalianDish;

/**
 *
 * @author HP
 */
public class ItalianDishBuilder extends DishBuilder{

    @Override
    public void setCore() {
        this.setDish(new ItalianDish("Pastas", "Pasta con sabor dulce"
                + "con adicion de queso parmesano", "", 54000, EnumSize.HALF, "Pasta italiana con cebolla caramelizada"));
    }

    @Override
    public void addParts() {
        this.dish.addParts(new Dish("Pastas", "Pasta con sabor dulce", "", 18000, EnumSize.HALF) {
        });

        this.dish.addParts(new Dish("Queso parmesano", "queso rayado", "", 7500, EnumSize.ALL) {
        });
    }

    @Override
    public void setSize() {
        this.dish.setSize(EnumSize.ALL);
    }

   
    
}

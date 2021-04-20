
package co.unicauca.patterns.restaurantbuilder.builderConsola;

import co.unicauca.patterns.restaurantbuilder.Dish;
import co.unicauca.patterns.restaurantbuilder.DishBuilder;
import co.unicauca.patterns.restaurantbuilder.EnumSize;
import co.unicauca.patterns.restaurantbuilder.OrientalDish;

/**
 *
 * @author HP
 */
public class OrientalDishBuilder extends DishBuilder{

    @Override
    public void setCore() {
        this.setDish(new OrientalDish("Arroz oriental", "arroz con estilo oriental"
                + ", añadiendo ingredientes con sabores orientales como la soja"
                + "las verduras y las gambas", "", 75000, EnumSize.ALL, "East rice"));
    }

    @Override
    public void addParts() {
         this.dish.addParts(new Dish("Base de arroz", "Base de arroz para preparar arroz oriental", "", 10000, EnumSize.ALL) {
        });
        this.dish.addParts(new Dish("Soja", "Soja oriental", "", 4000, EnumSize.ALL) {
        });
        this.dish.addParts(new Dish("Verduras orientales", "Verduras con sabor oriental", "", 13000, EnumSize.HALF) {
        });
        this.dish.addParts(new Dish("Gambas", "Gambas orientales", "", 15000, EnumSize.ALL) {
        });
    }

    @Override
    public void setSize() {
        this.dish.setSize(EnumSize.ALL);
    }

   
   
}

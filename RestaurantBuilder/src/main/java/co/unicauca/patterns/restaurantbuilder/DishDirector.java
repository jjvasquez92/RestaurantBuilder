
package co.unicauca.patterns.restaurantbuilder;
/**
 *
 * @author HP
 */
public class DishDirector {
    protected DishBuilder dishBuilder;

    public void setDishBuilder(DishBuilder dishBuilder) {
        this.dishBuilder = dishBuilder;
    }
    
    public Dish getDish() {
        return dishBuilder.getDish();
    }
    public void buildDish(){
        dishBuilder.setCore();
        dishBuilder.addParts();
        dishBuilder.setSize();
    }
}

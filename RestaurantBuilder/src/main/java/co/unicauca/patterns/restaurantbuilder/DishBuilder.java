
package co.unicauca.patterns.restaurantbuilder;
/**
 *
 * @author HP
 */
public abstract class DishBuilder {
    protected Dish dish;
    
    public abstract void setCore();
    public abstract void addParts();   
    public abstract void setSize();
    
    public Dish getDish(){
        return this.dish;
    }
    
    public void setDish(Dish dish){
        this.dish = dish;
    }
}

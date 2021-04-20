
package co.unicauca.patterns.restaurantbuilder;
/**
 *
 * @author HP
 */
public class OrientalDish extends Dish{
    private String OrientalName;

    public OrientalDish(String name, String description, String image, int price, EnumSize size, String OrientalName) {
        super(name, description, image, price, size);
        this.OrientalName = OrientalName;
    }   
}

package co.unicauca.patterns.restaurantbuilder.builderConsola;

import co.unicauca.patterns.restaurantbuilder.Dish;
import co.unicauca.patterns.restaurantbuilder.DishBuilder;
import co.unicauca.patterns.restaurantbuilder.DishDirector;

/**
 * Cliente de consola
 *
 * @author Julio Hurtado, Libardo Pantoja
 *
 */
public class ClientMain {

    public static void main(String[] args) {
        DishDirector director = new DishDirector();
	DishBuilder orientalBuilder = new OrientalDishBuilder();
	director.setDishBuilder(orientalBuilder);
	director.buildDish();

	Dish dish = director.getDish();
	System.out.println("Oriental dish:" + dish.getInfoDish());
	System.out.println("Sus partes: "+ dish.MostrarPartsDish());
	System.out.println("Precio de las partes:" + dish.calculatePriceParts());
        
        DishBuilder italianBuilder = new ItalianDishBuilder();
        director.setDishBuilder(italianBuilder);
        director.buildDish();
        System.out.println("*************************************************");
        dish = director.getDish();
        
        System.out.println("Italian dish: " + dish.getInfoDish());
        System.out.println("Sus partes: " + dish.MostrarPartsDish());
        System.out.println("El precio de sus partes: " + dish.calculatePriceParts());
    }
}

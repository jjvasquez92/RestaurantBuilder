package co.unicauca.patterns.restaurantbuilder;


import java.util.ArrayList;
import java.util.List;
/**
 * Plato
 *
 * @author Julio Hurtado, Libardo Pantoja
 *
 */
public class Dish {

    private String name;
    private String description;
    private String image;
    private int price;
    private EnumSize size;
    private ArrayList<Dish> parts;

    public Dish(String name, String description, String image, int price, EnumSize size) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.price = price;
        this.size = size;
        parts = new ArrayList<Dish>();    
    }
    Dish() {
    }       
    public Dish setImage(String filename) {
        this.image = filename;
        return this;
    }
    public String getImage() {
        return image;
    }

    public void setName(String name) {
        this.name = name;
    }   

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setSize(EnumSize size) {
        this.size = size;
    }

    public void setParts(ArrayList<Dish> parts) {
        this.parts = parts;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public EnumSize getSize() {
        return size;
    }

    public ArrayList<Dish> getParts() {
        return parts;
    } 

    public String getInfoDish() {
        return  "\nName: " + this.getName()
                + "\nDescription: " + this.getDescription()
                + "\nPrice: " + this.getPrice();              
            
    }  

    public int calculatePriceParts() {
        int priceParts = 0;
        for(Dish i : parts){
            if(i.size == EnumSize.ALL){
                priceParts += i.price;
            }else{
                priceParts += i.price/2;
            }
        }
        if (!parts.isEmpty())
            price = priceParts;
        return priceParts;
    }
     public void addParts(Dish part){
        parts.add(part);
    }   
    public String MostrarPartsDish(){
        String mostrar = "";
        for(Dish i : parts){
            mostrar += i.getInfoDish();
        }
        return mostrar;
    }
}

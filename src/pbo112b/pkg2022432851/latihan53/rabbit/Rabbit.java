
package pbo112b.pkg2022432851.latihan53.rabbit;


public class Rabbit extends Animal {
    private String color,name;
    
    public Rabbit(String name, boolean veg, String food, int legs, String color){
        super(name,veg,food,legs,color);
        this.color = color;
        this.name = name;

        
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
    
    
    
}

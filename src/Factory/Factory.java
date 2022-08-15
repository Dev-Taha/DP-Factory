package Factory;

import Application.Beef;
import Application.Burger;
import Application.CrunchyChicken;
import Application.Fish;

public class Factory {
    public static Burger createBurger(String name){
        if(name.equalsIgnoreCase("Beef")){
            return new Beef();
        }else if(name.equalsIgnoreCase("CrunchyChicken")){
            return new CrunchyChicken();
        } else if (name.equalsIgnoreCase("Fish")) {
            return new Fish();
        }else {
            throw new IllegalArgumentException("Entry Error !");
        }
    }
}

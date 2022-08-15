package Application;

public class CrunchyChicken implements Burger{
    @Override
    public void createBurger(String typeOfBurger) {
        System.out.println("You selected : "+typeOfBurger + " Burger");
    }
}

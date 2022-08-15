package Application;

public class Beef implements Burger{
    @Override
    public void createBurger(String typeOfBurger) {
        System.out.println("You selected : "+typeOfBurger+" Burger");
    }
}

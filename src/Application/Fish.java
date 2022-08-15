package Application;

public class Fish implements Burger{
    @Override
    public void createBurger(String typeOfBurger) {
        System.out.println("You selected : "+typeOfBurger+" Burger");
    }
}

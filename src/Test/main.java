package Test;

import Application.Burger;
import Factory.Factory;

public class main {
    public static void main(String[] args) {
        Burger b = Factory.createBurger("crunchychicken");
        b.createBurger("crunchychicken");
    }
}

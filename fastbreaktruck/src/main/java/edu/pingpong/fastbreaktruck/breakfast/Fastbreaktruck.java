package edu.pingpong.fastbreaktruck.breakfast;

import edu.pingpong.fastbreaktruck.cereals.Eyeholes;
import edu.pingpong.fastbreaktruck.cereals.Smiggles;
import edu.pingpong.fastbreaktruck.drink.Fleebjuice;
import edu.pingpong.fastbreaktruck.drink.Turbulentjuice;

public class Fastbreaktruck {

    public Breakfast prepareEyeholes() {
        Breakfast breakfast = new Breakfast();

        breakfast.addProduct(new Eyeholes());
        breakfast.addProduct(new Turbulentjuice());
        return breakfast;
    }

    public Breakfast prepareSmiggles() {
        Breakfast breakfast = new Breakfast();

        breakfast.addProduct(new Smiggles());
        breakfast.addProduct(new Fleebjuice());
        return breakfast;
    }

}

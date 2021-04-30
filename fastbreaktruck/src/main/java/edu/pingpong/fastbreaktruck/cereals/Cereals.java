package edu.pingpong.fastbreaktruck.cereals;

import edu.pingpong.fastbreaktruck.interfaces.Packing;
import edu.pingpong.fastbreaktruck.interfaces.Product;
import edu.pingpong.fastbreaktruck.packing.Wrapper;

public abstract class Cereals implements Product {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}

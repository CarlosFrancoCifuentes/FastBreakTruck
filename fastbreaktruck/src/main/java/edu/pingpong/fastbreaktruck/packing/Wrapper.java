package edu.pingpong.fastbreaktruck.packing;

import edu.pingpong.fastbreaktruck.interfaces.Packing;

public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}

package com.zeoblocks.learning.interfaces.timer;

import com.zeoblocks.learning.interfaces.Car;
import com.zeoblocks.learning.interfaces.Costable;

public class SuperCar extends Car implements Costable {

    public SuperCar(final String name, final double cost, final double speed) {
        super(name, cost, speed);
    }

    @Override
    public double costable() {
        return cost() * 666;
    }

    @Override
    public int cost() {
        return 300;
    }
}

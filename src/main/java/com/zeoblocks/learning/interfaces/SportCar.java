package com.zeoblocks.learning.interfaces;

/**
 * Created with IntelliJ IDEA. 10.12.2020
 *
 * @author Evgeniy Zabozhan (evgzabozhan@gmail.com)
 * @version $
 * @since 1.0
 */
public class SportCar extends Car implements Costable{

    public SportCar(final String name, final double cost, final double speed) {
        super(name, cost, speed);
    }

    @Override
    public double costable() {
        return super.getCost() * super.getSpeed() * 10;
    }
}

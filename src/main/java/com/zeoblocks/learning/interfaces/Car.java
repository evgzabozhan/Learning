package com.zeoblocks.learning.interfaces;

import java.util.Objects;

/**
 * Created with IntelliJ IDEA. 10.12.2020
 *
 * @author Evgeniy Zabozhan (evgzabozhan@gmail.com)
 * @version $
 * @since 1.0
 */
public class Car {
    private final String name;
    private final double cost;
    private final double speed;

    public Car(final String name, final double cost, final double speed) {
        this.name = name;
        this.cost = cost;
        this.speed = speed;
    }

    public String getName() {
        return this.name;
    }

    public double getCost() {
        return this.cost;
    }

    public double getSpeed() {
        return this.speed;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        final Car car = (Car) o;
        return Double.compare(car.cost, this.cost) == 0 && Double.compare(car.speed, this.speed) == 0 && Objects.equals(this.name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.cost, this.speed);
    }
}

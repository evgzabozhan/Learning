package com.zeoblocks.learning.inheritance;

import java.util.Objects;

/**
 * Created with IntelliJ IDEA. 07.12.2020
 *
 * @author Evgeniy Zabozhan (evgzabozhan@gmail.com)
 * @version $
 * @since 1.0
 */
public class Manager extends Employee{

    private double bonus;

    public Manager(final String name, final String lastName, final double salary, final double bonus) {
        super(name, lastName, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return this.bonus;
    }

    public void setBonus(final double bonus) {
        this.bonus = bonus;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        final Manager manager = (Manager) o;
        return Double.compare(manager.bonus, this.bonus) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.bonus);
    }

    @Override
    public String toString() {
        return "Manager{" +
            "id=" + getId() +
            "\nbonus=" + bonus +
            "\nname=" + getName() +
            "\nlastName=" + getLastName() +
            "\nsalary=" + getSalary() +
            '}';
    }
}

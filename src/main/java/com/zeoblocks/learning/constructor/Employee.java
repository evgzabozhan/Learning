package com.zeoblocks.learning.constructor;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Evgeniy Zabozhan (evgzabozhan@gmail.com)
 * @version $
 * @since 1.0
 */
public class Employee {

    private final int id;
    private final String name;
    private double salary;



    public Employee(final String name, final double salary) {
        this((int)Math.random() * 999,name,salary);
    }

    public Employee(final int id, final String name, final double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public final int getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

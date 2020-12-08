package com.zeoblocks.learning.inheritance;

import java.util.Objects;

/**
 * Created with IntelliJ IDEA. 07.12.2020
 *
 * @author Evgeniy Zabozhan (evgzabozhan@gmail.com)
 * @version $
 * @since 1.0
 *
 * This class is Employee, here you can change salary and create new employee for company
 */
public class Employee extends Person {

    private final double id;
    private final String lastName;
    private double salary;

    public Employee(final String name, final String lastName, final double salary) {
        super(name);
        this.id = Math.random() * 999;
        this.lastName = lastName;
        this.salary = salary;
    }

    public double getId() {
        return this.id;
    }

    @Override
    public String getDescription() {
        return lastName;
    }

    public String getName() {
        return super.getName();
    }

    public String getLastName() {
        return this.lastName;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(final double salary) {
        this.salary = salary;
    }

    public void upSalaryInPercent(final double percent){
         this.salary = this.salary + ((this.salary / 100) * percent);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        final Employee employee = (Employee) o;
        return Double.compare(employee.salary, this.salary) == 0
            && this.lastName.equals(employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.id, this.lastName, this.salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
            "id=" + id +
            "name=" + super.getName() +
            ", lastName='" + lastName + '\'' +
            ", salary=" + salary +
            '}';
    }
}

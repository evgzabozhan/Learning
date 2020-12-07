package com.zeoblocks.learning.inheritance;

/**
 * Created with IntelliJ IDEA. 07.12.2020
 *
 * @author Evgeniy Zabozhan (evgzabozhan@gmail.com)
 * @version $
 * @since 1.0
 */
public class TestEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee("Fedor","Urikov",300);

        System.out.println(employee.toString());

        employee.upSalaryInPercent(30);

        System.out.println(employee.toString());

        Manager manager = new Manager("Alex","Sapogov",500,100);

        System.out.println(manager.toString());
    }
}

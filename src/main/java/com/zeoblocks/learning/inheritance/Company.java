package com.zeoblocks.learning.inheritance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA. 07.12.2020
 *
 * @author Evgeniy Zabozhan (evgzabozhan@gmail.com)
 * @version $
 * @since 1.0
 *
 * This class contains all employees
 */
public class Company {

    private List<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {
        Company company = new Company();
        company.employees.add(new Employee("Igor","Ivanov",200));
        company.employees.add(new Manager("Oleg","Fedorov",200,200));
        company.employees.add(new Employee("Alex","Izatov",300));

        company.employees.stream().forEach(emp -> System.out.println(emp));

        Person[] people = new Person[3];
        people[0] = new Employee("Ivan","zelen",300);
        people[1] = new Student("Alfo","Zelko");
        people[2] = new Manager("Zek","Uasl",200,400);

        Person[] people2 = new Person[3];
        people2[0] = new Employee("Ivan","zelen",300);
        people2[1] = new Student("Alfo","Zelko");
        people2[2] = new Manager("Zek","Uasl",200,400);

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].equals(people2[i]));
        }

        System.out.println(Arrays.equals(people,people2));

        System.out.println(Arrays.hashCode(people));
        System.out.println(Arrays.hashCode(people2));

        for(Person person : people){
            System.out.println(person.getName() + " last name : " + person.getDescription());
        }
    }

}

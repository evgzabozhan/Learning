package com.zeoblocks.learning.inheritance;

import java.util.Objects;

/**
 * Created with IntelliJ IDEA. 08.12.2020
 *
 * @author Evgeniy Zabozhan (evgzabozhan@gmail.com)
 * @version $
 * @since 1.0
 *
 * This is class where we override getDescription and add body
 */
public class Student extends Person{

    private final String lastName;

    /**
     *
     * @param name student name
     * @param lastName student lastname
     */

    public Student(final String name, final String lastName) {
        super(name);
        this.lastName = lastName;
    }

    @Override
    public String getDescription() {
       return "student last name : " + lastName;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        final Student student = (Student) o;
        return Objects.equals(this.lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.lastName);
    }
}

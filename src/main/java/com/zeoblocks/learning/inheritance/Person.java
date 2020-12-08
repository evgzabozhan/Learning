package com.zeoblocks.learning.inheritance;

import java.util.Objects;

/**
 * Created with IntelliJ IDEA. 08.12.2020
 *
 * @author Evgeniy Zabozhan (evgzabozhan@gmail.com)
 * @version $
 * @since 1.0
 *
 * This is abstract class for all Persons
 */
public abstract class Person {
    private String name;

    protected Person(final String name) {
        this.name = name;
    }

    public abstract String getDescription();

    public String getName() {
        return this.name;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        final Person person = (Person) o;
        return Objects.equals(this.name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name);
    }
}

package com.zeoblocks.learning.reflection;

import java.util.Objects;

/**
 * Created with IntelliJ IDEA. 09.12.2020
 *
 * @author Evgeniy Zabozhan (evgzabozhan@gmail.com)
 * @version $
 * @since 1.0
 *
 * Class for test reflection
 */
public class Ref {

    private  long id;
    private  String name;

    public Ref(){

    }

    public Ref(final long id, final String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        final Ref ref = (Ref) o;
        return this.id == ref.id && Objects.equals(this.name, ref.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name);
    }

    @Override
    public String toString() {
        return "Ref{" +
            "id=" + id +
            ", name='" + name + '\'' +
            '}';
    }
}

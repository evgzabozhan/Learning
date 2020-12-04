package howtousefinal;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Evgeniy Zabozhan (evgzabozhan@gmail.com)
 * @version $
 * @since 1.0
 */
public class Account {
    private final double id;
    private final String FirstName;
    private String LastName;

    public Account(final double id, final String firstName, final String lastName) {
        this.id = id;
        this.FirstName = firstName;
        this.LastName = lastName;
    }

    public double getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.FirstName;
    }

    public void setLastName(final String lastName) {
        this.LastName = lastName;
    }

    public String getLastName() {
        return this.LastName;
    }
}

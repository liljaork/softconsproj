package is.hi.hbv202g.softconsproj;

public class UserOrBookDoesNotExistException extends Exception {
    /**
     * Constructs a new UserOrBookDoesNotExistException with no detail message.
     */
    public UserOrBookDoesNotExistException() {
        super();
    }

    /**
     * Constructs a new UserOrBookDoesNotExistException with the specified detail message.
     *
     * @param message the detail message
     */
    public UserOrBookDoesNotExistException(String message) {
        super(message);
    }
}

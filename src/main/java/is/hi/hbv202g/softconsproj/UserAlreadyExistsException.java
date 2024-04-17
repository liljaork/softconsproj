package is.hi.hbv202g.softconsproj;

public class UserAlreadyExistsException extends Exception{

    /**
     * Constructs a new {@code UserAlreadyExistsException} with no specified detail message.
     */
    public UserAlreadyExistsException() {}

    /**
     * Constructs a new {@code UserAlreadyExistsException} with the specified detail message.
     *
     * @param message the detail message (which is saved for later retrieval by the {@link #getMessage()} method)
     */
    public UserAlreadyExistsException(String message) {
        super(message);
    }
}

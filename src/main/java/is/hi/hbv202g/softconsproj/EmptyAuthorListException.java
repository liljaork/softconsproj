package is.hi.hbv202g.softconsproj;

public class EmptyAuthorListException extends Exception {

    /**
     * Constructs a new EmptyAuthorListException with null as its detail message.
     */
    public EmptyAuthorListException() {}

    /**
     * Constructs a new EmptyAuthorListException with the specified detail message.
     *
     * @param message the detail message (which is saved for later retrieval by the getMessage() method)
     */
    public EmptyAuthorListException(String message) {
        super(message);
    }
}

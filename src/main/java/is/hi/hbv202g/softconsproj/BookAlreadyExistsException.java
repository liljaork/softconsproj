package is.hi.hbv202g.softconsproj;

public class BookAlreadyExistsException extends Exception {

    /**
     * Default constructor.
     */
    public BookAlreadyExistsException() {
        super();
    }

    /**
     * 
     * @param message
     */
    public BookAlreadyExistsException(String message) {
        super(message);
    }
}
package is.hi.hbv202g.softconsproj;

public class BookAlreadyExistsException extends Exception{

    public BookAlreadyExistsException() {}

    /**
     * Smiður sem tekur inn message
     * @param message
     */
    public BookAlreadyExistsException(String message) {
        super(message);
    }
}

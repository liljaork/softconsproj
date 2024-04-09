package is.hi.hbv202g.softconsproj;

public class EmptyAuthorListException extends Exception {
    /**
     * Smiður sem tekur inn message
     * @param message
     */
    public EmptyAuthorListException(String message) {
        super(message);
    }
}

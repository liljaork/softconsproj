package is.hi.hbv202g.softconsproj;

public class UserAlreadyExistsException extends Exception{

    public UserAlreadyExistsException() {}

    /**
     * Smiður sem tekur inn message
     * @param message
     */
    public UserAlreadyExistsException(String message) {
        super(message);
    }
}

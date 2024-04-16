package is.hi.hbv202g.softconsproj;

public class UserOrBookDoesNotExistException extends Exception {
    public UserOrBookDoesNotExistException() {}
    
    /**
     * Smiður sem tekur inn message
     * @param message
     */
    public UserOrBookDoesNotExistException(String message) {
        super(message); 
    }
}

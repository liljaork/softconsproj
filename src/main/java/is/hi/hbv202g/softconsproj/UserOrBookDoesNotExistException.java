package is.hi.hbv202g.softconsproj;

public class UserOrBookDoesNotExistException extends Exception {
    public UserOrBookDoesNotExistException() {}
    

    public UserOrBookDoesNotExistException(String message) {
        super(message); 
    }
}

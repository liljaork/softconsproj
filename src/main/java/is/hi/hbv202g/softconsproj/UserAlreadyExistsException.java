package is.hi.hbv202g.softconsproj;

public class UserAlreadyExistsException extends Exception{

    public UserAlreadyExistsException() {}


    public UserAlreadyExistsException(String message) {
        super(message);
    }
}

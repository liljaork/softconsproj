package is.hi.hbv202g.softconsproj;

public class BookAlreadyExistsException extends Exception{

    public BookAlreadyExistsException() {}

    public BookAlreadyExistsException(String message) {
        super(message);
    }
}

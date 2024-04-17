package is.hi.hbv202g.softconsproj;
import java.time.LocalDate;


public class Lending {
    //Instance variables
    private LocalDate dueDate;
    private Book book;
    private User user;

    /**
     * Constructs a new Lending record with the specified book and user.
     * Automatically sets the due date to 30 days from the current date.
     * @param book the book that is being lent
     * @param user the user who is borrowing the book
     */
    public Lending(Book book, User user) {
        this.book = book;
        this.user = user;
        this.dueDate = LocalDate.now().plusDays(30); // Sets the due date to 30 days from today
    }

    /**
     * Returns the due date of the book being lent.
     * @return the due date
     */
    public LocalDate getDueDate() {
        return dueDate;
    }

    /**
     * Sets the due date for the borrowed book.
     * @param dueDate the new due date
     */
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * Returns the book involved in this lending.
     * @return the book being lent
     */
    public Book getBook() {
        return book;
    }

    /**
     * Sets the book for this lending.
     * @param book the book to be lent
     */
    public void setBook(Book book) {
        this.book = book;
    }

    /**
     * Returns the user who is borrowing the book.
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets the user who is borrowing the book.
     * @param user the user borrowing the book
     */
    public void setUser(User user) {
        this.user = user;
    }
}
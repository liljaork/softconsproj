package is.hi.hbv202g.softconsproj;
import java.time.LocalDate;

public class Lending {
    //Tilviksbreytur
    private LocalDate dueDate;
    private Book book;
    private User user;

    /**
    * Smiður sem tekur inn book og user og setur dueDate eftir 30 daga frá deginum í dag
    * @param book
    * @param user
    */
    public Lending(Book book, User user) {
        this.book = book;
        this.user = user;
        this.dueDate = LocalDate.now().plusDays(30); 
    }

    /**
     * Getter fyrir dueDate
     * @return dueDate
     */
    public LocalDate getDueDate() {
        return dueDate;
    }

    /**
     * Setter fyrir dueDate
     * @param dueDate
     */
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * Getter fyrir book
     * @return book
     */
    public Book getBook() {
        return book;
    }

    /**
     * Setter fyrir book
     * @param book
     */
    public void setBook(Book book) {
        this.book = book;
    }
    
    /**
     * Getter fyrir user
     * @return user
     */
    public User getUser() {
        return user;
    }
    
    /**
     * Setter fyrir user
     * @param user
     */
    public void setUser(User user) {
        this.user = user;
    }

}

package is.hi.hbv202g.softconsproj;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LibrarySystem {
    //Tilviksbreytur
    private List<Book> books;
    private List<User> users;
    private List<Lending> lendings;

    /**
     * Smiður
     */
    public LibrarySystem() {
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
        this.lendings = new ArrayList<>();
    }

    /**
     * Aðferð sem bætir nýrri bók með title og authorName við listann books
     * @param title
     * @param authorName
     */
    public void addBookWithTitleAndNameOfSingleAuthor(String title, String authorName){
        Book newBook = new Book(title, authorName);
        books.add(newBook);
    }

    /**
     * Aðferð sem bætir nýrri bók með title og authors við listann books
     * @param title
     * @param authors
     * @throws EmptyAuthorListException ef authors listinn er tómur
     */
    public void addBookWithTitleAndAuthorList(String title, List<Author> authors) throws EmptyAuthorListException {
        if (authors == null || authors.isEmpty()) {
            throw new EmptyAuthorListException("Author list cannot be empty");
        }
        Book newBook = new Book(title, authors);
        books.add(newBook);
    }

    /**
     * Aðferð sem bætir nýjum nemanda við listann users
     * @param name
     * @param feePaid
     */
    public void addStudentUser(String name, boolean feePaid) {
        users.add(new Student(name, feePaid));
    }

    /**
     * Aðferð sem bætir við nýjum faculty member við listann users
     * @param name
     * @param department
     */
    public void addFacultyMemberUser(String name, String department) {
        users.add(new FacultyMember(name, department));
    }

    /**
     * Aðferð sem finnur bók með titli bókarinnar
     * @param title
     * @return book
     * @throws UserOrBookDoesNotExistException ef bók með titlinum finnst ekki 
     */
    public Book findBookByTitle(String title) throws UserOrBookDoesNotExistException {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        throw new UserOrBookDoesNotExistException("Book with title '" + title + "' does not exist");
    }

    /**
     * Aðferð sem finnur notanda 
     * @param name
     * @return user
     * @throws UserOrBookDoesNotExistException ef notandi með ákveðið nafn finnst ekki
     */
    public User findUserByName(String name) throws UserOrBookDoesNotExistException {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        throw new UserOrBookDoesNotExistException("User with name '" + name + "' does not exist");
    }
    
    /**
     * Aðferð sem lánar út bók
     * @param user
     * @param book
     * @throws UserOrBookDoesNotExistException ef notandi eða bók finnst ekki
     */
    public void borrowBook(User user, Book book) throws UserOrBookDoesNotExistException {
        if (!users.contains(user) || !books.contains(book)) {
            throw new UserOrBookDoesNotExistException("User or book does not exist in the library system");
        }
        lendings.add(new Lending(book, user));
    }
    
    /**
     * Aðferð sem lengir útlán á bók
     * @param facultyMember
     * @param book
     * @param newDueDate
     * @throws UserOrBookDoesNotExistException ef notandi eða bók finnst ekki
     */
    public void extendLending(FacultyMember facultyMember, Book book, LocalDate newDueDate) throws UserOrBookDoesNotExistException {
        Lending lending = findLending(facultyMember, book);
        if (lending != null) {
            lending.setDueDate(newDueDate);
        } else {
            throw new UserOrBookDoesNotExistException("Lending for faculty member or book does not exist");
        }
    }

    /**
     * Aðferð sem skilar bók
     * @param user
     * @param book
     * @throws UserOrBookDoesNotExistException ef notandi eða bók finnst ekki
     */
    public void returnBook(User user, Book book) throws UserOrBookDoesNotExistException {
        Lending lending = findLending(user, book);
        if (lending != null) {
            lendings.remove(lending);
        } else {
            throw new UserOrBookDoesNotExistException("Lending for user or book does not exist");
        }
    }

    // Helper method to find lending by user and book
    /**
     * Aðferð sem finnur hvaða notandi er með hvaða bók í láni
     * @param user
     * @param book
     * @return lending
     */
    private Lending findLending(User user, Book book) {
        for (Lending lending : lendings) {
            if (lending.getUser().equals(user) && lending.getBook().equals(book)) {
                return lending;
            }
        }
        return null;
    }
    
}

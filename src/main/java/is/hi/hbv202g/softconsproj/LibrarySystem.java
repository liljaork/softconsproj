package is.hi.hbv202g.softconsproj;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class LibrarySystem {
    //Instance variables
    private List<Book> books;   
    private List<User> users;    
    private List<Lending> lendings; 

    /**
     * Constructs a new LibrarySystem with empty lists for books, users, and lendings.
     */
    public LibrarySystem() {
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
        this.lendings = new ArrayList<>();
    }

    /**
     * Returns the list of all books in the library.
     * @return the list of books
     */
    public List<Book> getBooks() {
        return books;
    }

    /**
     * Returns the list of all users.
     * @return the list of users
     */
    public List<User> getUsers() {
        return users;
    }

    /**
     * Returns the list of all active lendings in the library.
     * @return the list of lendings
     */
    public List<Lending> getLendings() {
        return lendings;
    }

    /**
     * Adds a new book with a single author to the library collection.
     * @param title the title of the book
     * @param authorName the name of the author
     */
    public void addBookWithTitleAndNameOfSingleAuthor(String title, String authorName){
        Book newBook = new Book(title, authorName);
        books.add(newBook);
    }

    /**
     * Adds a new book with multiple authors to the library collection.
     * @param authors a list of authors
     * @throws EmptyAuthorListException if the author list is empty
     */
    public void addBookWithTitleAndAuthorList(String title, List<Author> authors) throws EmptyAuthorListException {
        if (authors == null || authors.isEmpty()) {
            throw new EmptyAuthorListException("Author list cannot be empty");
        }
        Book newBook = new Book(title, authors);
        books.add(newBook);
    }

    /**
     * Registers a new student user in the library system.
     * @param name the name of the student
     * @param feePaid indicates whether the fee has been paid
     */
    public void addStudentUser(String name, boolean feePaid) {
        users.add(new Student(name, feePaid));
    }

    /**
     * Registers a new faculty member user in the library system.
     * @param name the name of the faculty member
     * @param department the department of the faculty member
     */
    public void addFacultyMemberUser(String name, String department) {
        users.add(new FacultyMember(name, department));
    }

    /**
     * Searches for and returns a book by its title.
     * @param title the title of the book to find
     * @return the found book
     * @throws UserOrBookDoesNotExistException if the book does not exist
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
     * Searches for and returns a user by their name. 
     * @param name the name of the user to find
     * @return the found user
     * @throws UserOrBookDoesNotExistException if the user does not exist
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
     * Allows a user to borrow a book from the library, adding a lending record to the system.
     * @param user the user who is borrowing the book
     * @param book the book to be borrowed
     * @throws UserOrBookDoesNotExistException if the user or book does not exist in the library system
     */
    public void borrowBook(User user, Book book) throws UserOrBookDoesNotExistException {
        if (!users.contains(user) || !books.contains(book)) {
            throw new UserOrBookDoesNotExistException("User or book does not exist in the library system");
        }
        lendings.add(new Lending(book, user));
    }

    /**
     * Extends the lending period for a book borrowed by a faculty member. 
     * @param facultyMember the faculty member who has borrowed the book
     * @param book the book whose lending is to be extended
     * @param newDueDate the new due date for the lending
     * @throws UserOrBookDoesNotExistException if the lending record does not exist
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
     * Returns a book to the library, removing the lending record from the system. 
     * @param user the user returning the book
     * @param book the book being returned
     * @throws UserOrBookDoesNotExistException if the lending record does not exist
     */
    public void returnBook(User user, Book book) throws UserOrBookDoesNotExistException {
        Lending lending = findLending(user, book);
        if (lending != null) {
            lendings.remove(lending);
        } else {
            throw new UserOrBookDoesNotExistException("Lending for user or book does not exist");
        }
    }

    /**
     * Searches for a lending record by user and book.
     * @param user the user involved in the lending
     * @param book the book involved in the lending
     * @return the lending record if found, or null if no such lending exists
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
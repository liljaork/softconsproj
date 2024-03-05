package is.hi.hbv202g.assignment8;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LibrarySystem {
    private List<Book> books;
    private List<User> users;
    private List<Lending> lendings;

    public LibrarySystem() {
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
        this.lendings = new ArrayList<>();
    }

    public void addBookWithTitleAndNameOfSingleAuthor(String title, String authorName){
        Book newBook = new Book(title, authorName);
        books.add(newBook);
    }

    public void addBookWithTitleAndAuthorList(String title, List<Author> authors) throws EmptyAuthorListException {
        if (authors == null || authors.isEmpty()) {
            throw new EmptyAuthorListException("Author list cannot be empty");
        }
        Book newBook = new Book(title, authors);
        books.add(newBook);
    }

    public void addStudentUser(String name, boolean feePaid) {
        users.add(new Student(name, feePaid));
    }

    public void addFacultyMemberUser(String name, String department) {
        users.add(new FacultyMember(name, department));
    }

    public Book findBookByTitle(String title) throws UserOrBookDoesNotExistException {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        throw new UserOrBookDoesNotExistException("Book with title '" + title + "' does not exist");
    }

    public User findUserByName(String name) throws UserOrBookDoesNotExistException {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        throw new UserOrBookDoesNotExistException("User with name '" + name + "' does not exist");
    }
    
    public void borrowBook(User user, Book book) throws UserOrBookDoesNotExistException {
        if (!users.contains(user) || !books.contains(book)) {
            throw new UserOrBookDoesNotExistException("User or book does not exist in the library system");
        }
        lendings.add(new Lending(book, user));
    }
    
    public void extendLending(FacultyMember facultyMember, Book book, LocalDate newDueDate) throws UserOrBookDoesNotExistException {
        Lending lending = findLending(facultyMember, book);
        if (lending != null) {
            lending.setDueDate(newDueDate);
        } else {
            throw new UserOrBookDoesNotExistException("Lending for faculty member or book does not exist");
        }
    }

    public void returnBook(User user, Book book) throws UserOrBookDoesNotExistException {
        Lending lending = findLending(user, book);
        if (lending != null) {
            lendings.remove(lending);
        } else {
            throw new UserOrBookDoesNotExistException("Lending for user or book does not exist");
        }
    }

    // Helper method to find lending by user and book
    private Lending findLending(User user, Book book) {
        for (Lending lending : lendings) {
            if (lending.getUser().equals(user) && lending.getBook().equals(book)) {
                return lending;
            }
        }
        return null;
    }
    
}

package is.hi.hbv202g.softconsproj;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LibrarySystemTest {
    private LibrarySystem librarySystem;

    /**
     * Sets up the test environment by creating a new instance of LibrarySystem.
     */
    @Before
    public void setUp() {
        librarySystem = new LibrarySystem();
    }

    /**
     * Tests the addBookWithTitleAndNameOfSingleAuthor method of LibrarySystem.
     * It verifies that a book can be added with a single author and then retrieved by its title.
     */
    @Test
    public void testAddBookWithTitleAndNameOfSingleAuthor() throws UserOrBookDoesNotExistException{
        librarySystem.addBookWithTitleAndNameOfSingleAuthor("Title", "Author");
        assertNotNull(librarySystem.findBookByTitle("Title"));
    }

    /**
     * Tests the addBookWithTitleAndAuthorList method of LibrarySystem.
     * It verifies that a book can be added with a list of authors and then retrieved by its title.
     */
    @Test
    public void testAddBookWithTitleAndAuthorList() throws EmptyAuthorListException, UserOrBookDoesNotExistException{
        List<Author> authors = new ArrayList<>();
        authors.add(new Author("Author"));
        librarySystem.addBookWithTitleAndAuthorList("Title", authors);
        assertNotNull(librarySystem.findBookByTitle("Title"));
    }

    /**
     * Tests the addStudentUser method of LibrarySystem.
     * It verifies that a student user can be added and then retrieved by its name.
     */
    @Test
    public void testAddStudentUser() throws UserOrBookDoesNotExistException {
        librarySystem.addStudentUser("Student", true);
        assertNotNull(librarySystem.findUserByName("Student"));
    }

    /**
     * Tests the addFacultyMemberUser method of LibrarySystem.
     * It verifies that a faculty member user can be added and then retrieved by its name.
     */
    @Test
    public void testAddFacultyMemberUser() throws UserOrBookDoesNotExistException {
        librarySystem.addFacultyMemberUser("Faculty", "Department");
        assertNotNull(librarySystem.findUserByName("Faculty"));
    }

    /**
     * Tests the findBookByTitle method of LibrarySystem with a nonexistent book title.
     * It verifies that a UserOrBookDoesNotExistException is thrown when attempting to find a nonexistent book.
     */
    @Test(expected = UserOrBookDoesNotExistException.class)
    public void testFindNonexistentBook() throws UserOrBookDoesNotExistException {
        librarySystem.findBookByTitle("NonexistentTitle");
    }
    
    /**
     * Tests the findUserByName method of LibrarySystem with a nonexistent user name.
     * It verifies that a UserOrBookDoesNotExistException is thrown when attempting to find a nonexistent user.
     */
    @Test(expected = UserOrBookDoesNotExistException.class)
    public void testFindNonexistentUser() throws UserOrBookDoesNotExistException {
        librarySystem.findUserByName("NonexistentUser");
    }
    
    /**
     * Tests the borrowBook method of LibrarySystem with a nonexistent book.
     * It verifies that a UserOrBookDoesNotExistException is thrown when attempting to borrow a nonexistent book.
     */
    @Test(expected = UserOrBookDoesNotExistException.class)
    public void testBorrowNonexistentBook() throws UserOrBookDoesNotExistException {
        User user = new Student("Student1", true);
        Book book = new Book("NonexistentTitle", "NonexistentAuthor");
        librarySystem.addStudentUser("Student1", true);
        librarySystem.borrowBook(user, book);
    }
    
    /**
     * Tests the returnBook method of LibrarySystem with a nonexistent book.
     * It verifies that a UserOrBookDoesNotExistException is thrown when attempting to return a nonexistent book.
     */
    @Test(expected = UserOrBookDoesNotExistException.class)
    public void testReturnNonexistentBook() throws UserOrBookDoesNotExistException {
        User user = new Student("Student1", true);
        Book book = new Book("NonexistentTitle", "NonexistentAuthor");
        librarySystem.addStudentUser("Student1", true);
        librarySystem.returnBook(user, book);
    }
    
    /**
     * Tests the extendLending method of LibrarySystem with a nonexistent lending.
     * It verifies that a UserOrBookDoesNotExistException is thrown when attempting to extend a nonexistent lending.
     */
    @Test(expected = UserOrBookDoesNotExistException.class)
    public void testExtendLendingForNonexistentLending() throws UserOrBookDoesNotExistException {
        FacultyMember facultyMember = new FacultyMember("Faculty1", "Department1");
        Book book = new Book("Title1", "Author1");
        librarySystem.addFacultyMemberUser("Faculty1", "Department1");
        librarySystem.addBookWithTitleAndNameOfSingleAuthor("Title1", "Author1");
        librarySystem.extendLending(facultyMember, book, LocalDate.now().plusWeeks(1));
    }

}
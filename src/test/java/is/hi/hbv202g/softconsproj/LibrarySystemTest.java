package is.hi.hbv202g.softconsproj;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LibrarySystemTest {
    private LibrarySystem librarySystem;

    @Before
    public void setUp() {
        librarySystem = new LibrarySystem();
    }

    @Test
    public void testAddBookWithTitleAndNameOfSingleAuthor() throws UserOrBookDoesNotExistException{
        librarySystem.addBookWithTitleAndNameOfSingleAuthor("Title", "Author");
        assertNotNull(librarySystem.findBookByTitle("Title"));
    }

    @Test
    public void testAddBookWithTitleAndAuthorList() throws EmptyAuthorListException, UserOrBookDoesNotExistException{
        List<Author> authors = new ArrayList<>();
        authors.add(new Author("Author"));
        librarySystem.addBookWithTitleAndAuthorList("Title", authors);
        assertNotNull(librarySystem.findBookByTitle("Title"));
    }

    @Test
    public void testAddStudentUser() throws UserOrBookDoesNotExistException {
        librarySystem.addStudentUser("Student", true);
        assertNotNull(librarySystem.findUserByName("Student"));
    }

    @Test
    public void testAddFacultyMemberUser() throws UserOrBookDoesNotExistException {
        librarySystem.addFacultyMemberUser("Faculty", "Department");
        assertNotNull(librarySystem.findUserByName("Faculty"));
    }

    @Test(expected = UserOrBookDoesNotExistException.class)
    public void testFindNonexistentBook() throws UserOrBookDoesNotExistException {
        librarySystem.findBookByTitle("NonexistentTitle");
    }
    
    @Test(expected = UserOrBookDoesNotExistException.class)
    public void testFindNonexistentUser() throws UserOrBookDoesNotExistException {
        librarySystem.findUserByName("NonexistentUser");
    }
    
    @Test(expected = UserOrBookDoesNotExistException.class)
    public void testBorrowNonexistentBook() throws UserOrBookDoesNotExistException {
        User user = new Student("Student1", true);
        Book book = new Book("NonexistentTitle", "NonexistentAuthor");
        librarySystem.addStudentUser("Student1", true);
        librarySystem.borrowBook(user, book);
    }
    
    @Test(expected = UserOrBookDoesNotExistException.class)
    public void testReturnNonexistentBook() throws UserOrBookDoesNotExistException {
        User user = new Student("Student1", true);
        Book book = new Book("NonexistentTitle", "NonexistentAuthor");
        librarySystem.addStudentUser("Student1", true);
        librarySystem.returnBook(user, book);
    }
    
    @Test(expected = UserOrBookDoesNotExistException.class)
    public void testExtendLendingForNonexistentLending() throws UserOrBookDoesNotExistException {
        FacultyMember facultyMember = new FacultyMember("Faculty1", "Department1");
        Book book = new Book("Title1", "Author1");
        librarySystem.addFacultyMemberUser("Faculty1", "Department1");
        librarySystem.addBookWithTitleAndNameOfSingleAuthor("Title1", "Author1");
        librarySystem.extendLending(facultyMember, book, LocalDate.now().plusWeeks(1));
    }

}

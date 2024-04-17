package is.hi.hbv202g.softconsproj;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for the {@link Book} class.
 */
public class BookTest {
    private Book book;

    /**
     * Sets up a {@code Book} object before each test.
     */
    @Before
    public void setUp() {
        book = new Book("Title", "Author");
    }

    /**
     * Test adding an author to the book.
     */
    @Test
    public void testAddAuthor() {
        Author author = new Author("New Author");
        book.addAuthor(author);
        assertTrue(book.getAuthors().contains(author));
    }

    /**
     * Test adding a null author to the book.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testAddNullAuthor() {
        book.addAuthor(null);
    }
    
    /**
     * Test setting null authors list for the book.
     */
    @Test
    public void testSetNullAuthorsList() {
        assertThrows(EmptyAuthorListException.class, () -> {
            book.setAuthors(null);
        });
    }

    /**
     * Test creating a book with a null title.
     */
    @Test
    public void testCreateBookWithNullTitle() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Book(null, "Author");
        });
    }
}
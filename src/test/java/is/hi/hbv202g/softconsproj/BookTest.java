package is.hi.hbv202g.softconsproj;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class BookTest {
    private Book book;

    @Before
    public void setUp() {
        book = new Book("Title", "Author");
    }

    @Test
    public void testAddAuthor() {
        Author author = new Author("New Author");
        book.addAuthor(author);
        assertTrue(book.getAuthors().contains(author));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddNullAuthor() {
        book.addAuthor(null);
    }
    
    @Test
    public void testSetNullAuthorsList() {
        assertThrows(EmptyAuthorListException.class, () -> {
            book.setAuthors(null);
        });
    }

    @Test
    public void testCreateBookWithNullTitle() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Book(null, "Author");
        });
    }
}

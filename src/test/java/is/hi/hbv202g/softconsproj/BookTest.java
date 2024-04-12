package is.hi.hbv202g.softconsproj;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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

    // Bætti svo þessu við til að hafa önnur test:
    // IllegalArgumentException klasinn er núþegar partur af java :))
    @Test(expected = IllegalArgumentException.class)
    public void testAddNullAuthor() {
        book.addAuthor(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNullAuthorsList() {
        book.setAuthors(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateBookWithNullTitle() {
        new Book(null, "Author");
    }
}

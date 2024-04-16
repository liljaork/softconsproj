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
    
    // TODO - þarf að hafa sér klasa? eða má ég bara bæta við Book.java?
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

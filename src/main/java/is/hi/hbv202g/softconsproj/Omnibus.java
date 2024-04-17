package is.hi.hbv202g.softconsproj;
import java.util.ArrayList;
import java.util.List;

public class Omnibus implements LibraryItem {
    //Instance variable
    private List<LibraryItem> books; 

    /**
     * Default constructor
     */
    public Omnibus() {
        this.books = new ArrayList<LibraryItem>();
    }

    /**
     * Cleans all the library items in this omnibus by calling their individual clean methods.
     */
    public void clean() {
        for (LibraryItem book : books) {
            book.clean();
        }
    }

    /**
     * Adds a new library item to the omnibus.
     * @param libraryItem the library item to be added to the omnibus
     */
    public void add(LibraryItem libraryItem) {
        books.add(libraryItem);
    }

    /**
     * Removes a library item from the omnibus.
     * @param libraryItem the library item to be removed from the omnibus
     */
    public void remove(LibraryItem libraryItem) {
        books.remove(libraryItem);
    }

    /**
     * Returns a list of all library items currently in the omnibus.
     * @return books
     */
    public List<LibraryItem> getBooks() {
        return books;
    }
}
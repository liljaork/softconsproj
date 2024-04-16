package is.hi.hbv202g.softconsproj;

import java.util.ArrayList;
import java.util.List;

public class Book implements LibraryItem {
    //Tilviksbreytur
    private String title;
    private List<Author> authors;
    private boolean cleaning;

    /**
     * Default constructor. Creates a book with no title or author.
     */
    public Book() {
    }
    
    /**
     * Constructs a book with a specified title and author name. The book
     * is not in the cleaning process by default.
     *
     * @param title       The title of the book.
     * @param authorName  The name of the author of the book.
     * @throws IllegalArgumentException if the title is null.
     */
    public Book(String title, String authorName) {
        if (title == null) {
            throw new IllegalArgumentException("Title cannot be null");
        }
        this.title = title;
        this.authors = new ArrayList<>();
        this.authors.add(new Author(authorName));
        this.cleaning = false;
    }

    /**
     * Constructs a book with a specified title and a list of authors.
     *
     * @param title   The title of the book.
     * @param authors A list of Author objects representing the authors of the book.
     * @throws EmptyAuthorListException if the authors list is null or empty.
     */
    public Book(String title, List<Author> authors) throws EmptyAuthorListException {
        this.title = title;
        if (authors == null || authors.isEmpty()) {
            throw new EmptyAuthorListException("Author list cannot be empty");
        }
        this.authors = authors;
    }

    /**
     * Returns the list of authors of the book.
     *
     * @return A list of Author objects.
     */
    public List<Author> getAuthors() {
        return authors;
    }

    /**
     * Sets the list of authors of the book.
     *
     * @param authors A list of Author objects to set as the book's authors.
     * @throws EmptyAuthorListException if the authors list is null or empty.
     */
    public void setAuthors(List<Author> authors) throws EmptyAuthorListException {
        if (authors == null) {
            throw new EmptyAuthorListException("Author list cannot be null");
        }
        if (authors.isEmpty()) {
            throw new EmptyAuthorListException("Author list cannot be empty");
        }
        this.authors = authors;
    }

    /**
     * Adds an author to the book's list of authors.
     *
     * @param author The Author object to add to the book.
     * @throws IllegalArgumentException if the author object is null.
     */
    public void addAuthor(Author author) {
        if (author == null) {
            throw new IllegalArgumentException("Author cannot be null");
        }
        this.authors.add(author);
    }

    /**
     * Returns the title of the book.
     *
     * @return The book's title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the book.
     *
     * @param title The title to set for the book.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Sets the book's cleaning status.
     *
     * @param cleaningStatus A boolean representing whether the book is being cleaned.
     */
    public void setCleaning(boolean cleaningStatus){
        this.cleaning = cleaningStatus;
    }

    /**
     * Returns the book's cleaning status.
     *
     * @param book The book for which to get the cleaning status.
     * @return A boolean indicating whether the book is in the process of being cleaned.
     */
    public boolean getCleaning(Book book){
        return cleaning;
    }
    
    /**
     * Performs the cleaning operation on the book, setting its cleaning status to true.
     */
    public void clean() {
        setCleaning(true);
    }
    
}

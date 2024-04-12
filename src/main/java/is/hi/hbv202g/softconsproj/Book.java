package is.hi.hbv202g.softconsproj;

import java.util.ArrayList;
import java.util.List;

public class Book implements LibraryItem {
    //Tilviksbreytur
    private String title;
    private List<Author> authors;
    private boolean cleaning;
    
    /**
     * Smiður sem tekur inn title og authorName og bætir nýjum Author við listann authors
     * @param title
     * @param authorName
     */
    public Book(String title, String authorName) {
        this.title = title;
        this.authors = new ArrayList<>();
        this.authors.add(new Author(authorName));
        this.cleaning = false;
    }

    /**
     * Smiður sem tekur inn title og authorList og bætir nýjum Author við listann authors
     * @param title
     * @param authors
     * @throws EmptyAuthorListException
     */
    public Book(String title, List<Author> authors) throws EmptyAuthorListException {
        this.title = title;
        if (authors == null || authors.isEmpty()) {
            throw new EmptyAuthorListException("Author list cannot be empty");
        }
        this.authors = authors;
    }

    /**
     * Getter fyrir authors
     * @return authors
     */
    public List<Author> getAuthors() {
        return authors;
    }

    /**
     * Setter fyrir authors
     * @param authors
     * @throws EmptyAuthorListException
     */
    public void setAuthors(List<Author> authors) throws EmptyAuthorListException {
        if (authors == null || authors.isEmpty()) {
            throw new EmptyAuthorListException("Author list cannot be empty");
        }
        this.authors = authors;
    }

    /**
     * Aðferð sem bætir nýjum Author við listann authors
     * @param author
     */
    public void addAuthor(Author author) {
        this.authors.add(author);
    }

    /**
     * Getter fyrir title
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Setter fyrir title
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    public void setCleaning(boolean cleaningStatus){
        this.cleaning = cleaningStatus;
    }

    public boolean getCleaning(Book book){
        return cleaning;
    }

    // LibraryItem kallar á þetta:
    public void clean() {
        setCleaning(true);
    }
    
}

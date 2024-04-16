package is.hi.hbv202g.softconsproj;

import java.util.ArrayList;
import java.util.List;

public class Book implements LibraryItem {
    //Tilviksbreytur
    private String title;
    private List<Author> authors;
    private boolean cleaning;

    public Book() {
    }
    
    public Book(String title, String authorName) {
        this.title = title;
        this.authors = new ArrayList<>();
        this.authors.add(new Author(authorName));
        this.cleaning = false;
    }

    public Book(String title, List<Author> authors) throws EmptyAuthorListException {
        this.title = title;
        if (authors == null || authors.isEmpty()) {
            throw new EmptyAuthorListException("Author list cannot be empty");
        }
        this.authors = authors;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) throws EmptyAuthorListException {
        if (authors == null || authors.isEmpty()) {
            throw new EmptyAuthorListException("Author list cannot be empty");
        }
        this.authors = authors;
    }

    public void addAuthor(Author author) {
        this.authors.add(author);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCleaning(boolean cleaningStatus){
        this.cleaning = cleaningStatus;
    }

    public boolean getCleaning(Book book){
        return cleaning;
    }
    
    public void clean() {
        setCleaning(true);
    }
    
}

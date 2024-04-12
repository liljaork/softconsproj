package is.hi.hbv202g.softconsproj;
import java.util.ArrayList;
import java.util.List;

public class Omnibus implements LibraryItem {
    private List<LibraryItem> books = new ArrayList<LibraryItem>();
    private String nafnaBok;

    public Omnibus(String nafnaBok){
        this.nafnaBok= nafnaBok;
    }

    public void clean() {
        for (LibraryItem book : books) {
            book.clean();
        }
    }

    public void add(LibraryItem libraryItem) {
        books.add(libraryItem);
    }

    public void remove(LibraryItem libraryItem) {
        books.remove(libraryItem);
    }

    public List<LibraryItem> getBooks() {
        return books;
    }

    public String getNafnaBok(){
        return nafnaBok;
    }

    public void setNafnaBok(String nafnaBok){
        this.nafnaBok= nafnaBok;
    }

    /* 
    public List<Book> leigjaBaekur(String nafnaBok) throws UserOrBookDoesNotExistException{

        while (nafnaBok : <Book>){
            findBookByTitle(nafnaBok);
        }
        
    }
    */

    
}

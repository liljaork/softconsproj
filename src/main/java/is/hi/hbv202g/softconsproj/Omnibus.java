package is.hi.hbv202g.softconsproj;
import java.util.ArrayList;
import java.util.List;

public class Omnibus implements LibraryItem {
    private String nafnaBok;

    public Omnibus(String nafnaBok){
        this.nafnaBok= nafnaBok;

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

package EserciziIteratori;
import java.util.ArrayList;
import java.util.Iterator;

public class Library {
    private ArrayList <Book> lib=new ArrayList<>();
    private ArrayList <Book> libPrest=new ArrayList<>();

    public Library(){

    }

    public boolean addbook(Book x){
        Iterator<Book> it = lib.iterator();
        for (Book i : lib) {
            if (x.equals(it)) {
                return false;
            } else {
                lib.add(x);
                return true;
            }
        }
        return false;
    }

    public boolean loanBook(Book x){
        Iterator<Book> it=lib.iterator();
        for(Book j: lib){
            if(x.equals(it)){
                lib.remove(j);
                libPrest.add(x);
                return true;
            }else{
                return false;
            }
        }
        return false;
    }

    public boolean returnBook(Book x){
        Iterator<Book> it=libPrest.iterator();
        for (Book j: libPrest){
            if(x.equals(it)){
                libPrest.remove(j);
                lib.add(j);
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
    public void print(){
        Iterator<Book> it=lib.iterator();
        for(Book j: lib){
            System.out.println(lib);
        }
    }

}

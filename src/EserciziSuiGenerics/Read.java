package EserciziSuiGenerics;
import java.io.*;


public class Read {
    FileReader filein = new FileReader("Dati.txt");
    int next;
    try{
        do{
            next=filein.read();
            if(next!=-1){
                char nextc=(char) next;
                System.out.print(nextc);
            }
        }while(next!=-1);
        filein.close();
    }catch(IOException e){
        System.out.println(e);
    }

    public Read() throws FileNotFoundException, IOException {
    }
}

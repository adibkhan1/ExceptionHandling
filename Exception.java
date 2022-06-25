import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*; 

class FilenotFound {
    public void FileAccess(){
        try{
            FileReader fr=new FileReader("Text");
        }
        catch(FileNotFoundException fnf){
           System.out.println(fnf.getMessage());
        }

        finally{
            System.out.println("This shall always run");
        }
    }

    public void Calc()throws NullPointerException{
        int i=25;
        int j=0;
        
        int tot= i-j;
        if(tot==25){
            throw new NullPointerException("Illegal calculation not possible!"); // Unchecked exception so not declaring exception
        }
        else{
            System.out.println(tot);
        }
    }

    public static void main(String[] args) {
        FilenotFound f=new FilenotFound();
        f.FileAccess();
        f.Calc();
    }
}



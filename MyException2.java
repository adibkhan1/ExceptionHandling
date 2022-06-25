import java.util.*;

public class MyException2 extends Exception {
    
    private String s;

    public MyException2(String str){
        s=str;
    }
    public String GetMessage(){
    return s;
    }
}

class except {
    public static void main(String[] args){
        String str1;
        Scanner in =new Scanner(System.in);
        str1=in.nextLine();
        try{
            if(str1.equalsIgnoreCase("hello")){
                System.out.println("Right string");
            }
            else{
                throw new MyException2("Invalid String!");
            }
    
        }

        catch(MyException2 e){
            System.out.println(e.GetMessage());
        }
    }
}
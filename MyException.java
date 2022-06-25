public class MyException extends Exception{
    private int value;
    private String msg;
    public MyException(int i){
        value=i;
        msg=new String("Exception happens at "+value+".");
    }
    public String getMessage(){
        return msg;
    }
    public void PrintStackTrace(){
        System.out.println("{Problem is with the value "+value);
    }
}

class Propagate{
    public void method1(int i){
        try{
            method2(i);
        }
        catch(MyException e){
            e.PrintStackTrace();
        }
    }
    public void method2 (int i)throws MyException{
        if (i==0){
            throw new MyException(i);
        }
        else{
            System.out.println("i : "+i);
        }
    }
        public static void main(String[] args) {
            Propagate p=new Propagate();
            for(int i=0;i<3;i++){
                p.method1(i);
            }
        }
}
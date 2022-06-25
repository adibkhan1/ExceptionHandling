public class ExceptionTest {
    public static void main(String[] args) {
        int num;
        String str;

        try{
            str="xyz";
            num=Integer.parseInt(str);
            System.out.println("A");
        }
        catch(NumberFormatException e){
            System.out.println("B");
        }
        catch(IllegalArgumentException e){
            System.out.println("C");
        }
        finally{
            System.out.println("D");
        }
        System.out.println("E");
    }
}
import java.io.IOException;
import java.util.*;
public class TestDivide {
    public static void main(String[] args)throws InputMismatchException,IOException,ArithmeticException {
        Scanner in= new Scanner(System.in);

        try{
            int denom= in.nextInt();
            if(denom<=0){
                throw new ArithmeticException("input has to be positive");
            }
            System.out.println("Value is :"+ 100/denom);
        }
        catch(ArithmeticException e){
          System.out.println("Arithmetic exception occured");
          throw e;
        }
        catch(NumberFormatException e){
            System.out.println("Wrong data type");
        } 
        //--------------------Extra--------------------//
        catch(InputMismatchException e){
            System.out.println("Wrong data type used");
            e.printStackTrace();
        }
    }
}
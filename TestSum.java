import java.io.IOException;
import java.util.*;

public class TestSum {
    public static void main(String[] args)throws IOException{
        
        double num[]=new double[5];
        double total=0;

        Scanner in = new Scanner(System.in);

        System.out.println("How many floating point numbers do you want?");
        int max= in.nextInt();
        System.out.println("Enter "+max+" numbers :");

        for(int i=0;i<max;i++){
            num[i]=in.nextDouble();
            total+=num[i];
        }
        System.out.println("End of programming");
        System.out.println("Total: "+total);
    }
}
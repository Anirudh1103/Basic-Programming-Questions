import java.util.Scanner;

public class Nth_Number {
    //1,3,6,10,15,21,28,36....
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = ip.nextInt();
        int Series_val = 1;
        System.out.println("The series is: ");
         if(n == 1)
             System.out.println(Series_val);
         else{
             System.out.print(Series_val + " ");
             for(int i = 2;i<=n;i++)
             {
                 Series_val+=i;
                 System.out.print(Series_val + " ");
             }
         }
    }
}

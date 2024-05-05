import java.util.Scanner;

//The series will be in the below form
//a,a+d,a+2d,a+3d,a+4d....

public class ArithmeticSeries {
    public static void main(String[] args) {
        int n,d,a,sum;
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the starting number: ");
        a = ip.nextInt();
        sum = a;
        System.out.println("Enter the distance between the numbers: ");
        d = ip.nextInt();
        System.out.println("Enter the value of n: ");
        n = ip.nextInt();
        if(n == 1)
        {
            System.out.println(a);
            System.out.println("Sum = " + sum);
        }
        else {
            System.out.print(a + " ");
            for(int i=1;i<n;i++)
            {
                System.out.print((a + i * d) + " ");
                sum+=(a + i * d);
            }
            System.out.println();
            System.out.println("Sum = " + sum);
        }


    }
}

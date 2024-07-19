import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose factorial needs to be found: ");
        int n = sc.nextInt();
        int factorial = 1;
        for(int i=1; i<=n;i++)
        {
            factorial*=i;
        }
        System.out.println(factorial);
    }

}

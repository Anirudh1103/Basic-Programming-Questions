import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = ip.nextInt();
        int sum = 0;
        if(n == 0)
            System.out.println("Sum = 0");
        while(n != 0)
        {
            sum += n%10;
            n = n / 10;
        }
        System.out.println("Sum = " + sum);
    }
}

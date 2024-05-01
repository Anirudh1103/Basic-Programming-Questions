import java.util.Scanner;

public class Fibonacci_numbers {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the number until where you want to print the fibonacci series: ");
        int number = ip.nextInt();
        int n1 = 0;
        int n2 = 1;
        System.out.println(n1);
        System.out.println(n2);
        for(int i = 2;i<=number;i++)
        {
            int temp = n1+n2;
            n1 = n2;
            n2 = temp;
            System.out.println(temp);
        }
    }
}

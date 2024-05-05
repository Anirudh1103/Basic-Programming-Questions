import java.util.Scanner;

public class NumberOfDivisors {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int count=0;
        int n = ip.nextInt();
        for(int i = 1;i<=n;i++)
        {
            if(n % i == 0)
            {
                System.out.print(i + " ");
                count+=1;
            }
        }
        System.out.println("are the divisors");
        System.out.println(count + " divisors are there.");

    }
}

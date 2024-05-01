import java.util.Scanner;

public class Sum_Series {
    //We need to calculate sum series of N natural numbers
    //This problem is similar to Fibonacci series the only change here is the Natural number starts with 1
    //After calculating the fibonacci series of natural numbers we have to calculate the sum series of them as well
    public static void main(String[] args) {
        System.out.println("---------Sum series of Natural numbers---------");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 1; i<=n; i++){
            sum1 += i;
            sum2 += sum1;
        }
        System.out.println("The sum of the series is: " + sum2);
    }

}

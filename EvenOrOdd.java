import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = ip.nextInt();
        boolean result = isEven(n);
        //if(result) will check if result is true or not
        if(result)
            System.out.println(n + " is even number");
        else
            System.out.println(n + " is odd number");

    }
    public static boolean isEven(int n){
        return n % 2 == 0;
        //The above line of code will check the condition and returns if it is true or false

    }
}

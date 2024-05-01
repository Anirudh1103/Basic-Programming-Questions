import java.util.Scanner;

public class Multiplication_tables {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the number whose table you want to print:  ");
        int n = ip.nextInt();
        for(int i=1; i<=10; i++)
            System.out.println(n + " * " + i + " = " + (n*i));
    }
}

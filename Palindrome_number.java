import java.util.Scanner;

public class Palindrome_number {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int Original_num = ip.nextInt();
        int temp = Original_num;
        int reversed_num = 0;
        while(temp!=0)
        {
            reversed_num += temp%10;
            reversed_num *= 10;
            temp = temp/10;
        }
        if(Original_num == reversed_num)
            System.out.println("The given number is palindrome");
        else
            System.out.println("The given number is not a palindrome");

    }
}

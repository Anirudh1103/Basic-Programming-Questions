import java.util.Scanner;

public class DiceProblem {
    //The Dice Problem: The user will give imput of the number on the dice we need to print the value
    //exactly behind the dice facing the user the front and back facing values are given.
    //Front of Dice         Back of Dice
    //      1                   6
    //      2                   5
    //      3                   4

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter the value of the facing dice: ");
        int num = ip.nextInt();
        System.out.println("The number facing oppsite " + num + " is: "+(7-num));
    }
}

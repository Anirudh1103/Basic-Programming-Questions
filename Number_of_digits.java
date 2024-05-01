import java.util.Scanner;

public class Number_of_digits {
    public static void main(String[] args) {
        //We can count the number of strings in a given number in two ways.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = in.nextInt();
        String str_n = String.valueOf(n);
        Method1(n);
        Method2(str_n);
    }
    public static void Method1(int n){
        int count = 0;
        while(n!=0){
            n = n/10;
            count+=1;
        }
        System.out.println(count);

    }
    public static void Method2(String str_n){
        System.out.println(str_n.length());
    }
}

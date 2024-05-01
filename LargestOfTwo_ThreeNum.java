import java.util.Scanner;

public class LargestOfTwo_ThreeNum {
    public static void main(String[] args) {
        //This program demonstrates function overloading
        //This program will work both for two or three numbers
        //Function overloading: Having a function with same name but with different parameters.

        Scanner ip = new Scanner(System.in);
        greatest(10,20);
        greatest(12,15,11);

    }
    public static void greatest(int n1, int n2){
        if(n1>n2)
            System.out.println(n1 + " is greater");
        else
            System.out.println(n2 + " is greater");
    }
    public static void greatest(int n1, int n2, int n3){
        if(n1>n2 && n1>n3)
            System.out.println(n1 + " is greater");
        else if (n2>n1 && n2>n3)
            System.out.println(n2 + " is greater");
        else
            System.out.println(n3 + " is greater");

    }
}

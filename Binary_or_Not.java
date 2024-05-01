import java.util.Scanner;

public class Binary_or_Not {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.println("---------Binary Number or Not---------");
        System.out.println("Enter the number: ");
        int binary_num = ip.nextInt();
       boolean result =  isBinary(binary_num);
        System.out.println(result);
    }
    public static boolean isBinary(int binary_num){
        if(binary_num == 0 || binary_num < 0 || binary_num == 1 )
            return false;
        while (binary_num != 0) {

            // If the digit is greater than 1 return false
            if (binary_num % 10 > 1) {
                return false;
            }
            binary_num = binary_num / 10;
            //The last digit of the number will be eleminated.
        }
        return true;
    }
}


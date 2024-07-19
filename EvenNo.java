import java.util.Scanner;

public class EvenNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0, sum = 0;
        for(int i=a;i<=b;i++)
        {
            if(i%2==0)
            {
                System.out.println(a);
                sum += i;
                count++;
            }
        }
        System.out.println(count);
        System.out.println(sum);

    }
}

import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        //Program to calculate the simple intrest
        Scanner ip = new Scanner(System.in);
        float p, t,r;
        System.out.println("Enter the principle amount: ");
        p = ip.nextFloat();
        System.out.println("Enter the time: ");
        t = ip.nextFloat();
        System.out.println("Enter the rate of intrest: ");
        r = ip.nextFloat();
        float si = (p*t*r)/100;
        System.out.println(si);
    }
}

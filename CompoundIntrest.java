import java.util.Scanner;

public class CompoundIntrest {
    public static void main(String[] args) {
        float p,t,r,cp = 0,p_dup;
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the principle amount: ");
        p = ip.nextFloat();
        p_dup = p;
        System.out.println("Enter the time: ");
        t = ip.nextFloat();
        System.out.println("Enter the rate of intrest (in percentage eg:18) ");
        r = ip.nextFloat();
        r = r/100;
        for(int i=1;i<=t;i++)
        {
            cp += (p_dup*r)/100;
            p_dup += cp;
        }
        System.out.println("Compound intrest is: " + cp);
        System.out.println("Principle amount would be: " + (p+cp) );
    }
}

public class Swap_two_Num {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before swapping :");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        //We can swap the value of two varibales in two different methods
        //Method 1: Using temp variable
        //Method 2: Without using temp variable
        Method1(a,b);
        Method2(a,b);
    }
    public static void Method1(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After  swapping using Method 1 :");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    public static void Method2(int a, int b)
    {
        a = a + b; // 10 + 20 = 30
        b = a - b; //30 - 20 = 10
        a = a - b; //30 - 10 = 20

        System.out.println("After  swapping using Method 2 :");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}

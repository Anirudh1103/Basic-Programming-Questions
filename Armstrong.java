public class Armstrong {
    //153
    public static void main(String[] args) {
        int num = 153;
        int num2 = 0;
        int temp = num;
        while(temp!=0){
            int last_digit = temp%10;
            temp = temp/10;
            num2 += last_digit*last_digit*last_digit;
        }
        if(num == num2)
        {
            System.out.println("The given number is Armstrong number");
        }
        else
            System.out.println("The given number is not Armstrong number");
    }
}

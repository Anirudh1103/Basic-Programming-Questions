public class Reverese_digit {
    public static void main(String[] args) {
        int num = 123456;//Output: 54321
        int reverse_digit = 0;
        while(num != 0)
        {
            reverse_digit = reverse_digit * 10 + num%10;
            num = num/10;
        }
        System.out.println(reverse_digit);
    }
}

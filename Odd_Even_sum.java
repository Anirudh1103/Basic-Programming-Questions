public class Odd_Even_sum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int Odd_sum = 0,Even_sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
                Even_sum+=arr[i];
            else
                Odd_sum += arr[i];
        }
        System.out.println("Odd Sum: " +Odd_sum);
        System.out.println("Even Sum: " + Even_sum);
    }
}

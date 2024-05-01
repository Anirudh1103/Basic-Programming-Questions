public class Mean_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;
        int mean = Array_mean(arr,n);
        System.out.println(mean);
    }
    public static int Array_mean(int[] arr, int n)
    {
        int sum = 0;
        int mean;
        for(int i = 0;i<n;i++)
        {
            sum+=arr[i];
        }
        mean = sum/n;
        return mean;
    }
}

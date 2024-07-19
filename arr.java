public class arr {
    public static void main(String[] args) {
        int[] arr = {3,8,4,5,6,9};
        int count = 0,max;
        for (int i=0;i< arr.length;i++)
        {
            if(i == arr.length) break;
            for(int j = i+1; j< arr.length;j++)
            {
                if(arr[j]>arr[i])
                {
                    max = arr[j];
                    count+=1;
                }
            }

        }
        System.out.println(count);
    }
}

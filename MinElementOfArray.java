public class MinElementOfArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,20,50,100,560};
        int min = arr[0];
        for(int i = 0; i< arr.length;i++)
        {
            if(arr[i] < min)
                min = arr[i];
        }
        System.out.println("Minimum element is: " + min);
    }
}

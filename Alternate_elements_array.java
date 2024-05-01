public class Alternate_elements_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Alternate array elements are: ");
        System.out.print("[ ");//This is used to print the array within two square brackets.
        for(int i = 0; i<arr.length;i+=2)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
    }
}

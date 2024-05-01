public class Product_of_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int product = 1;
        //Here we have taken initial value as 1 because anything multiplied with 1 will be the number itself
        //If we take 0 as initial value as 0 product's value will always be 0 because anything multiplied with 0 is 0 itself

        for(int i=0 ; i<arr.length; i++)
            product *= arr[i];
        System.out.println("Product: " + product);

    }
}

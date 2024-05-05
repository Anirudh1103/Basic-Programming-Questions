import java.util.Scanner;

//Perfect array is one which has increasing order till a point and then it decreases.
//Example for perfect array: [10,20,50,70,65,60,10]

public class PerfectArray {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int[] arr = {1, 2, 3, 20, 5, 1};
        int Max_element_Index = maxElementInArray(arr);
        isPerfectArray(Max_element_Index,arr);
    }

    public static int maxElementInArray(int[] arr) {
            //This function will return the index of the max element in the array.

            int max = arr[0];
            int Max_element_Index = 1;//initializing the first element as max element initially.
            for (int i = 0; i < arr.length; i++)
                if (arr[i] > max) {
                    max = arr[i];
                    Max_element_Index = i;
                }
            return Max_element_Index;
    }
    public static void isPerfectArray(int index, int[] arr){
        //This function will check if the entered array is perfect array or not.
        boolean flag = true;
        //We are running the below for loop till index -1 because if we pass index it will check next index as well.
        for(int i = 0;i<=index-1;i++){
            if(arr[i] > arr[i+1])
            {
                flag = false;
                break;
            }
        }
        //We need to run the loop until arr.length - 1 because when the loop reaches the end and in if codition
        //it will check the arr[i+1] loop which dosen't exist it will show  indexOutOfBounds error.
        for(int i=index;i<arr.length-1;i++)
        {
            if(arr[i] < arr[i+1])
            {
                flag = false;
                break;
            }
        }

        if(flag)
            System.out.println("The entered array is perfect array.");
        else System.out.println("The entered array is not a perfect array.");
    }

}

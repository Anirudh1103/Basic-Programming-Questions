public class Equilibrium_Point {
    public static void main(String[] args) {
        int[] a = {5,6,1,20,12};
        int b_sum = 0;
        int f_sum = 0;

        //Index 3 is equilibrium point
        for (int j : a) {
            b_sum += j;
        }
        for(int i = 1;i<a.length;i++)
        {
            if(b_sum == (f_sum-a[i]))
                System.out.println(i);
            b_sum += a[i];
            f_sum -= a[i];
        }


    }
}

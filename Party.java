public class Party {
    public static void main(String[] args) {
        int t= 5,curr_guest = 0,max_guest = 0;

        int[] e = {5,2,6,3,1};
        int[] l = {3,1,2,4,2};
        int max = e[0];

        for(int i = 0;i<e.length;i++)
        {
            curr_guest += e[i];
            curr_guest -= l[i];
            if(curr_guest>max)
                max = curr_guest;
        }
        System.out.println(max);
    }
}

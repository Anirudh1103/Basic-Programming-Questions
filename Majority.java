public class Majority {
    public static void main(String[] args) {
        int[] nums = {3,2,3,5};
        int curr_majority = 0;
        int count = 0;
        for(int i = 0;i<nums.length;i++)
        {
            for(int j = 0;j<nums.length;j++)
            {
                if(nums[i] == nums[j])
                {
                    count+=1;
                }
            }
        }
        System.out.println(count);
    }
}

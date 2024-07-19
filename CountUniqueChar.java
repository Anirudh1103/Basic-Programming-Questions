public class CountUniqueChar {
    public static void main(String[] args) {
        String str = "Bottle";
        String copy = "";
        int count = 0;
        for(int i=0; i<str.length();i++)
        {
            for(int j=0;j<copy.length();j++)
            {
                if(str.charAt(i) != copy.charAt(i))
                {
                    copy = copy + str.charAt(i);
                    count+=1;
                }
                else continue;
            }
        }
    }
}

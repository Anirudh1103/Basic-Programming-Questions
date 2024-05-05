public class CountCamels {
    //Camels in this program refers to captial letters in the string
    //We can write code for this in many ways
    //Here I have used ASCII characters logic
    //The ASCII value of capital letters starts from 65 and ends at 91.
    public static void main(String[] args) {
        int count = 0;
        String str = "Hello my name is Airudh C M";
        System.out.println("The capital letters are: ");
        for(int i=0; i<str.length();i++)
        {
            if(str.charAt(i)>=65 && str.charAt(i)<=91)
            {
                System.out.println(str.charAt(i));
                count+=1;
            }
        }
        System.out.println("Capital letters count = " + count);
    }

}

public class VowelOrConsonant {
    static void isVowel(char x)
    {
        if (x == 'a' || x == 'e' || x == 'i' ||
                x == 'o' || x == 'u' || x == 'A'|| x == 'E'|| x == 'I'|| x == 'O'|| x == 'U')
            System.out.println("Vowel");
        else
            System.out.println("Consonant");
    }

    static public void main(String[] args)
    {
        isVowel('c');
        isVowel('E');
    }
}

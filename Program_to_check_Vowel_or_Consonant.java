import java.util.Scanner;
public class Letter{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        char ch = in.next().charAt(0);
        if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u'  || ch == 'U')
        {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("Consonant");
        }
        in.close();
    }
}
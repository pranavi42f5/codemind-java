import java.util.Scanner;
public class Number{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if(x % 2 == 0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
}
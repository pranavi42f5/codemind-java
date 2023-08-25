import java.util.Scanner;
public class Pretty{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int i;
        for(i = 0; i < t; i++)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int j,c=0;
            for(j=a;j<=b;j++)
            {
                if(j % 10 == 2 || j % 10 == 3 || j % 10 == 9)
                {
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}
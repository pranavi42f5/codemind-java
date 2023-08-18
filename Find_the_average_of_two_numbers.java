import java.util.Scanner;
public class Average{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        double Avg = (a + b) * 0.5;
        System.out.printf("%.4f",Avg);
    }
}
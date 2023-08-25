import java.util.Scanner;
public class Sum{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int Sum = (n * (n + 1)) / 2;
        System.out.println(Sum);
    }
}
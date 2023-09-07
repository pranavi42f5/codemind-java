import java.util.*;
public class Automorphic{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = n * n;
        String s1 = Integer.toString(n);
        String s2 = Integer.toString(s);
        System.out.println(s2.endsWith(s1) ? "Automorphic Number" : "Not an Automorphic Number");
    }
}
import java.util.*;
public class Sum{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] intArray = new int[n];
        for(int i=0; i<n;i++)
        {
            intArray[i] = in.nextInt();
        }
        int sum = 0;
        for(int eachElement : intArray)
        {
            sum += eachElement;
        }
        System.out.println(sum);
    }
}
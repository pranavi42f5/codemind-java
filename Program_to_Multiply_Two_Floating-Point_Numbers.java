import java.util.Scanner;
public class Multiply{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        float a = in.nextFloat();
        float b = in.nextFloat();
        double mul = a * b;
        System.out.printf("%.2f",mul);
    }
}
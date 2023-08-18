import java.util.Scanner;
public class Area{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        double s = (a + b + c) * 0.5;
        double area = Math. sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.printf("%.2f",area);
    }
}
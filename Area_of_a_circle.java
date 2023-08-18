import java.util.Scanner;
public class Area{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        double area = 3.14 * r * r;
        System.out.printf("%.2f",area);
        in.close();
    }
}
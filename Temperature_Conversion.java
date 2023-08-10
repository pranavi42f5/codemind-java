import java.util.Scanner;
public class Temperature{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        System.out.printf("%.2f",32+(c*1.8));
    }
}
// sum of 3 numbers 
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int a = sc.nextInt();
        System.out.println("Enter number 2:");
        int b = sc.nextInt();
        System.out.println("Enter number 3:");
        int c = sc.nextInt();
        int s = a+b+c;
        System.out.println("The sum of three numbers a: " + a + "  b: " + b + "  c: " + c + "  is s = " + s);
        }
}

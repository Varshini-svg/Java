import java.util.Scanner;
public class largestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = in.nextInt();
        System.out.println("Enter b: ");
        int b = in.nextInt();
        System.out.println("Enter c: ");
        int c = in.nextInt();

        // logic 1
        if(a>b && a>c){
            System.out.println(a);
        }
        else if(b>c){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }

        // logic 3
        int max = Math.max(c,Math.max(a,b));
        System.out.println(max);
    }
}

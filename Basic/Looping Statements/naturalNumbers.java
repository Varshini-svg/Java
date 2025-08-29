
import java.util.Scanner;
public class naturalNumbers {
    public static void main(String[] args) {
        //getting the starting and ending number from the user

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting number:");
        int startNumber = sc.nextInt();
        System.out.println("Enter the ending number:");
        int endNumber = sc.nextInt();

        // using for loop
        System.out.println("Results using For loop");

        for(int i = startNumber; i<=endNumber; i++){
            System.out.println(i);
        }

        // using while loop
        System.out.println("Results using while loop");

        while(startNumber <= endNumber){
            System.out.println(startNumber);
            startNumber+=1;
        }

        // using do while loop

        System.out.println("Reslts using do while loop");
        do { 
            System.out.println(startNumber);
            startNumber+=1;
        } while (startNumber<=endNumber);

        
        


    }
}

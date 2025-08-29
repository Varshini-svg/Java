import java.util.Scanner;

public class dataTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int intVal = sc.nextInt();

        System.out.print("Enter a character: ");
        char charVal = sc.next().charAt(0);

        System.out.print("Enter a string: ");
        String strVal = sc.next();

        System.out.print("Enter a double: ");
        double doubleVal = sc.nextDouble();

        System.out.print("Enter a float: ");
        float floatVal = sc.nextFloat();

        System.out.print("Enter a boolean: ");
        boolean boolVal = sc.nextBoolean();

        System.out.print("Enter a long integer: ");
        long longVal = sc.nextLong();

        // Display the values
        System.out.println("\n--- Displaying Entered Values ---");
        System.out.println("Integer: " + intVal);
        System.out.println("Character: " + charVal);
        System.out.println("String: " + strVal);
        System.out.println("Double: " + doubleVal);
        System.out.println("Float: " + floatVal);
        System.out.println("Boolean: " + boolVal);
        System.out.println("Long Integer: " + longVal);
    }
}

import java.util.Scanner;
public class caseChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the character to check the case: ");
        char ch = in.next().trim().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase: "+ch);
        }
        else {
            System.out.println("Uppercase: "+ch);
        }

    }
}

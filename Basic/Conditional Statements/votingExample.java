import java.util.Scanner;
public class votingExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name of the canditate:");
        String name = sc.next();
        System.out.println("enter the age of the canditate:");
        int age = sc.nextInt();
        System.out.println("enter the registration status of the canditate (true/false):");
        boolean registered = sc.nextBoolean();
       
        if(age>=18 && registered==true){
            System.out.println("The Canditate name "+name+" is of age "+age+" whose registration status is "+registered+" is eligible to vote");
        }
        else{
            System.out.println("The Canditate name "+name+" is of age "+age+" whose registration status is "+registered+" is not eligible to vote");
        }

    }
}

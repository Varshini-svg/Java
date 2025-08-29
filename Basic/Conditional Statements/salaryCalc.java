import java.util.Scanner;

public class salaryCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input section
        System.out.print("Enter the name of the candidate: ");
        String empName = sc.next();

        System.out.print("Enter the name of the company: ");
        String compName = sc.next();

        System.out.print("Enter the job role (developer/tester): ");
        String empRole = sc.next(); // Normalize input

        System.out.print("Enter the employee ID: ");
        int empId = sc.nextInt();

        System.out.print("Enter the basic salary: ");
        float empSalary = sc.nextFloat();

        System.out.print("Enter the salary slab (1, 2, or 3): ");
        int empSlab = sc.nextInt();

        // Salary calculation using if-else if
        if (empRole.equals("developer")) {
            if (empSlab == 1) {
                empSalary += 50000;
            } else if (empSlab == 2) {
                empSalary += 25000;
            } else if (empSlab == 3) {
                empSalary += 10000;
            } else {
                System.out.println("Invalid salary slab entered.");
            }
        } else if (empRole.equals("tester")) {
            if (empSlab == 1) {
                empSalary += 20000;
            } else if (empSlab == 2) {
                empSalary += 15000;
            } else if (empSlab == 3) {
                empSalary += 5000;
            } else {
                System.out.println("Invalid salary slab entered.");
            }
        } else {
            System.out.println("Invalid job role entered.");
        }

        // Output section
        System.out.println("\n--- Salary Details ---");
        System.out.println("Candidate Name: " + empName);
        System.out.println("Company Name: " + compName);
        System.out.println("Employee ID: " + empId);
        System.out.println("Job Role: " + empRole);
        System.out.println("Salary Slab: " + empSlab);
        System.out.println("Final Salary after increment: ₹" + empSalary);

        sc.close();
    }
}


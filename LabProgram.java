import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nameParts;

        // Read the full name as a single line
        String fullName = scanner.nextLine();

        // Split the full name into parts
        nameParts = fullName.split(" ");

        // Format the output based on the number of name parts
        if (nameParts.length == 3) { // firstName middleName lastName
            System.out.println(nameParts[2] + ", " + nameParts[0].charAt(0) + "." + nameParts[1].charAt(0) + ".");
        } else if (nameParts.length == 2) { // firstName lastName
            System.out.println(nameParts[1] + ", " + nameParts[0].charAt(0) + ".");
        } else {
            System.out.println("Invalid input");
        }
    }
}

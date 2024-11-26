import java.util.Scanner;

// Custom Exception Class
class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

public class EmailValidator {
    // Method to validate email
    public static void validateEmail(String email) throws InvalidEmailException {
        // Check if email contains @
        if (!email.contains("@")) {
            throw new InvalidEmailException("Invalid email: '@' is missing.");
        }

        // Check if email contains .
        if (!email.contains(".")) {
            throw new InvalidEmailException("Invalid email: '.' is missing.");
        }

        // Check if . is not the last char
        if (email.endsWith(".")) {
            throw new InvalidEmailException("Invalid email: '.' should not be the last character.");
        }

        // Check if @ is not the last char
        if (email.endsWith("@")) {
            throw new InvalidEmailException("Invalid email: '@' should not be the last character.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();
        scanner.close();

        try {
            validateEmail(email);
            System.out.println("Email is valid.");
        } catch (InvalidEmailException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

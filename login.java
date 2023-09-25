import java.util.Scanner;
public class login {
    public static void main(String[] args) {
        // Define the correct username and password
        String correctUsername = "USER";
        String correctPassword = "USER123";

        // Initialize the number of login attempts
        int attempts = 0;

        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Allow the user three login attempts
        while (attempts < 3) {
            System.out.print("Enter your username: ");
            String username = scanner.nextLine();

            System.out.print("Enter your password: ");
            String password = scanner.nextLine();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Login successful!");
                break;
            } else {
                System.out.println("Login failed. Please try again.");
                attempts++;
            }
        }

        if (attempts == 3) {
            System.out.println("You have exceeded the maximum number of login attempts.");
        }
    }
}



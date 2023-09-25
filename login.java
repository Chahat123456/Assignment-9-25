import java.util.Scanner;
public class login {
    public static void main(String[] args) {
        String correctUsername = "USER";
        String correctPassword = "USER123";

       
        int attempts = 0;

    
        Scanner scanner = new Scanner(System.in);

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



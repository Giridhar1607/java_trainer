package Day12javaExcaption;
import java.util.InputMismatchException;
import java.util.Scanner;


class InvalidUserIdException extends Exception {
    public InvalidUserIdException(String msg) {
        super(msg); }
}
class WeakPasswordException extends Exception {
    public WeakPasswordException(String msg) {
        super(msg); }
}
class AccountLockedException extends Exception {
    public AccountLockedException(String msg) {
        super(msg); }
}

public class LoginSystem {


    public static void login(String userId, String password) throws InvalidUserIdException, WeakPasswordException {
        if (userId == null || userId.trim().isEmpty() || password == null || password.trim().isEmpty()) {
            throw new InvalidUserIdException("User ID or Password cannot be empty/null");
        }
        if (userId.length() < 5) {
            throw new InvalidUserIdException("User ID must be at least 5 characters");
        }
        if (password.length() < 8 ||!password.matches(".*\\d.*") ||!password.matches(".*[A-Z].*")) {
            throw new WeakPasswordException("Weak Password: Must be 8+ chars, with 1 digit and 1 uppercase");
        }

        if (!(userId.equals("admin123") && password.equals("Admin1234"))) {
            throw new InvalidUserIdException("Incorrect credentials");
        }
        System.out.println("Login Successful! Welcome " + userId);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int attempts = 0;
        final int MAX_ATTEMPTS = 3;
        boolean loggedIn = false;

        while (attempts < MAX_ATTEMPTS &&!loggedIn) {
            attempts++;
            try {
                System.out.println("--- Attempt " + attempts + " ---");
                System.out.print("1. Login 2. Exit - Choose: ");
                int choice = sc.nextInt();
                sc.nextLine(); // consume newline

                if (choice == 2) break;
                if (choice!= 1) throw new InputMismatchException("Invalid menu choice");

                System.out.print("Enter User ID: ");
                String userId = sc.nextLine();
                System.out.print("Enter Password: ");
                String password = sc.nextLine();

                login(userId, password);
                loggedIn = true;

            } catch (InvalidUserIdException e) {
                System.out.println("User ID Error: " + e.getMessage());
            } catch (WeakPasswordException e) {
                System.out.println("Password Error: " + e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Input Error: Please enter a number for menu.");
                sc.nextLine(); // clear buffer
            } catch (Exception e) {
                System.out.println("Unexpected Error: " + e.getMessage());
            } finally {
                System.out.println("Attempt finished - Attempt No: " + attempts);
                if (attempts == MAX_ATTEMPTS &&!loggedIn) {
                    try {
                        throw new AccountLockedException("Account locked after " + MAX_ATTEMPTS + " failed attempts!");
                    } catch (AccountLockedException ex) {
                        System.out.println(ex.getMessage());
                    }
                }
            }
        }
        sc.close();
    }
}

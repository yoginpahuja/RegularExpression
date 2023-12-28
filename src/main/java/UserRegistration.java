import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Use Case 1: Validate First Name
        System.out.print("Enter your First Name: ");
        String firstName = scanner.nextLine();
        if (validateFirstName(firstName)) {
            System.out.println("Valid First Name!");
        } else {
            System.out.println("Invalid First Name! Please enter a valid first name.");
        }

        // Use Case 2: Validate Last Name
        System.out.print("Enter your Last Name: ");
        String lastName = scanner.nextLine();
        if (validateLastName(lastName)) {
            System.out.println("Valid Last Name!");
        } else {
            System.out.println("Invalid Last Name! Please enter a valid last name.");
        }

        // Use Case 3: Validate Email
        System.out.print("Enter your Email: ");
        String email = scanner.nextLine();
        if (validateEmail(email)) {
            System.out.println("Valid Email!");
        } else {
            System.out.println("Invalid Email! Please enter a valid email address.");
        }

        // Use Case 4: Validate Mobile Number
        System.out.print("Enter your Mobile Number: ");
        String mobileNumber = scanner.nextLine();
        if (validateMobileNumber(mobileNumber)) {
            System.out.println("Valid Mobile Number!");
        } else {
            System.out.println("Invalid Mobile Number! Please enter a valid mobile number.");
        }

        // Use Case 5: Validate Password
        System.out.print("Enter your Password: ");
        String password = scanner.nextLine();
        if (validatePassword(password)) {
            System.out.println("Valid Password!");
        } else {
            System.out.println("Invalid Password! Please follow the password rules.");
        }

        scanner.close();
    }

    public static boolean validateFirstName(String firstName) {
        String firstNamePattern = "^[A-Z][a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(firstNamePattern);
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }

    public static boolean validateLastName(String lastName) {
        String lastNamePattern = "^[A-Z][a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(lastNamePattern);
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();
    }

    public static boolean validateEmail(String email) {
        // General email pattern
        String emailPattern = "^[a-zA-Z0-9]+([.+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,}){1,2}$";
        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean validateMobileNumber(String mobileNumber) {
        String mobileNumberPattern = "^\\d{2} \\d{10}$";
        Pattern pattern = Pattern.compile(mobileNumberPattern);
        Matcher matcher = pattern.matcher(mobileNumber);
        return matcher.matches();
    }

    public static boolean validatePassword(String password) {
        // Password rules: Minimum 8 characters, at least 1 uppercase, at least 1 numeric, and exactly 1 special character.
        String passwordPattern = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$";
        Pattern pattern = Pattern.compile(passwordPattern);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}

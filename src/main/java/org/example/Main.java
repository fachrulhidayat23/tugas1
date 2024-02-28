import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final Map<String, String> adminCredentials = new HashMap<>();
    private static final Map<String, String> studentCredentials = new HashMap<>();

    static {
        adminCredentials.put("admin", "admin");
        studentCredentials.put("202310370311338", "password338");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("<<<< Library Login >>>>");
            System.out.println("1. Login as Admin");
            System.out.println("2. Login as Student");
            System.out.println("3. Exit");

            System.out.print("Choose option (1-3): ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    adminLogin(scanner);
                    break;
                case 2:
                    studentLogin(scanner);
                    break;
                case 3:
                    System.out.println("Suon Cak (^o^)!");
                    return;
                default:
                    System.out.println("Gaada Pilihannya Cak (-_-)");
            }
        }
    }

    private static void adminLogin(Scanner scanner) {
        System.out.print("Enter Your Username: ");
        String username = scanner.nextLine();
        System.out.print("Enter Your Password: ");
        String password = scanner.nextLine();

        if (adminCredentials.containsKey(username) || adminCredentials.get(username).equals(password)) {
            System.out.println("Successful Login an Admin!! (^_^)");
        } else {
            System.out.println("Admin login failed!! (-_-)");
        }
    }

    private static void studentLogin(Scanner scanner) {
        System.out.print("Your Student NIM: ");
        String nim = scanner.nextLine();
        System.out.print("Your NIM Password: ");
        String password = scanner.nextLine();

        if (studentCredentials.containsKey(nim)) {
            System.out.println("Successful Login an Student!! (^_^)");
        } else {
            System.out.println("Student login failed!! (-_-)");
        }
    }
}

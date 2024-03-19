import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String adminUsername = "admin";
        String adminPassword = "admin";

        System.out.println("Library System\n");

        int option = 0;
        while (option != 3) {
            System.out.println("1. Login as Student");
            System.out.println("2. Login as Admin");
            System.out.println("3. Exit\n");
            System.out.print("Choose option (1-3): ");
            option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    System.out.print("\nEnter your NIM: ");
                    String nim = scanner.nextLine();
                    if (nim.length() == 15) {
                        System.out.println("Successful Login as Student\n");
                    } else {
                        System.out.println("User Not Found\n");
                    }
                    break;
                case 2:
                    System.out.print("\nEnter your username (admin): ");
                    String username = scanner.nextLine();
                    System.out.print("Enter your password (admin): ");
                    String password = scanner.nextLine();

                    if (username.equals(adminUsername) && password.equals(adminPassword)) {
                        System.out.println("\nSuccessful Login as Admin\n");
                    } else {
                        System.out.println("\nUser Not Found!!\n");
                    }
                    break;
                case 3:
                    System.out.println("\nadios");
                    break;
                default:
                    System.out.println("\nInvalid option\n");
                    break;
            }
        }
        scanner.close();
    }
}

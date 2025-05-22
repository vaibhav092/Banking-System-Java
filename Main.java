import Service.BankingService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankingService bankingService = new BankingService();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Banking System ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = input.nextInt();

            switch (choice) {
                case 1 -> bankingService.createAccount();
                case 2 -> bankingService.addMoney();
                case 3 -> bankingService.withdrawMoney();
                case 4 -> bankingService.getBalance();
                case 5 -> {
                    System.out.println("Exiting... Thank you!");
                    return;
                }
                default -> System.out.println("Invalid option, please try again.");
            }
        }
    }
}

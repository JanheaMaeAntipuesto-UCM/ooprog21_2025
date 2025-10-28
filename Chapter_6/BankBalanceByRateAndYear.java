import java.util.Scanner;

public class BankBalanceByRateAndYear {
    public static void main(String[] args) {
        double initialBalance;
        double balance;
        double interest;
        int year;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter initial bank balance > ");
        initialBalance = keyboard.nextDouble();

        for (interest = 0.02; interest <= 0.05; interest += 0.01) {
            balance = initialBalance;
            System.out.println("\nWith an initial balance of $" + balance +
                    " at an interest rate of " + interest);
            for (year = 1; year <= 4; year++) {
                balance = balance + balance * interest;
                System.out.println("After year " + year + " balance is $" + balance);
            }
        }

        keyboard.close();
    }
}

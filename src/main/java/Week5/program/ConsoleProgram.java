package Week5.program;

import Week5.bank.GalacticBank;

import java.util.Scanner;

// Kevin G Flores
// 2/6/26
// CS122
// This program simulates a bank database but in space with aliens!

public class ConsoleProgram
{
    public static void main(String[] args)
    {
        // Welcome Message
        System.out.println();
        System.out.println("   .--.    Galactic Bank");
        System.out.println("  |o_o |      ________");
        System.out.println("  |:_/ |     |   __   |");
        System.out.println(" //   \\ \\    |  |__|  |");
        System.out.println("(|     | )   |________|");
        System.out.println("/'\\_   _/`\\");
        System.out.println("    \\_/");
        System.out.println("\nBeware of the alien!");
        System.out.println("\n*********************");
        System.out.println("*   Galactic Bank   *");
        System.out.println("*   Trusted Across  *");
        System.out.println("*   the Universe    *");
        System.out.println("*********************");
        System.out.println();

        Scanner askInfo = new Scanner(System.in);
        System.out.println("Choose an option: ");
        System.out.println("Press 1 to print Galactic Bank Account");
        System.out.println("Press 2 to print Galactic Bank Transactions");
        System.out.println("Press 3 to print Galactic Bank Workers");
        System.out.println("Press 4 to exit.");
        System.out.println("Enter your choice: ");

        String accountPath = "src/main/java/Week5/banking-files/accounts.csv";
        String transactionsPath = "src/main/java/Week5/banking-files/transactions.csv";
        String workersPath = "src/main/java/Week5/banking-files/workers.csv";
        boolean consoleStatus = false;

        while(!consoleStatus){
            int typedNumber = askInfo.nextInt();
            GalacticBank bankRequest = new GalacticBank();

            while (typedNumber != 1 && typedNumber !=2 && typedNumber !=3 && typedNumber !=4 ){
                System.out.println("Retype your input: ");
                typedNumber = askInfo.nextInt();
            }

            if(typedNumber == 1){
                bankRequest.readAccountsFromFile(accountPath);
                bankRequest.displayAccounts();
                System.out.println("Choose an option: ");
                System.out.println("Press 1 to print Galactic Bank Account");
                System.out.println("Press 2 to print Galactic Bank Transactions");
                System.out.println("Press 3 to print Galactic Bank Workers");
                System.out.println("Press 4 to exit.");
                System.out.println("Enter your choice: ");
            } else if(typedNumber == 2){
                bankRequest.readTransactionsFromFile(transactionsPath);
                bankRequest.displayTransactions();
                System.out.println("Choose an option: ");
                System.out.println("Press 1 to print Galactic Bank Account");
                System.out.println("Press 2 to print Galactic Bank Transactions");
                System.out.println("Press 3 to print Galactic Bank Workers");
                System.out.println("Press 4 to exit.");
                System.out.println("Enter your choice: ");
            } else if(typedNumber == 3){
                bankRequest.readWorkersFromFile(workersPath);
                bankRequest.displayWorkers();
                System.out.println("Choose an option: ");
                System.out.println("Press 1 to print Galactic Bank Account");
                System.out.println("Press 2 to print Galactic Bank Transactions");
                System.out.println("Press 3 to print Galactic Bank Workers");
                System.out.println("Press 4 to exit.");
                System.out.println("Enter your choice: ");
            } else {
                System.out.println("System closed.");
                askInfo.close();
                consoleStatus = true;
            }
        }
    }
}
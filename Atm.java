public class Atm {
    // TODO: Add enum AccountHolder to determine which options are available
    static final String PIN = "123123";
    public static void main(String[] args) {

        double balance = 0.0;
        boolean isRunning = true;

        System.out.println("====================");
        System.out.println("=     Java ATM     =");
        System.out.println("====================");

        String userPin = System.console().readLine("Please enter pin: ");
        String welcomeMessage = userPin.equals(PIN)
            ? "Welcome! Please choose one of the options below by entering the respective option number."
            : "You have entered an incorrect pin. Please try again, goodbye!";
        System.out.println(welcomeMessage);
        if (!userPin.equals(PIN)) {
            return;
        }

        do {
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit\n");
            
            String userInput = System.console().readLine("Option: ");
    
            switch (userInput) {
                case "1": {
                    System.out.println("== Check Balance ===");
                    System.out.println("====================");
                    System.out.println("You have " + balance + " in your balance\n");
                    break;
                }
                case "2": {
                    System.out.println("== Deposit Money ===");
                    System.out.println("====================");
                    double amountToDeposit = Double.parseDouble(System.console().readLine("Enter amount to deposit: "));
                    // TODO: check if user input numbers
                    balance += amountToDeposit;
                    System.out.println("Deposit successful! You now have " + balance + " in your balance\n");
                    break;
                }
                case "3": {
                    System.out.println("== Withdraw Money ==");
                    System.out.println("====================");
                    double amountToWithdraw = Double.parseDouble(System.console().readLine("Enter amount to withdraw: "));
                    // TODO: check if user input numbers
                    String message;
                    if (amountToWithdraw <= balance) {
                        balance -= amountToWithdraw;
                        message = "Withdraw successful! You now have " + balance + " in your balance";
                    } else {
                        message = "Withdraw unsuccessful! You have insufficient funds in your balance for withdrawl of " + amountToWithdraw
                            + "\nCurrent balance: " + balance;
                    }
                    System.out.println(message + "\n");
                    break;
                }
                case "4": {
                    System.out.println("=== Exiting App ====");
                    isRunning = false;
                    break;
                }
                default: {
                    System.out.println("Invalid Input! Please enter a number between 1 to 4.\n");
                }
            }
        } while (isRunning);

    }
}

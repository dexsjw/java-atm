public class Atm {
    static final String PIN = "123123";
    public static void main(String[] args) {

        double balance = 0.0;
        boolean isRunning = true;

        System.out.println("=====================");
        System.out.println("=     Dex's ATM     =");
        System.out.println("=====================");

        String userPin = System.console().readLine("Please enter pin: ");
        if (!userPin.equals(PIN)) {
            System.out.println("You have entered an incorrect pin. Please try again, goodbye!");
            return;
        }

        do {
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            
            String userInput = System.console().readLine("Option: ");
    
            switch (userInput) {
                case "1": {
                    System.out.println("Check Balance");
                    System.out.println("=====================");
                    System.out.println("You have " + balance + " in your balance");
                    break;
                }
                case "2": {
                    System.out.println("Deposit Money");
                    System.out.println("=====================");
                    double amountToDeposit = Double.parseDouble(System.console().readLine("Enter amount to deposit: "));
                    balance += amountToDeposit;
                    System.out.println("Deposit successful! You now have " + balance + " in your balance");
                    break;
                }
                case "3": {
                    System.out.println("Withdraw Money");
                    System.out.println("=====================");
                    double amountToWithdraw = Double.parseDouble(System.console().readLine("Enter amount to withdraw: "));
                    String message = amountToWithdraw > balance ? "Withdraw successful!" : "Withdraw unsuccessful! You have insufficient funds in your balance";
    
                    break;
                }
                case "4": {
                    System.out.println("Exiting App");
                    isRunning = false;
                    break;
                }
                default: {
                    System.out.println("Invalid Input! Please enter a number between 1 to 4.");
                }
            }
        } while (isRunning);

    }
}

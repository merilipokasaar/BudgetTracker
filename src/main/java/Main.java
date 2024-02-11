import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to the Budget Tracker!");
        System.out.println("Let's begin!");

        BudgetTracker budgetTracker = new BudgetTracker();
        Scanner scanner = new Scanner(System.in);

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Enter your income:");
        double initialMonthlyIncome = scanner.nextDouble();

        double totalIncome = initialMonthlyIncome;
        double totalExpenses = 0.0;

        System.out.println("Please enter your savings goal(%): ");
        double goalPercentage = scanner.nextDouble();
        if (goalPercentage <= 0) {
            System.out.println("Be ambitious! Choose a bigger savings goal!");
            scanner.nextLine();

            scanner.nextLine();
        } else {
            System.out.println("That's a great goal!");
        }


        while (true) {

            try {
                // Delay for 1 second
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Menu:");
            System.out.println("1. Add additional income");
            System.out.println("2. Add an expense");
            System.out.println("3. Check current savings status");
            System.out.println("4. Exit");


            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter additional income: ");
                    double additionalIncome = scanner.nextDouble();
                    totalIncome += additionalIncome;
                    System.out.println("Additional income added successfully. Total of your earnings this month is: " + totalIncome + " euros");
                    break;
                case 2:
                    System.out.print("Enter expense: ");
                    double expense = scanner.nextDouble();
                    totalExpenses += expense;
                    System.out.println("Expense added successfully. Total of your expenses this month is: " + totalExpenses + " euros");
                    break;
                case 3:
                    double savingsPercentage = Math.round(100 - (totalExpenses * 100 / totalIncome));
                    double savingsAmount = Math.round(totalIncome - totalExpenses);
                    System.out.println("At the moment your savings percentage is " + savingsPercentage + "% and you have saved " + savingsAmount + " euros");
                    if (savingsPercentage < goalPercentage) {
                        System.out.println("Your expenses are too high! Try to save more.");
                    } else {
                        System.out.println("Well done! You are on the right track!");
                    }
                    break;
                case 4:
                    System.out.println("Exiting Budget Tracker. See you!");
                    return;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                    break;

            }
        }

    }
}

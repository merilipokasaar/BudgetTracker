public class BudgetTracker {

    //public double monthlyIncome;
    public double totalExpenses;
    public double totalIncome;
    //public double additionalIncome;
    public double goalPercentage;
    //public double monthlyExpenses;


    //public void setGoalPercentage(double goalPercentage) {
    // if (goalPercentage <= 0) {
    //System.out.println("Be ambitious! Choose a bigger savings goal!");
    //} else {
    //this.goalPercentage = goalPercentage;
    //System.out.println("That's a great goal!");
    //}
    //}

    public double calculateGoalSavingsAmount() {
        return totalIncome * goalPercentage / 100;
    }

    //public double calculateAmountToSpend() {
    //return totalIncome - calculateGoalSavingsAmount();
    //}

    public void checkSavingsProgress() {
        double savingsPercentage = 100 - (totalExpenses * 100 / totalIncome);
        System.out.println("At the moment your savings percentage is " + savingsPercentage + "%");
        if (savingsPercentage < goalPercentage) {
            System.out.println("Your expenses are too high! Try to save more.");
        } else {
            System.out.println("Well done! You are on the right track!");
        }
    }
}


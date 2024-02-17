
import org.junit.jupiter.api.Test;

// What needs testing:
// 1. testStart
// 2. addAdditionalIncome method
// 3. addExpense method
// 4. getPositiveNumberInput

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
public class BudgetTrackerTest {

    private Object YourClassName;

    @Test
    void
    testStart() {

        BudgetTracker budgetTracker = new BudgetTracker();
        budgetTracker.start();

    }
    @Test
    public void testAddAdditionalIncome() {
        // Set up
        ByteArrayInputStream in = new ByteArrayInputStream("100\n".getBytes());
        System.setIn(in);
        Scanner scanner = new Scanner(System.in);
        double totalIncome = 500; // Initial total income

        // Invoke method
        YourClassName.addAdditionalIncome(scanner, totalIncome);

        // Verify the output
        assertEquals(600, totalIncome, 0.01); // Check if the total income is updated correctly
    }
}



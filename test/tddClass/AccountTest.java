package tddClass;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    @Test
    @DisplayName("This is a Test for Withdrawing Money and Decreasing the currentAmount")
    public void withdrawalNote() {
        // Given
        Account davidAccount = new Account();
        // When
        davidAccount.withdrawal(5000);
        // Check
        assertEquals(2000, davidAccount.getBalance());
    }



    //   TODO - Create Test for Negative Deposit
    @Test
    @DisplayName("This is a Test for Negative Deposit")
    public void negativeDeposit() {
        // Given
        Account davidAccount = new Account();
        // When
        davidAccount.negativeDeposit(5000);
        // Check
        assertEquals(2000, davidAccount.newDepositBal());
    }
}




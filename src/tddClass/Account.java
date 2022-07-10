package tddClass;

public class Account {
    private int currentMoney = 5000;
    private int withdraw = 3000;
    private int balance;
    private  int negDeposit = -3000;
    public void withdrawal(int amount) {
        balance = currentMoney - withdraw;
    }
    public void negativeDeposit(int amount) {
        balance = currentMoney + negDeposit;
    }
    public int getBalance() {
        return balance;
    }
    public int newDepositBal() {
        if (currentMoney == 5000 && negDeposit == -3000) {
        }
        return balance;
    }
}

/*
@Test
public void subtractTest(){
Kata kata = new kata();
assertEquals(expected: 8, kata.add(10, 2));
}

 */

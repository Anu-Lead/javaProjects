import java.security.SecureRandom;

public class Craps {
    private static final SecureRandom randomNumbers = new SecureRandom();

    private enum Status {CONTINUE, WON, LOST}

    private static final int SNAKE_EYES = 2;
    private static final int DOVE = 3;
    private static final int SEVEN_EAGLE = 7;
    private static final int HI_LEVEN = 11;
    private static final int BOXING_FIST = 12;

    public static void main(String[] args) {
        int myPoint = 0;
        Status gameStatus;

        int sumOfDice = rolledDice();

        switch (sumOfDice) {
            case SEVEN_EAGLE:
            case HI_LEVEN:
                gameStatus = Status.WON;
                break;

            case DOVE:
            case SNAKE_EYES:
            case BOXING_FIST:
                gameStatus = Status.LOST;
                break;

            default:
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                System.out.printf("Point is %d%n", myPoint);
                break;
        }
        while (gameStatus == Status.CONTINUE) {
            sumOfDice = rolledDice();

            if (sumOfDice == myPoint) {
                gameStatus = Status.WON;
            } else if (sumOfDice == SEVEN_EAGLE) {
                gameStatus = Status.LOST;
            }
        }
        if (gameStatus == Status.WON) {
        System.out.println("Congratulations, You Won");
    } else {
        System.out.println("Try Later, You Lose");
    }
}
    public static int rolledDice() {
        int firstDie = 1 + randomNumbers.nextInt(6);
        int secondDie = 1 + randomNumbers.nextInt(6);

        int sum = firstDie + secondDie;
        System.out.printf("You Rolled %d + %d = %d%n", firstDie, secondDie, sum);
        return sum;
    }
}




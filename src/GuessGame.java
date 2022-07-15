import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, Enter the Exact Number");
        int actualNumber = input.nextInt();
        if (actualNumber > 77) {
            System.out.println("You're Wrong. The number you entered is too BIG!");
            System.out.println("Please, re-enter exact Number");
           input.nextInt();
        } else
        if (actualNumber < 77) {
            System.out.println("The number you entered is LESS");
            System.out.println("Please, re-enter exact Number");
            input.nextInt();
        } else
        if (actualNumber == 77) {
                    System.out.println("BRAVO! Congratulations");
                    System.out.println("Game End");
                }
            }
}






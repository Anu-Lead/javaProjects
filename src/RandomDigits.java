import java.security.SecureRandom;

public class RandomDigits {
    public static void main(String[] args) {
        SecureRandom randomNumber = new SecureRandom();
        for (int student = 0; student < 20; student++) {
            int books = randomNumber.nextInt(10);

            System.out.println(books);

            if (student % 3 == 1) {
                System.out.println();
            }
        }
    }
}


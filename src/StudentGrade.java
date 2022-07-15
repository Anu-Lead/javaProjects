import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        System.out.println("Please, Enter Your Score to Determine your Letter Grade");
        for (int grades = 1; grades <= 6; grades++) {
            Scanner input = new Scanner(System.in);
            int grade = input.nextInt(); {
                switch (grade) {
                    case 90 -> System.out.println("Your Grade is A");
                    case 60 -> System.out.println("Your Grade is B");
                    case 50 -> System.out.println("Your Grade is C");
                    case 40 -> System.out.println("Your Grade is D");
                    case 30 -> System.out.println("Your Grade is E");
                    case 20 -> System.out.println("Your Grade is F");
                    default -> System.out.println("You Don't Have Any Grade this Semester");
                }
            }
        }
    }

}

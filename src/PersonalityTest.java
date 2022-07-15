import java.util.*;
import java.util.function.Predicate;

import static java.util.Arrays.*;
//import java.util.Comparator;

public class PersonalityTest {
    public static void main(String[] args) {
        ArrayList<String> personalityQuestions = new ArrayList<String>();

        personalityQuestions.add(0, "\nQuestion 1.  (A). Expand, Energy, Enjoy Group. (B). Conservative Energy, Enjoy One-on-One\n");
        personalityQuestions.add(1, "\nQuestion 2.  (A). Interpret Literally. (B). Look for Meaning & Possibilities\n");
        personalityQuestions.add(2, "\nQuestion 3.  (A). Logical, Thinking, Questioning. (B). Empathetic, Feeling, Accommodating\n");
        personalityQuestions.add(3, "\nQuestion 4.  (A). Organized, Orderly. (B). ELook for Meaning & Possibilities\n");
        personalityQuestions.add(4, "\nQuestion 5.  (A). More Outgoing, Think-Out-Loud. (B). More Reserved, Think-to-Myself\n");
        personalityQuestions.add(5, "\nQuestion 6.  (A). Practical, Realistic, Experiential. (B). Imaginative, Innovative, Theoretical\n");
        personalityQuestions.add(6, "\nQuestion 7.  (A). Candid, Straightforward, Frank. (B). Tactful, Kind, Encouraging\n");
        personalityQuestions.add(7, "\nQuestion 8.  (A). Plan, Schedule. (B). Look for Meaning & Possibilities\n");
        personalityQuestions.add(8, "\nQuestion 9.  (A). Seek Many Tasks, Public Activities, Interaction with Others. (B). Seek Private, Solitary Activities with Quiet to Concentrate\n");
        personalityQuestions.add(9, "\nQuestion 10.  (A). Standard, Usual, Conventional. (B). Different, Novel, Unique\n");
        personalityQuestions.add(10, "\nQuestion 11.  (A). Firm, Tend to Criticize, Hold Lines. (B). Gentle, Tend to Appreciate, Conciliate\n");
        personalityQuestions.add(11, "\nQuestion 12.  (A). Regulated, Structured. (B). Easy-going, Live & Let Go\n");
        personalityQuestions.add(12, "\nQuestion 13.  (A). External, Communicative, Express Yourself. (B). Internal, Reticent, Keep to Yourself\n");
        personalityQuestions.add(13, "\nQuestion 14.  (A). Focus on Here-and-Now. (B). Look to the Future, Global Perspective, Big Picture\n");
        personalityQuestions.add(14, "\nQuestion 15.  (A). Tough Minded, Just. (B). Tender-Hearted, Merciful.\n");
        personalityQuestions.add(15, "\nQuestion 16.  (A). Preparation, Plan Ahead. (B). Go with the Flow, Adapt as you Go.\n");
        personalityQuestions.add(16, "\nQuestion 17.  (A). Active, Initiate. (B). Reflective Deliberate\n");
        personalityQuestions.add(17, "\nQuestion 18.  (A). Facts, Things, What Is. (B). Ideas, Dreams, What Could Be, Philosophical\n");
        personalityQuestions.add(18, "\nQuestion 19.  (A). Matter of fact, Issue-Oriented. (B). Sensitive, People-Oriented, Compassionate.\n");
        personalityQuestions.add(19, "\nQuestion 20.  (A). Control, Govern. (B). Latitude, Freedom.\n");


        System.out.println("\n=======================WELCOME TO YOUR PERSONALITY TEST=========================");
        Date date = new Date();
        Scanner takersName = new Scanner(System.in);
        System.out.println("First Name & Last Name:");
        Scanner takerAge = new Scanner(System.in);
        takerAge.next();
        System.out.println("Age:");
        takersName.next();
        System.out.println("Signature:");
        takersName.next();
        System.out.println("Assessment Date & Time:");
        System.out.println(date);
        System.out.println("THANK YOU");
        System.out.println("================================================================================");


        System.out.println("Instruction:\nPlease Answer the Following Questions Carefully as Applicable to You.\nCHOOSE A or B ======>\nStart Now!");
        System.out.println("================================================================================\n");

        for (int i = 0; i < personalityQuestions.size(); i++) {
            System.out.printf("%s", personalityQuestions.get(i));
            final Scanner takersResponse = new Scanner(System.in);
            takersResponse.next();
        }


        ArrayList<String> personalityTypeA = new ArrayList<String>();
        personalityTypeA.add(0, "A");
        personalityTypeA.add(1, "A");
        personalityTypeA.add(2, "A");
        personalityTypeA.add(3, "A");
        personalityTypeA.add(4, "A");
        personalityTypeA.add(5, "A");
        personalityTypeA.add(6, "A");
        personalityTypeA.add(7, "A");
        personalityTypeA.add(8, "A");
        personalityTypeA.add(9, "A");
        personalityTypeA.add(10,"A");
        personalityTypeA.add(11,"A");
        personalityTypeA.add(12,"A");
        personalityTypeA.add(13,"A");
        personalityTypeA.add(14,"A");
        personalityTypeA.add(15,"A");
        personalityTypeA.add(16,"A");
        personalityTypeA.add(17,"A");
        personalityTypeA.add(18,"A");
        personalityTypeA.add(19,"A");

//        String[] personalityTypeA = {"A", "B", "A", "B", "A", "B", "A", "B", "A", "B", "A", "B", "A", "B", "A", "B", "A", "B", "A", "B"};
//        String[] takersInput = personalityTypeA.toArray(new String[0]);

        String[][] takersInputs = new String[20][1];
        System.out.println(takersInputs.length + personalityTypeA.get(0));
        for (int check = 0; check < takersInputs.length; check ++) {
            if (stream(takersInputs).allMatch((Predicate<? super String[]>) personalityTypeA))
                System.out.println("Your Personality Type is INJF");
        }




















//        private static Object takersResponse (String analyseRes){
//            Scanner inputResponse = new Scanner(System.in);
////        for (inputResponse.next() < takersResponse(A); takersResponse(1) )
//            if (inputResponse.equals("A") && inputResponse.equals("A") && inputResponse.equals("A")) {
//                System.out.println("Your Personality Type is INFJ");
//            } else if (inputResponse.equals("B") && inputResponse.equals("B") && inputResponse.equals("B")) {
//                System.out.println("Your Personality Type is FJNP");
//            }
//            return takersResponse(analyseRes);
//        }
    }
}












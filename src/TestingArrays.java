import java.util.Arrays;
import java.util.IllegalFormatConversionException;

public class TestingArrays {
    public static void main(String[] args) {
//        int [] numbers = new int[5];
////        int[] numbers = {5, 7, 3, 1, 9};
//        try {
//            numbers[0] = 88;
//            numbers[1] = 53;
//            numbers[2] = 28;
//            numbers[3] = 90;
//            numbers[4] = 75;
//            numbers[5] = 10;
//        } catch (ArrayIndexOutOfBoundsException exception) {
//            String message = exception.getMessage();
//            System.out.println(message);
//        }
//
//
//        for(int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }

        int [] allChurchMembers = {122, 180, 225, 101, 524, 86, 90, 305, 62, 81, 109};
        int total = 0;

    for (int parish = 0; parish < allChurchMembers.length; parish++) {
        total += allChurchMembers[parish];
        }
        System.out.printf("The Total Church Members in all Parish is ==> %d%n", total);
    }


}


/*
Array initializer initialize your elements at creation
Example Below|
int [] numbers = {5, 7, 3, 1, 9};

        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println(numbers.length);
 */

/*
MULTI-DIMENSIONAL ARRAYS
int[][] grades = new int[3][3];


Multidimensional arrays loop through both rows and columns.
You must always have rows. When looping, you will use nested loops most times.
First loop will loop through the rows, while others will loop through the columns.
 */




















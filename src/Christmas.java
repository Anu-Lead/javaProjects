import java.util.Scanner;

public class Christmas {
    static int day1;
    static int dayOneLyric;
    static int day2;
    static int dayTwoLyric;
    static int day3;
    static int dayThreeLyric;
    static int day4;
    static int dayFourLyric;
    static int day5;
    static int dayFiveLyric;
    static int day6;
    static int daySixLyric;
    static int day7;
    static int daySevenLyric;
    static int day8;
    static int dayEightLyric;
    static int day9;
    static int dayNineLyric;
    static int day10;
    static int dayTenLyric;
    static int day11;
    static int dayElevenLyric;
    static int day12;
    static int dayTwelveLyric;

    public static void main(String[] args) {
        for (int song = 1; song >= 1; song++) {
            Scanner input = new Scanner(System.in);
            System.out.printf("%s%n %s%n", "CHRISTMAS SONG: THE 12 DAYS OF CHRISTMAS", "Press 1 for Day 1");
            day1 = input.nextInt();
            switch (day1) {
                case 1:
                    System.out.println("FIRST DAY");
                    System.out.println("Press 0 to view the verse...");

                    input.nextInt();
                    switch (dayOneLyric) {
                        case 0:
                            System.out.printf("%s%n %s%n %s%n %s%n %n", "On the First Day of Christmas", "My true love sent to me,", "A Partridge in a Pear Tree.", "End!");
                            break;
                        default:
                            System.out.println("Incorrect Input, ==> Press 2 for Day 2 ==>");
                    }
//            }

                    System.out.println("Press 2 for Day Two");
                    day2 = input.nextInt();
                    switch (day2) {
                        case 2:
                            System.out.println("SECOND DAY");
                            System.out.println("Press 0 to view the verse...");

                            input.nextInt();
                            switch (dayTwoLyric) {
                                case 0:
                                    System.out.printf("%s%n %s%n %s%n %s%n %s%n %n", "On the Second Day of Christmas", "My true love gave to me:", "Two Turtle Doves", "And a Partridge in a Pear Tree.", "End!");
                                    break;
                                default:
                                    System.out.println("Incorrect Input, ==> Press 3 for Day 3 ==>");
                            }
                    }

                    System.out.println("Press 3 for Day Three");
                    day3 = input.nextInt();
                    switch (day3) {
                        case 3:
                            System.out.println("THIRD DAY");
                            System.out.println("Press 0 to view the verse...");

                            input.nextInt();
                            switch (dayThreeLyric) {
                                case 0:
                                    System.out.printf("%s%n %s%n %s%n %s%n %s%n %s%n %n", "On the Third Day of Christmas", "My true love gave to me:", "Three French Hens", "Two Turtle Doves", "And a Partridge in a Pear Tree.", "End!");
                                    break;
                                default:
                                    System.out.println("Incorrect Input, ==> Press 4 for Day 4 ==>");
                            }
                    }

                    System.out.println("Press 4 for Day Four");
                    day4 = input.nextInt();
                    switch (day4) {
                        case 4:
                            System.out.println("FOURTH DAY");
                            System.out.println("Press 0 to view the verse...");

                            input.nextInt();
                            switch (dayFourLyric) {
                                case 0:
                                    System.out.printf("%s%n %s%n %s%n %s%n %s%n %s%n %s%n %n", "On the Fourth Day of Christmas", "My true love gave to me:", "Four Calling Birds", "Three French Hens", "Two Turtle Doves", "And a Partridge in a Pear Tree.", "End!");
                                    break;
                                default:
                                    System.out.printf("%s%n%s%n", "Incorrect Input", "Press 5 for Day 5");
                            }
                    }

                    System.out.println("Press 5 for Day Five");
                    day5 = input.nextInt();
                    switch (day5) {
                        case 5:
                            System.out.println("FIFTH DAY");
                            System.out.println("Press 0 to view the verse...");

                            input.nextInt();
                            switch (dayFiveLyric) {
                                case 0:
                                    System.out.printf("%s%n %s%n %s%n %s%n %s%n %s%n %s%n %s%n %n", "On the Fifth Day of Christmas", "My true love gave to me:", "Five Golden Rings", "Four Calling Birds", "Three French Hens", "Two Turtle Doves", "And a Partridge in a Pear Tree.", "End!");
                                    break;
                                default:
                                    System.out.printf("%s%n%s%n", "Incorrect Input", "Press 6 for Day 6");
                            }
                    }

                    System.out.println("Press 6 for Day Six");
                    day6 = input.nextInt();
                    switch (day6) {
                        case 6:
                            System.out.println("SIXTH DAY");
                            System.out.println("Press 0 to view the verse...");

                            input.nextInt();
                            switch (daySixLyric) {
                                case 0:
                                    System.out.printf("%s%n %s%n %s%n %s%n %s%n %s%n %s%n %s%n %s%n %n", "On the Sixth Day of Christmas", "My true love gave to me:", "Six Geese a Laying", "Five Golden Rings", "Four Calling Birds", "Three French Hens", "Two Turtle Doves", "And a Partridge in a Pear Tree.", "End!");
                                    break;
                                default:
                                    System.out.printf("%s%n%s%n", "Incorrect Input", "Press 7 for Day 7");
                            }
                    }

                    System.out.println("Press 7 for Day Seven");
                    day7 = input.nextInt();
                    switch (day7) {
                        case 7:
                            System.out.println("SEVENTH DAY");
                            System.out.println("Press 0 to view the verse...");

                            input.nextInt();
                            switch (daySevenLyric) {
                                case 0:
                                    System.out.printf("%s%n %s%n %s%n %s%n %s%n %s%n %s%n %s%n %s%n %s%n %n", "On the Seventh Day of Christmas", "My true love gave to me:", "Seven Swans a Swimming", "Six Geese a Laying", "Five Golden Rings", "Four Calling Birds", "Three French Hens", "Two Turtle Doves", "And a Partridge in a Pear Tree.", "End!");
                                    break;
                                default:
                                    System.out.printf("%s%n%s%n", "Incorrect Input", "Press 8 for Day 8");
                            }
                    }

                    System.out.println("Press 8 for Day Eight");
                    day8 = input.nextInt();
                    switch (day8) {
                        case 8:
                            System.out.println("EIGHT DAY");
                            System.out.println("Press 0 to view the verse...");

                            input.nextInt();
                            switch (dayEightLyric) {
                                case 0:
                                    System.out.printf("%s%n %s%n %s%n %s%n %s%n %s%n %s%n %s%n %s%n %s%n %s%n %n", "On the Eighth Day of Christmas", "My true love gave to me:", "Eight Maids a Milking", "Seven Swans a Swimming", "Six Geese a Laying", "Five Golden Rings", "Four Calling Birds", "Three French Hens", "Two Turtle Doves", "And a Partridge in a Pear Tree.", "End!");
                                    break;
                                default:
                                    System.out.printf("%s%n%s%n", "Incorrect Input", "Press 9 for Day 9");
                            }
                    }

                    System.out.println("Press 9 for Day Nine");
                    day9 = input.nextInt();
                    switch (day9) {
                        case 9:
                            System.out.println("NINTH DAY");
                            System.out.println("Press 0 to view the verse...");

                            input.nextInt();
                            switch (dayNineLyric) {
                                case 0:
                                    System.out.printf("%s%n %s%n %s%n %s%n %s%n %s%n %s%n %s%n %s%n %s%n %s%n %s%n %n", "On the Ninth Day of Christmas", "My true love gave to me:", "Nine Ladies Dancing", "Eight Maids a Milking", "Seven Swans a Swimming", "Six Geese a Laying", "Five Golden Rings", "Four Calling Birds", "Three French Hens", "Two Turtle Doves", "And a Partridge in a Pear Tree.", "End!");
                                    break;
                                default:
                                    System.out.printf("%s%n%s%n", "Incorrect Input", "Press 10 for Day 10");
                            }
                    }

                    System.out.println("Press 10 for Day Ten");
                    day10 = input.nextInt();
                    switch (day10) {
                        case 10:
                            System.out.println("TENTH DAY");
                            System.out.println("Press 0 to view the verse...");

                            input.nextInt();
                            switch (dayTenLyric) {
                                case 0:
                                    System.out.printf("%s%n %s%n %s%n %s%n %s%n %s%n %s%n %s%n %s%n %s%n %s%n %s%n %s%n %n", "On the Tenth Day of Christmas", "My true love gave to me:", "Ten Lords a Leaping", "Nine Ladies Dancing", "Eight Maids a Milking", "Seven Swans a Swimming", "Six Geese a Laying", "Five Golden Rings", "Four Calling Birds", "Three French Hens", "Two Turtle Doves", "And a Partridge in a Pear Tree.", "End!");
                                    break;
                                default:
                                    System.out.printf("%s%n%s%n", "Incorrect Input", "Press 11 for Day 11");
                            }
                    }

                    System.out.println("Press 11 for Day Eleven");
                    day11 = input.nextInt();
                    switch (day11) {
                        case 11:
                            System.out.println("ELEVENTH DAY");
                            System.out.println("Press 0 to view the verse...");

                            input.nextInt();
                            switch (dayElevenLyric) {
                                case 0:
                                    System.out.printf("%s%n %s%n %s%n %s%n %s%n %s%n %s%n %s%n %s%n %s%n %s%n %s%n %s%n %s%n %n", "On the Eleventh Day of Christmas", "My true love gave to me:", "Eleven Pipers Piping", "Ten Lords a Leaping", "Nine Ladies Dancing", "Eight Maids a Milking", "Seven Swans a Swimming", "Six Geese a Laying", "Five Golden Rings", "Four Calling Birds", "Three French Hens", "Two Turtle Doves", "And a Partridge in a Pear Tree.", "End!");
                                    break;
                                default:
                                    System.out.printf("%s%n%s%n", "Incorrect Input", "Press 12 for Day 12");
                            }
                    }

                    System.out.println("Press 12 for Day Twelve");
                    day12 = input.nextInt();
                    switch (day12) {
                        case 12:
                            System.out.println("TWELFTH DAY");
                            System.out.println("Press 0 to view the verse...");

                            input.nextInt();
                            switch (dayTwelveLyric) {
                                case 0:
                                    System.out.printf("%s%n %s%n %s%n %s%n %s%n %s%n %s%n %s%n %s%n %s%n %s%n %s%n %s%n %s%n", "On the Twelfth Day of Christmas", "My true love gave to me:", "Twelve Drummers Drumming", "Eleven Pipers Piping", "Ten Lords a Leaping", "Nine Ladies Dancing", "Eight Maids a Milking", "Seven Swans a Swimming", "Six Geese a Laying", "Five Golden Rings", "Four Calling Birds", "Three French Hens", "Two Turtle Doves", "And a Partridge in a Pear Tree.");
                                    System.out.printf("%s%n%s%n", "THE END!", "THANK YOU.");
                                    break;
                                default:
                                    System.out.printf("%s%n%s%n", "THE END!", "Thank You.");
                            }
                    }
            }
        }
    }
}

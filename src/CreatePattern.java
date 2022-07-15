public class CreatePattern {
    public static void main(String[] args) {
//        System.out.println("Hey! Input the Number of Stars You Want?");
//        Scanner input = new Scanner(System.in);
//        int numOfStarsNeeded = input.nextInt();             - minus 1

        /*
        for (int stars = 1; stars <= 7; stars++) {
            for (int pattern = 0; pattern < stars; pattern++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int stars = 6; stars > 0; stars--) {
            for (int pattern = 0; pattern < stars; pattern++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    */

        /*

// LEFT SIDE TRIANGLE
int count = 10;
        for (int a = 1; a <= count; a++ ) {
            for (int b = a; b <= count; b++) {
                System.out.print(" ");
            }
            for (int b = 1; b <= a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }

        }


//        RIGHT SIDE TRIANGLE
        int number = 7;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= number; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


// HILL PATTERN TRIANGLE
        int countStar = 10;
        for (int a = 1; a <= countStar; a++) {
            for (int b = a; b <= countStar; b++) {
                System.out.print(" ");
            }
            for (int b = 1; b < a; b++) {
                System.out.print("*");
            }
            for (int b = 1; b <= a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }

         */

        // REVERSE HILL PATTERN

//        int reversePat = 10;
//        for (int a = 1; a <= reversePat; a++) {
//            for (int b = 1; b <= a; b++) {
//                System.out.print(" ");
//            }
//            for (int b = a; b < reversePat; b++) {
//                System.out.print("*");
//            }
//            for (int b = a; b <= reversePat; b++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }


        // DIAMOND PATTERN
/*
        int countStar = 9;
        for (int a = 1; a < countStar; a++) {
            for (int b = a; b <= countStar; b++) {
                System.out.print(" ");
            }
            for (int b = 1; b <= a; b++) {
                System.out.print("*");
            }
            for (int b = 1; b < a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int reversePat = 9;
        for (int a = 1; a <= reversePat; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print(" ");
            }
            for (int b = a; b <= reversePat; b++) {
                System.out.print("*");
            }
            for (int b = a; b < reversePat; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

 */
        int countStar = 6;
        for (int a = 1; a <= countStar; a++) {
            for (int b = a; b < countStar; b++) {
                System.out.print(" ");
            }
            for (int b = 1; b < a; b++) {
                System.out.print("2");
            }
            for (int b = 1; b < a; b++) {
                System.out.print("2");
                break;
            }
            for (int b = 1; b < 2; b++) {
                    System.out.println("1");
                    break;
                }
            }
            System.out.println();
        }
    }

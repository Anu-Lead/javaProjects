package Arrays;

import java.util.Date;
import java.util.Scanner;

public class AirlineReservationSystem {
    private static final int NOs_OF_SEATS = 13;
    private static final boolean[] seats = new boolean[NOs_OF_SEATS];
    private enum Class {
        FIRST, ECONOMIC, PRESIDENTIAL_CORNER;
    }

    public static void main(String[] args) {
        Scanner passengerInput = new Scanner(System.in);
        int passengerOption = 0;
        int seatNumber;

        while (passengerOption != 9) {
            System.out.print("========================\nPLEASE TYPE\n"
                    + "1. For First Class \n"
                    + "2. For Economy\n"
                    + "12. For Presidency. Exclusive for the President.\n"
                    + "9. to Quit.\n=======================\n"
                    + "\n==>> YOUR OPTION:\n");
            passengerOption = passengerInput.nextInt();

            switch (passengerOption) {
                case 1:
                    seatNumber = checkAvailableSeat(Class.FIRST);
                    if (seatNumber != -1) {
                        assignSeat(seatNumber);
                        displayBoardingPass(seatNumber, Class.FIRST);
                    } else {
                        seatNumber = checkAvailableSeat(Class.ECONOMIC);

                        if (seatNumber != -1) {
                            System.out.print("\nFirst Class is Full!\nAccepts To Be Placed in the Economic Section?\n1 - YES\n2 - NO\n Enter Your Option:");
                            passengerOption = passengerInput.nextInt();

                            if (passengerOption == 1) {
                                assignSeat(seatNumber);
                                displayBoardingPass(seatNumber, Class.ECONOMIC);
                            } else
                                System.out.println("\nNext Flight Leaves in 3 Hours.\n");
                        } else
                            System.out.println("\nNO MORE SEATS AVAILABLE. THE PLANE IS FULL.\n");
                    }
                    break;

                case 2:
                    seatNumber = checkAvailableSeat(Class.ECONOMIC);

                    if (seatNumber != -1) {
                        assignSeat(seatNumber);
                        displayBoardingPass(seatNumber, Class.ECONOMIC);
                    } else {
                        seatNumber = checkAvailableSeat(Class.FIRST);

                        if (seatNumber != -1) {
                            System.out.print(
                                    "\nWARNING!***\n" +
                                            "Economic section is full!\nAccepts to be Placed in the first-class section?\n1 - Yes\n2 - Not\nEnter your passengerOption: ");
                            passengerOption = passengerInput.nextInt();

                            if (passengerOption == 1) {
                                assignSeat(seatNumber);
                                displayBoardingPass(seatNumber, Class.FIRST);
                            } else
                                System.out.println("\nNext flight leaves in 3 hours.\n");
                        } else
                            System.out.println("\nNo More Seats Available. The Plane is Full.\n");
                    }
                    break;

                case 12:
                    seatNumber = checkAvailableSeat(Class.PRESIDENTIAL_CORNER);
                    if (seatNumber != -1) {
                        assignSeat(seatNumber);
                        displayBoardingPass(seatNumber, Class.PRESIDENTIAL_CORNER);
                        System.out.println("DEAR HIS EXCELLENCY, \nTHANK YOU! PRESIDENTIAL SEAT BOOKED SUCCESSFULLY");
                    }

                case 9:
                    break;

                default:
                    System.out.println("\nInvalid Option. Try Again.\n");
                    break;
            }
        }
        passengerInput.close();
    }

    public static void displayBoardingPass(int seatNumber, Class section) {
        System.out.println("\nCongratulations! Your Boarding Pass Details is Below:\n====================================================");
        Date date = new Date();
        System.out.println(date);
        System.out.printf("Seat number: %d%nClass: %s%n%n", seatNumber, section);
    }

    public static void assignSeat(int seatNumber) {
        seats[seatNumber] = true;
    }

    public static int checkAvailableSeat(Class section) {
        int seatNumber = -1;

        switch (section) {
            case FIRST:
                for (int i = 1; i <= NOs_OF_SEATS / 2; i++) {
                    if (seats[i] == false) {
                        seatNumber = i;
                        break;
                    }
                }
                break;

            case ECONOMIC:
                for (int i = NOs_OF_SEATS / 2 + 1; i < NOs_OF_SEATS; i++) {
                    if (seats[i] == false) {
                        seatNumber = i;
                        break;
                    }
                }
                break;

            case PRESIDENTIAL_CORNER:
                for (int president_seat = 12; president_seat < NOs_OF_SEATS; president_seat++) {
                    if (seats[president_seat] == false) {
                        seatNumber = president_seat;
                        break;
                    }
                }
                break;
        }
        return seatNumber;
    }
}
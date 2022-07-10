import java.util.Scanner;

public class Nokia {
    static int phoneBOOK;
    static int optionII;
    static int message;
    static int messageoptionSet1;
    static int messageoptionSet2;
    static int cHAT;
    static int callREGISTER;
    static int callDuration;
    static int tONES;
    static int sETTINGS;
    static int callDIVERTS;
    static int games;
    static int cALCULATOR;
    static int rEMINDER;
    static int cLOCK;
    static int pROFILE;
    static int simSERVICES;

    public static void main(String[] args) {
        for (int myphone = 1; myphone >= 1; myphone++) {
            Scanner input = new Scanner(System.in);
            System.out.printf("%s%n", "Press 0 to See PHONE MENU");
            int menu = input.nextInt();
            switch (menu) {
                case 0:
                    System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%n",
                            "==> MAIN MENU <==",
                            "1. Phone Book",
                            "2. Messages",
                            "3. Chat",
                            "4. Call Register",
                            "5. Tones",
                            "6. Settings",
                            "7. Call Diverts",
                            "8. Games",
                            "9. Calculator",
                            "10. Reminders",
                            "11. Clock",
                            "12. Profile",
                            "13. Sim Services",
                            "End!");
                    break;
            }
            System.out.println("========================================================");


            System.out.println("WELCOME TO PHONEBOOK");
            System.out.println("Press Any Number from 1 to 10 to View PHONEBOOK MENU.");
            phoneBOOK = input.nextInt();
            switch (phoneBOOK) {
                case 1:
                    System.out.println("Search");
                    break;
                case 2:
                    System.out.println("Services Nos 1");
                    break;
                case 3:
                    System.out.println("Add Name");
                    break;
                case 4:
                    System.out.println("Erase");
                    break;
                case 5:
                    System.out.println("Edit");
                    break;
                case 6:
                    System.out.println("Assign Tones");
                    break;
                case 7:
                    System.out.println("Send b'cards ");
                    break;
                case 8:
                    System.out.println("Options");

                    System.out.printf("%s%n", "Press 1 or 2 to View Options");
                    optionII = input.nextInt();
                    switch (optionII) {
                        case 1:
                            System.out.println("Type of Views");
                            break;
                        case 2:
                            System.out.println("Memory Status");

                            System.out.printf("%s%n", "Go to Next Item on Phone Book, Press 9 or 10");
                            phoneBOOK = input.nextInt();
                    }
                    switch (phoneBOOK) {
                    }
                case 9:
                    System.out.println("Speed Dials");
                    break;
                case 10:
                    System.out.println("Voice Tags");
                    break;
                default:
                    System.out.printf("%s%n%s%n", "You Press a Wrong Number, End of Phone Book", "=============================================");
                    break;
            }
            System.out.println("==================================================");


            System.out.println("WELCOME TO MESSAGE MENU");
            System.out.printf("%s%n", "Press Any Number from 1 to 10 to View Message Menu");
            message = input.nextInt();
            switch (message) {
                case 1:
                    System.out.println("Write Messages");
                    break;
                case 2:
                    System.out.println("Inbox");
                    break;
                case 3:
                    System.out.println("Outbox");
                    break;
                case 4:
                    System.out.println("Picture Messages");
                    break;
                case 5:
                    System.out.println("Templates");
                    break;
                case 6:
                    System.out.println("Smileys");
                    break;
                case 7:
                    System.out.println("Messages Settings");

                    System.out.println("Press 1, 2 or 3 to View Message Setting => SET 1");
                    messageoptionSet1 = input.nextInt();
                    switch (messageoptionSet1) {
                        case 1:
                            System.out.println("Message Center Number");
                            break;
                        case 2:
                            System.out.println("Message Sent As..");
                            break;
                        case 3:
                            System.out.println("Message Validity");

                    }
                    System.out.printf("%s%n%s%n", "End of Message Setting - SET 1", "Press 1, 2 or 3 to View Message Setting => COMMON");
                    messageoptionSet2 = input.nextInt();
                    switch (messageoptionSet2) {
                        case 1:
                            System.out.println("Delivery Report");
                            break;
                        case 2:
                            System.out.println("Reply Via Same Center");
                            break;
                        case 3:
                            System.out.println("Character Support");

                            System.out.printf("%s%n", "Go to Next Item on Message Menu, Press 8, 9 or 10");
                            message = input.nextInt();
                    }
                    switch (message) {
                    }
                case 8:
                    System.out.println("Info Service");
                    break;
                case 9:
                    System.out.println("Voice Mailbox Number");
                    break;
                case 10:
                    System.out.println("Service Command Editor");
                    break;
                default:
                    System.out.println("{Possibly a Wrong Number. End of Message Menu}");
            }
            System.out.printf("%s%n%s%n", "End of Message Menu", "==================================================");


            System.out.println("WELCOME TO CHAT MENU");
            System.out.printf("%s%n", "Press 1 to View Chat Menu");
            cHAT = input.nextInt();
            switch (cHAT) {
                case 1:
                    System.out.println("CHAT ==>> Chat is Empty Currently");
                    break;
                default:
                    System.out.println("Wrong Number");
            }
            System.out.printf("%s%n%s%n", "End of Chat Menu", "==================================================");


            System.out.println("WELCOME TO CALL REGISTER MENU");
            System.out.printf("%s%n", "Press 1 to 8 to View Call REGISTER MENU");
            callREGISTER = input.nextInt();
            switch (callREGISTER) {
                case 1:
                    System.out.println("Missed Calls");
                    break;
                case 2:
                    System.out.println("Received Calls");
                    break;
                case 3:
                    System.out.println("Dialled Numbers");
                    break;
                case 4:
                    System.out.println("Erase Recent Calls List");
                    break;
                case 5:
                    System.out.println("Show Call Duration");

                    System.out.println("Pressing 1 to 5 help to View Call Duration");
                    callDuration = input.nextInt();
                    switch (callDuration) {
                        case 1:
                            System.out.println("Last Call Duration");
                            break;
                        case 2:
                            System.out.println("All Calls' Duration");
                            break;
                        case 3:
                            System.out.println("Received Calls' Duration");
                            break;
                        case 4:
                            System.out.println("Dialled Calls' Duration");
                            break;
                        case 5:
                            System.out.printf("%s%n%s%n%s%n", "Clear Timers", "//////////////////////////", "End of Call Duration");
                            break;
                        default:
                            System.out.printf("%s%n%s", "You Can Press 6, 7 or 8 to View Next Items on Call Register Menu");
//                                    break;
                    }
            }
            switch (callREGISTER) {
                case 6:
                    System.out.println("Show Call Costs");
                    break;
                case 7:
                    System.out.println("Call Costs Settings");
                    break;
                case 8:
                    System.out.printf("%s%n%s%n%s%n", "Prepaid Credit", "///////////////////////////", "End of Call Register Menu");
                    break;
                default:
                    System.out.println("Return to Main Menu with Zer0. OR ===>>>");
            }
            System.out.printf("%s%n%s%n", "End of Call Register Menu", "==================================================");


            System.out.println("WELCOME TO TONE MENU");
            System.out.println("Press Any Number from 1 to 9 to View TONE MENU.");
            tONES = input.nextInt();
            switch (tONES) {
                case 1:
                    System.out.println("Ringing Tones");
                    break;
                case 2:
                    System.out.println("Ringing Volumes");
                    break;
                case 3:
                    System.out.println("Incoming Call Alert");
                    break;
                case 4:
                    System.out.println("Composer");
                    break;
                case 5:
                    System.out.println("Message Alert Tones");
                    break;
                case 6:
                    System.out.println("Keypad Tones");
                    break;
                case 7:
                    System.out.println("Warning and Gaming Tones");
                    break;
                case 8:
                    System.out.println("Vibrating Alert");
                    break;
                case 9:
                    System.out.printf("%s%n%s%n%s%n", "Screen Saver", "||||||||||||||||||||||||||", "End of Tone Menu");
                    break;
                default:
                    System.out.printf("%s%n%s%n", "End!", "Press 0 to Return to Main Menu OR");
                    break;
            }
            System.out.printf("%s%n%s%n", "End of Tone Menu", "==================================================");


            System.out.println("WELCOME TO SETTING MENU.");
            System.out.println("Press 1, 2, 3 or 4 to View Setting Menu.");
            sETTINGS = input.nextInt();
            switch (sETTINGS) {
                case 1:
                    System.out.println("#Call Setting#");
                    System.out.println("Pressing 1 to 6 help to View #Call Setting# Items");

                    sETTINGS = input.nextInt();
                    switch (sETTINGS) {
                        case 1:
                            System.out.println("Automatic Redial");
                            break;
                        case 2:
                            System.out.println("Speed Dialing");
                            break;
                        case 3:
                            System.out.println("Call Waiting Options");
                            break;
                        case 4:
                            System.out.println("Own Numbers Sending");
                            break;
                        case 5:
                            System.out.println("Phone Line in Use");
                            break;
                        case 6:
                            System.out.println("Automatic Answer");
                            System.out.println("You Can Press 2, 3 or 4 to View Other Items in ==> Settings Menu");
                            break;
                        default:
                            System.out.printf("%s%n%s%n", "You Can Press 2, 3 or 4 to View ==>", "Phone Settings, Security Settings, & Restore Factory Settings");
                    }
                case 2:
                    System.out.println("#Phone Setting");
                    System.out.println("Pressing 1 - 6 View  #Phone Setting");
                    sETTINGS = input.nextInt();
                    switch (sETTINGS) {
                        case 1:
                            System.out.println("Language");
                            break;
                        case 2:
                            System.out.println("Cell Info Display");
                            break;
                        case 3:
                            System.out.println("Welcome Note");
                            break;
                        case 4:
                            System.out.println("Networks Selection");
                            break;
                        case 5:
                            System.out.println("Lights");
                            break;
                        case 6:
                            System.out.printf("%s%n%s%n", "Confirm SIM Services Actions", "End!");
                            System.out.println("You Can Press 3 or 4 to View Other Items in ==> Settings Menu");
                            break;
                        default:
                            System.out.printf("%s%n%s%n", "You Can Press 3 or 4 to View ==>", "Security Settings, & Restore Factory Settings");
                    }
                case 3:
                    System.out.println("#Security Setting");
                    System.out.println("Pressing 1 - 6 View  #Security Setting");
                    sETTINGS = input.nextInt();
                    switch (sETTINGS) {
                        case 1:
                            System.out.println("PIN Code Request");
                            break;
                        case 2:
                            System.out.println("Call Barring Service");
                            break;
                        case 3:
                            System.out.println("Fixed Dialling");
                            break;
                        case 4:
                            System.out.println("Closed User Group");
                            break;
                        case 5:
                            System.out.println("Phone Security");
                            break;
                        case 6:
                            System.out.println("Change Access Codes");
                            break;
                        default:
                            System.out.println("You Can Press 4 to View ==> Restore Factory Settings");
                    }
                case 4:
                    System.out.println("#Factory Settings");
                    sETTINGS = input.nextInt();
                    switch (sETTINGS) {
                        case 1:
                            System.out.println("Restore Factory Setting");
                            break;
                        default:
                            System.out.println("End of Phone Settings Menu");

                    }
            }
            System.out.printf("%s%n%s%n", "End of Settings Menu", "==================================================");

            System.out.println("WELCOME TO CALL DIVERT MENU");
            System.out.println("Press 1 to View the Menu.");
            callDIVERTS = input.nextInt();
            switch (callDIVERTS) {
                case 1:
                    System.out.println("Call Diverts");
                    break;
                default:
                    System.out.println("Wrong Number, ");
            }
            System.out.printf("%s%n%s%n", "End of Call Divert Menu", "==================================================");


            System.out.println("WELCOME TO GAMES");
            System.out.println("Press 1 to View the Menu.");
            games = input.nextInt();
            switch (games) {
                case 1:
                    System.out.println("Games");
                    break;
                default:
                    System.out.println("Wrong Number");
            }
            System.out.printf("%s%n%s%n", "End of Games Menu", "==================================================");


            System.out.println("WELCOME TO CALCULATOR");
            System.out.println("Press 1 to View Calculator Menu.");
            cALCULATOR = input.nextInt();
            switch (cALCULATOR) {
                case 1:
                    System.out.println("Calculator");
                    break;
                default:
                    System.out.println("Wrong Number");
            }
            System.out.printf("%s%n%s%n", "End of Calculator Menu", "==================================================");


            System.out.println("WELCOME TO REMINDERS");
            System.out.println("Press 1 to View Reminder Menu.");
            rEMINDER = input.nextInt();
            switch (rEMINDER) {
                case 1:
                    System.out.println("Reminder");
                    break;
                default:
                    System.out.println("Wrong Number");
            }
            System.out.printf("%s%n%s%n", "End of Reminder Menu", "==================================================");


            System.out.println("WELCOME TO CLOCK MENU");
            System.out.println("Press 1 - 6 to View Clock Menu.");
            cLOCK = input.nextInt();
            switch (cLOCK) {
                case 1:
                    System.out.println("Alarm Clock");
                    break;
                case 2:
                    System.out.println("Clock Settings");
                    break;
                case 3:
                    System.out.println("Date Setting");
                    break;
                case 4:
                    System.out.println("Stop Watch");
                    break;
                case 5:
                    System.out.println("Count Down_Timer");
                    break;
                case 6:
                    System.out.println("Auto Update Date & Time");
                    break;
                default:
                    System.out.println("Wrong Number, ");
            }
            System.out.printf("%s%n%s%n", "End of Clock Menu", "==================================================");


            System.out.println("WELCOME TO PROFILE MENU");
            System.out.println("Press 1 to View Profile Menu.");
            pROFILE = input.nextInt();
            switch (pROFILE) {
                case 1:
                    System.out.println("Profiles");
                    break;
                default:
                    System.out.println("Wrong Number");
            }
            System.out.printf("%s%n%s%n", "End of Profile Menu", "==================================================");


            System.out.println("WELCOME TO SIM SERVICES");
            System.out.println("Press 1 to View Sim Service Menu.");
            simSERVICES = input.nextInt();
            switch (simSERVICES) {
                case 1:
                    System.out.println("SIM Services ==> MTN || GLO || AIRTEL");
                    break;
                default:
                    System.out.println("Wrong Number, End.");
            }
            System.out.println("END OF PHONE MENU");
        }
    }
}


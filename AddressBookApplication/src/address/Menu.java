package address;

import address.data.AddressEntry;

import java.util.Scanner;

public class Menu {
    public static void displayMenu(){
        Scanner menuScanner = new Scanner(System.in);
        System.out.println("Available Address Book Operations:");
        System.out.println("a) Load entries from file.");
        System.out.println("b) Add entry.");
        System.out.println("c) Remove entry.");
        System.out.println("d) Find entry.");
        System.out.println("e) List entries.");
        System.out.println("f) Quit application.");
        System.out.println("Enter an option:");
    }
    /*public void displayMenu(){
        do {
            //Get option
            Scanner menuScanner = new Scanner(System.in);
            String menuOption = menuScanner.nextLine();  // Read user input
            System.out.println("Available Address Book Operations:");
            System.out.println("a) Load entries from file.");
            System.out.println("b) Add entry.");
            System.out.println("c) Remove entry.");
            System.out.println("d) Find entry.");
            System.out.println("e) List entries.");
            System.out.println("f) Quit application.");
            System.out.println("Enter an option:");
            String menuOption = menuScanner.nextLine();  // Read user input

            switch(menuOption) {
                case "a": //Load entries from file

                    break;
                case "b": //Add a new AddressEntry

                    break;
                case "c": //Remove an AddressEntry

                    break;
                case "d": //Find - search by last name

                case "e": //List (dump addresses by last name)

                    break;
                case "f": //Quit
                    System.out.println("Exiting program");
                    quit = True;
                    break;
                default:
                    System.out.println("Incorrect input. Please enter an appropriate input.");
                    break;
            }

        };


    }*/
    public static String prompt_FirstName(){

        System.out.println("First name: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static String prompt_LastName(){

        System.out.println("Last name: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static String prompt_Street(){

        System.out.println("Street: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public static String prompt_City(){

        System.out.println("City: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static String prompt_State(){

        System.out.println("State: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static String prompt_Zip(){

        System.out.println("Zip: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static String prompt_Telephone(){

        System.out.println("Telephone: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static String prompt_Email(){

        System.out.println("Email: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}

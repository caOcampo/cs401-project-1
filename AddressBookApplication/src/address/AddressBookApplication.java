//Calvin Adrian Ocampo
package address;

import address.data.AddressBook;
import address.data.AddressEntry;

import java.util.Scanner;

/*
    In the main method of AddressBookApplication you are to create an instance of AddressBook (call it ab).
    NEXT, you are to create a method in your AddressBookApplication called void initAddressBookExercise(ab) that creates 2 instances of AddressEntry and places them in ab (an AddressBook) collection called AddressEntryList. NEXT, the initAddressBookExercise method it calls the AddressBook's ab.list() method.
    NOTE: The AddressBook's list() method cycles through the collection of AddresEntry objects using an iterator the contained in AddressBook and print outs the information to the console window calling toString() methods on each of its AddressEntry objects.
    Note: AddressEntry class must have a String toString() method that takes all of its data elements and composes a nicely formated string from its values and returns this string. Again refer to Project 1.
*/

public class AddressBookApplication {
    public static void main(String args[]) {
        //Create instance of addressbook application
        AddressBook ab = new AddressBook();
        Scanner scanner = new Scanner(System.in);

        boolean quit = false;
        do {
            Menu.displayMenu();
            String menuOption = scanner.nextLine();
            switch (menuOption) {
                case "a": //Load entries from file
                    System.out.println("Enter the directory of a file: ");
                    String newDir = scanner.nextLine();
                    ab.readFromFile(newDir);
                    break;
                case "b": //Add a new AddressEntry
                    ab.add();
                    break;
                case "c": //Remove an AddressEntry
                    System.out.println("Enter the last name of the person you want to remove: ");
                    String lname = scanner.nextLine();
                    ab.remove(lname);
                    break;
                case "d": //Find - search by last name
                    System.out.println("Enter the last name of the person you want to find: ");
                    String lastName = scanner.nextLine();
                    ab.find(lastName);
                case "e": //List (dump addresses by last name)
                    ab.list();
                    break;
                case "f": //Quit
                    System.out.println("Exiting program");
                    quit = true;
                    break;
                default:
                    System.out.println("Incorrect input. Please enter an appropriate input.");
                    break;
            }
        } while (!quit);
    }
}


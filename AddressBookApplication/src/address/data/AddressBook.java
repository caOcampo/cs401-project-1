package address.data;
import java.util.ArrayList;
import java.util.Objects;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import address.Menu;

public class AddressBook {
    public ArrayList<AddressEntry> AddressEntryList;

    public void list(){
        for (AddressEntry addressEntry : AddressEntryList) {
            System.out.println("First name: "+ addressEntry.getFirstName());
            System.out.println("Last name: "+ addressEntry.getLastName());
            System.out.println("Street: "+addressEntry.getStreet());
            System.out.println("City: "+addressEntry.getCity());
            System.out.println("State: "+addressEntry.getState());
            System.out.println("Zip: "+addressEntry.getZip());
            System.out.println("Telephone: "+addressEntry.getPhone());
            System.out.println("Email: "+addressEntry.getEmail());
            System.out.println();

        }
    }

    public void add(){
        Scanner menuScanner = new Scanner(System.in);


        String fName = Menu.prompt_FirstName();

        String lName =  Menu.prompt_LastName();

        String street = Menu.prompt_Street();

        String city = Menu.prompt_City();

        String state =Menu.prompt_State();

        int zip = Integer.parseInt((Menu.prompt_Zip()));

        String phone = Menu.prompt_Telephone();

        String email = Menu.prompt_Email();

        AddressEntry entry = new AddressEntry(fName, lName, street, state, city, zip, phone, email);
        AddressEntryList.add(entry);
    }

    public AddressBook(){
        AddressEntryList = new ArrayList<AddressEntry>();
    }

    public void remove(String lastName) {
        for (int i = 0; i < AddressEntryList.size(); i++) {
            if (Objects.equals(AddressEntryList.get(i).getLastName(), lastName)) {
                AddressEntryList.remove(AddressEntryList.get(i));
            }
        }
    }

    public void readFromFile(String filePath) {
        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] item = line.split(",");

                if (item.length == 8) {
                    //get firstName, lastName, street, city, state, zip, phone, email
                    String firstName = item[0].trim();
                    String lastName = item[1].trim();
                    String street = item[2].trim();
                    String city = item[3].trim();
                    String state = item[4].trim();
                    Integer zip = Integer.parseInt(item[5].trim());
                    String phone = item[6].trim();
                    String email = item[7].trim();
                    AddressEntry entry = new AddressEntry(firstName, lastName, street, state, city, zip, phone, email);

                    //Add it to the list
                    AddressEntryList.add(entry);
                } else {
                    System.out.println("Error, invalid CSV format in line" + line);
                }

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void find(String startOf_lastName){
        AddressBook Matches = new AddressBook();
        //Find the start of a student's last name that matches
        for (AddressEntry entry : AddressEntryList){
            if (entry.getLastName().toLowerCase().startsWith(startOf_lastName.toLowerCase())) {
                Matches.AddressEntryList.add(entry);
            }
        }
        Matches.list();
    }




}

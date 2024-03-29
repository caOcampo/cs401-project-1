package address.data;


public class AddressEntry {
    String firstName;
    String lastName;
    String street;
    String city;
    String state;
    Integer zip;
    String phone;
    String email;

    //Functions

    /**
     * Constructor with no parameters -- creates a Jane Doe entry
     */
    public AddressEntry(){ //Default constructor
        firstName = "Jane";
        lastName = "Doe";
        street = "1234";
        city = "Fremont";
        state = "CA";
        zip = 1234;
        phone = "13101111111";
        email = "jdoe@gmail.com";
    }

    /**
     * Constructor with parameters
     * @param firstName the entry's first name
     * @param lastName the entry's last name
     * @param street the entry's street
     * @param state  the entry's state
     * @param city the entry's city
     * @param zip the entry's zip code
     * @param phone the entry's phone number
     * @param email the entry's email
     */
    public AddressEntry(String firstName, String lastName, String street, String state, String city, Integer zip, String phone, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }

    /**
     * Prints the entry in strings
     */
    public String toString(){
        System.out.println("First name: "+ getFirstName());
        System.out.println("Last name: "+ getLastName());
        System.out.println("Street: "+getStreet());
        System.out.println("City: "+getCity());
        System.out.println("State: "+getState());
        System.out.println("Zip: "+getZip());
        System.out.println("Telephone: "+getPhone());
        System.out.println("Email: "+getEmail());
        System.out.println();
        return null;
    }

    //Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(Integer zip) {
        this.zip = zip;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    //Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public Integer getZip() {
        return zip;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }


}

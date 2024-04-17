public class Person extends TelephoneEntry{
    public final String firstName;
    public final String lastName;
    public final Address address;
    public final TelephoneNumber telephoneNumber;

    public Person(String firstName, String lastName, Address address, TelephoneNumber telephoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
    }

    @Override
    public Address getAddress() {
        return address;
    }

    @Override
    public TelephoneNumber getTelephoneNumber() {
        return telephoneNumber;
    }

    @Override
    public String description() {
        return "Person entry: \n" +
                "   first name: " + firstName + "\n" +
                "   last name: " + lastName + "\n" +
                "   address: " + address + "\n" +
                "   phone number: " + telephoneNumber + "\n";
    }
}

public class Company extends TelephoneEntry{
    public final String companyName;
    public final Address address;
    public final TelephoneNumber telephoneNumber;

    public Company(String companyName, Address address, TelephoneNumber telephoneNumber) {
        this.companyName = companyName;
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
        return "Company entry: \n" +
                "   companyName: " + companyName + "\n" +
                "   address: "+ address + "\n" +
                "   phone number: " + telephoneNumber + "\n";
    }
}

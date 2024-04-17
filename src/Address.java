public class Address {
    public final String postalCode;
    public final String city;
    public final String street;
    public final int houseNumber;

    public Address(String postalCode, String city, String street, int houseNumber) {
        this.postalCode = postalCode;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return "{" +
                "postalCode='" + postalCode + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                '}';
    }
}

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TelephoneBook {
    public static void main(String[] args) {
        TreeMap<TelephoneNumber, TelephoneEntry> contactList = new TreeMap<>();

        populateContactList(contactList);
        printTelephoneBook(contactList);
    }

    private static void printTelephoneBook(TreeMap<TelephoneNumber, TelephoneEntry> contactList) {

        for (Map.Entry<TelephoneNumber, TelephoneEntry> entry : contactList.entrySet()) {
            System.out.println(entry.getValue().description());
        }
    }

    private static void populateContactList(TreeMap<TelephoneNumber, TelephoneEntry> contactList) {
        Person person1 = new Person("John", "Doe", new Address("12-345", "City1",
                "Street1" , 1),  new TelephoneNumber(48, 1224567));
        Person person2 = new Person("Alice", "Smith", new Address("12-345", "City2",
                "Street2" , 2),  new TelephoneNumber(48, 237645678));
        Person person3 = new Person("Bob", "Schmidt", new Address("12-345", "City3",
                "Street3" , 3),  new TelephoneNumber(52, 111188111));
        Person person4 = new Person("Robert", "Afton", new Address("12-345", "City4",
                "Street4" , 4),  new TelephoneNumber(30, 908765984));

        Company company1 = new Company("ABC Inc.", new Address("12-555", "City1",
                "street1", 2), new TelephoneNumber(43, 456654311));
        Company company2 = new Company("XYZ Ltd.", new Address("12-335", "City3",
                "street3", 10), new TelephoneNumber(22, 876567887));

        contactList.put(person1.getTelephoneNumber(), person1);
        contactList.put(person2.getTelephoneNumber(), person2);
        contactList.put(person3.getTelephoneNumber(), person3);
        contactList.put(person4.getTelephoneNumber(), person4);
        contactList.put(company1.getTelephoneNumber(), company1);
        contactList.put(company2.getTelephoneNumber(), company2);
    }
}


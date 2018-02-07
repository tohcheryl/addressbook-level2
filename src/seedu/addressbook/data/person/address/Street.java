package seedu.addressbook.data.person.address;

/**
 * Represents the street of an address
 */
public class Street {

    private final String street;

    public Street(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    @Override
    public String toString() {
        return street;
    }
}
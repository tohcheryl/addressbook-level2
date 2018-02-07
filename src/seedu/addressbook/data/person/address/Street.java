package seedu.addressbook.data.person.address;

/**
 * Represents the street of an address
 */
public class Street {

    private String street;

    public Street(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return street;
    }
}
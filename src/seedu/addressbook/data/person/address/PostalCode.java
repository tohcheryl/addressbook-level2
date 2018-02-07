package seedu.addressbook.data.person.address;

/**
 * Represents the postal code of an address
 */
public class PostalCode {

    private final String postalCode;

    public PostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    @Override
    public String toString() {
        return postalCode;
    }
}

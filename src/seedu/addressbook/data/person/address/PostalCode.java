package seedu.addressbook.data.person.address;

/**
 * Represents the postal code of an address
 */
public class PostalCode {

    public final String postalCode;

    public PostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return postalCode;
    }
}

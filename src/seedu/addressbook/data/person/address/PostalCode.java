package seedu.addressbook.data.person.address;

/**
 * Represents the postal code of an address
 */
public class PostalCode {

    private String postalCode;

    public PostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return postalCode;
    }
}

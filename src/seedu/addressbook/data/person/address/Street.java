package seedu.addressbook.data.person.address;

public class Street {

    public final String street;

    public Street(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return street;
    }
}
package seedu.addressbook.data.person.address;

/**
 * Represents the unit of an address
 */
public class Unit {

    public final String unit;

    public Unit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return unit;
    }
}

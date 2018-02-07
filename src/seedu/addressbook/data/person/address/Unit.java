package seedu.addressbook.data.person.address;

/**
 * Represents the unit of an address
 */
public class Unit {

    private final String unit;

    public Unit(String unit) {
        this.unit = unit;
    }

    public String getUnit() {
        return unit;
    }

    @Override
    public String toString() {
        return unit;
    }
}

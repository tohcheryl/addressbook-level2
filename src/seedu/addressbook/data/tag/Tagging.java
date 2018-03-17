package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Person;

/**
 * Represents an adding or deleting of a tag for a specific person
 */
public class Tagging {

    private static final String ADD_PREFIX = "+ ";
    private static final String DELETE_PREFIX = "- ";

    private Person person;
    private Tag tag;
    private boolean isAdded;

    public Tagging(Person person, Tag tag, boolean isAdded) {
        this.person = person;
        this.tag = tag;
        this.isAdded = isAdded;
    }

    @Override
    public String toString() {
        return (isAdded ? ADD_PREFIX : DELETE_PREFIX) + person.getName() + " " + tag;
    }
}

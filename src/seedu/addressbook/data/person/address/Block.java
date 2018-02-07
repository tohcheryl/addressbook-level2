package seedu.addressbook.data.person.address;

/**
 * Represents the block of an address
 */
public class Block {

    public final String block;

    public Block(String block) {
        this.block = block;
    }

    @Override
    public String toString() {
        return block;
    }
}


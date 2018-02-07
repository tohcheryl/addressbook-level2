package seedu.addressbook.data.person.address;

/**
 * Represents the block of an address
 */
public class Block {

    private final String block;

    public Block(String block) {
        this.block = block;
    }

    public String getBlock() {
        return block;
    }

    @Override
    public String toString() {
        return block;
    }
}


package seedu.addressbook.data.person.address;

/**
 * Represents the block of an address
 */
public class Block {

    private String block;

    public Block(String block) {
        this.block = block;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    @Override
    public String toString() {
        return block;
    }
}


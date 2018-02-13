package seedu.addressbook.commands;

/* Sorts the list of persons in the address book by their names in alphabetical order */

public class SortCommand extends Command {

    public static final String COMMAND_WORD = "sort";
    public static final String MESSAGE_USAGE = "Sorts address book in alphabetical order.";
    public static final String MESSAGE_SUCCESS = "Address book has been sorted!";

    @Override
    public CommandResult execute() {
        addressBook.sortPersonsByName();
        return new CommandResult(MESSAGE_SUCCESS);
    }
}

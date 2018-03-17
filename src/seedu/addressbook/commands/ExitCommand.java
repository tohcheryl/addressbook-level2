package seedu.addressbook.commands;

import java.util.ArrayList;

import seedu.addressbook.data.tag.Tagging;

/**
 * Terminates the program.
 */
public class ExitCommand extends Command {

    public static final String COMMAND_WORD = "exit";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Exits the program.\n"
            + "Example: " + COMMAND_WORD;
    public static final String MESSAGE_EXIT_ACKNOWEDGEMENT = "Exiting Address Book as requested ...";

    @Override
    public CommandResult execute() {
        ArrayList<Tagging> taggings = addressBook.getTaggings();
        StringBuilder taggingsString = new StringBuilder();
        for (Tagging t: taggings) {
            taggingsString.append(t + "\n");
        }
        return new CommandResult(taggingsString.toString() + MESSAGE_EXIT_ACKNOWEDGEMENT);
    }

    public static boolean isExit(Command command) {
        return command instanceof ExitCommand; // instanceof returns false if it is null
    }
}

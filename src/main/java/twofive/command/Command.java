package twofive.command;

import twofive.data.TaskList;
import twofive.exception.TwoFiveException;
import twofive.storage.Storage;
import twofive.ui.Ui;

/**
 * Results in various actions being performed when commands are executed
 * in initialized subclasses of this class.
 */
public abstract class Command {
    /**
     * Returns boolean stating whether the command is a ByeCommand.
     *
     * @return true if command is a ByeCommand.
     */
    public boolean isExit() {
        return false;
    }

    /**
     * Executes actions given a list of tasks, a UI object and a Storage object.
     *
     * @param tasks List of all current tasks.
     * @param ui UI interacting with user.
     * @param storage Storage for saving or loading tasks.
     */
    public abstract void execute(TaskList tasks, Ui ui, Storage storage) throws TwoFiveException;
}

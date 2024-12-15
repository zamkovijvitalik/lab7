package work7;

import java.util.List;

/**
 * The MacroCommand class is a composite command that can execute a sequence of commands.
 */
public class MacroCommand implements Command {
    private List<Command> commands;

    /**
     * Constructs a MacroCommand with a list of commands.
     * @param commands A list of commands to execute sequentially.
     */
    public MacroCommand(List<Command> commands) {
        this.commands = commands;
    }

    /**
     * Executes all commands in the sequence.
     */
    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }
}

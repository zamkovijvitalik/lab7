package work7;

/**
 * The Invoker class asks the command to execute the request.
 * It holds a reference to the command and calls its execute method.
 */
public class Invoker {
    private Command command;

    /**
     * Sets the command to be executed.
     * @param command The command to set.
     */
    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * Executes the command by calling its execute method.
     */
    public void pressButton() {
        command.execute();
    }
}

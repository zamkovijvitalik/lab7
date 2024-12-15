package work7;

/**
 * ConcreteCommand2 class is a concrete implementation of the Command interface.
 * It triggers the second action in the Receiver.
 */
public class ConcreteCommand2 implements Command {
    private Receiver receiver;

    /**
     * Constructs a ConcreteCommand2 with a given receiver.
     * @param receiver The receiver that performs the action.
     */
    public ConcreteCommand2(Receiver receiver) {
        this.receiver = receiver;
    }

    /**
     * Executes the second action in the receiver.
     */
    @Override
    public void execute() {
        receiver.action2();
    }
}
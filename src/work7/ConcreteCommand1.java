package work7;

/**
 * ConcreteCommand1 class is a concrete implementation of the Command interface.
 * It triggers the first action in the Receiver.
 */
public class ConcreteCommand1 implements Command {
    private Receiver receiver;

    /**
     * Constructs a ConcreteCommand1 with a given receiver.
     * @param receiver The receiver that performs the action.
     */
    public ConcreteCommand1(Receiver receiver) {
        this.receiver = receiver;
    }

    /**
     * Executes the first action in the receiver.
     */
    @Override
    public void execute() {
        receiver.action1();
    }
}
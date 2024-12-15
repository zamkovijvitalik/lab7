import work7.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();

        Command command1 = new ConcreteCommand1(receiver);
        Command command2 = new ConcreteCommand2(receiver);
        MacroCommand macroCommand = new MacroCommand(Arrays.asList(command1, command2));

        Invoker invoker = new Invoker();

        invoker.setCommand(command1);
        invoker.pressButton();

        invoker.setCommand(command2);
        invoker.pressButton();

        invoker.setCommand(macroCommand);
        invoker.pressButton();
    }
}
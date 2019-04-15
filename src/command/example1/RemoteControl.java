package command.example1;

import java.util.Arrays;

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        Arrays.fill(onCommands, noCommand);
        Arrays.fill(offCommands, noCommand);
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void pushOnButton(int slot) {
        onCommands[slot].execute();
    }

    public void pushOffButton(int slot) {
        offCommands[slot].execute();
    }
}

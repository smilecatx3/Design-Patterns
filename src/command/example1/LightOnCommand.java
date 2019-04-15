package command.example1;

public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light l) {
        this.light = l;
    }

    @Override
    public void execute() {
        light.on();
    }
}

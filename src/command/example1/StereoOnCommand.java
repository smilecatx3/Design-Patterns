package command.example1;

public class StereoOnCommand implements Command {
    private Stereo stereo;

    public StereoOnCommand(Stereo s) {
        this.stereo = s;
    }

    @Override
    public void execute() {
        stereo.on();
    }
}

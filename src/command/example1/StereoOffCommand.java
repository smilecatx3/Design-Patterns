package command.example1;

public class StereoOffCommand implements Command {
    private Stereo stereo;

    public StereoOffCommand(Stereo s) {
        this.stereo = s;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}

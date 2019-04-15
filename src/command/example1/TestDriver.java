package command.example1;

public class TestDriver {
    public static void main(String[] args) {
        // Create receiver instances
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        Stereo stereo = new Stereo("Living Room");

        // Create command instances
        Command livingRoomLightOn = new LightOnCommand(livingRoomLight);
        Command livingRoomLightOff = new LightOffCommand(livingRoomLight);
        Command kitchenLightOn = new LightOnCommand(kitchenLight);
        Command kitchenLightOff = new LightOffCommand(kitchenLight);
        Command stereoOn = new StereoOnCommand(stereo);
        Command stereoOff = new StereoOffCommand(stereo);

        // Set commands to invoker
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, stereoOn, stereoOff);

        // Test our remote controller
        remoteControl.pushOnButton(0);
        remoteControl.pushOffButton(0);
        remoteControl.pushOnButton(1);
        remoteControl.pushOffButton(1);
        remoteControl.pushOnButton(2);
        remoteControl.pushOffButton(2);
    }
}

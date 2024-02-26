package classWork;

public class App {
	public static void main(String[] args) {
        Light light = new Light();
        Iron iron = new Iron();

        Command[] commands = {new LightOnCommand(light), new IronOnCommand(iron)};
        
        SimpleRemoteControl remoteControl = new SimpleRemoteControl(commands);

        remoteControl.pressButton(0); // Turn on the light
        remoteControl.pressButton(1); // Turn on the Iron
    }

}
